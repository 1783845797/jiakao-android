package com.hqhcn.android.service.impl;

import com.hqh.android.dao.ExamKfMapper;
import com.hqh.android.entity.ExamKf;
import com.hqh.android.entity.ExamKfExample;
import com.hqh.android.entity.Exampreasign;
import com.hqh.android.service.ExamKfService;
import com.hqh.android.service.ExamProcService;
import com.hqh.android.service.ExamineeService;
import com.hqh.android.tool.AttrUtils;
import com.hqh.android.tool.hikvision.DvrPicHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;

@Service
@Transactional(rollbackFor = Exception.class)
public class ExamKfServiceImpl implements ExamKfService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ExamKfMapper mapper;
    @Autowired
    ExamProcService procService;
    @Autowired
    ExamineeService examineeService;

    @Override
    public void insert(ExamKf entity, String jlcxh) {
        String picPath = AttrUtils.考试过程图片文件夹路径 + File.separator + entity.getLsh() + "_" + entity.getKscs() + "_" + entity.getKsxm() + "_" + entity.getKfxm() + System.currentTimeMillis() + ".jpg";
        entity.setPic(picPath);
        DvrPicHelper.getPic(jlcxh, entity.getKsxm(), picPath);
        mapper.insert(entity);

        Exampreasign exampreasign = examineeService.queryByLsh(entity.getLsh());

        Exampreasign exampreasign1 = new Exampreasign();
        exampreasign1.setLsh(entity.getLsh());
        exampreasign1.setKscj(exampreasign.getKscj() - entity.getKfz());
        examineeService.updateSelective(exampreasign1);

    }

    @Override
    public List<ExamKf> query(ExamKfExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public List<ExamKf> query(String lsh, String kskm, int kscs) {
        ExamKfExample example = new ExamKfExample();
        if (-1 == kscs) {
            example.createCriteria().andLshEqualTo(lsh).andKskmEqualTo(kskm).andKscsIsNotNull();
        } else {
            example.createCriteria().andLshEqualTo(lsh).andKskmEqualTo(kskm).andKscsEqualTo(kscs);
        }
        return query(example);
    }

    @Override
    public List<ExamKf> query(String lsh, String kskm, String ksxm, int kscs) {
        ExamKfExample example = new ExamKfExample();
        ExamKfExample.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotEmpty(lsh)) {
            criteria.andLshEqualTo(lsh);
        }
        if (StringUtils.isNotEmpty(kskm)) {
            criteria.andKskmEqualTo(kskm);
        }
        if (StringUtils.isNotEmpty(ksxm)) {
            criteria.andKsxmEqualTo(ksxm);
        }
        if (-1 == kscs) {
            criteria.andKscsIsNotNull();
        } else {
            criteria.andKscsEqualTo(kscs);
        }
        return query(example);
    }

    @Override
    public void updateSelective(ExamKf entity) {
        mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public void moveByKscs(String lsh, String kskm, int ori, int des) throws Exception {
        List<ExamKf> kfs = query(lsh, kskm, ori);
        for (ExamKf kf : kfs) {
            // 移到另外的考试次数,图片重命名

            kf.setKscs(des);
            String pic = kf.getPic();
            String picNewPath = procService.generatePicName(lsh, kf.getKsxm() + "_" + kf.getKfxm(), des, UUID.randomUUID().toString());
            if (StringUtils.isNotEmpty(pic) && new File(pic).exists()) {
                kf.setPic(picNewPath);
            }
            updateSelective(kf);

            if (StringUtils.isNotEmpty(pic) && new File(pic).exists()) {
                Files.move(new File(pic).toPath(), new File(picNewPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }

            try {
                if (StringUtils.isNotEmpty(pic) && new File(pic).exists()) {
                    Files.move(new File(pic).toPath(), new File(picNewPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (Exception e) {
                logger.error("图片文件处理失败,已回滚", e);
                throw new Exception("图片文件处理失败");
            }
        }
    }
}
