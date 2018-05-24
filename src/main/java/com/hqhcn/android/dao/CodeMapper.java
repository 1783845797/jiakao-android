package com.hqhcn.android.dao;

import com.hqh.android.entity.Code;
import com.hqh.android.entity.CodeExample;
import com.hqh.android.entity.CodeKey;
import com.hqh.android.entity.CodeWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CodeMapper {
    long countByExample(CodeExample example);

    int deleteByExample(CodeExample example);

    int deleteByPrimaryKey(CodeKey key);

    int insert(CodeWithBLOBs record);

    int insertSelective(CodeWithBLOBs record);

    List<CodeWithBLOBs> selectByExampleWithBLOBs(CodeExample example);

    List<Code> selectByExample(CodeExample example);

    CodeWithBLOBs selectByPrimaryKey(CodeKey key);

    int updateByExampleSelective(@Param("record") CodeWithBLOBs record, @Param("example") CodeExample example);

    int updateByExampleWithBLOBs(@Param("record") CodeWithBLOBs record, @Param("example") CodeExample example);

    int updateByExample(@Param("record") Code record, @Param("example") CodeExample example);

    int updateByPrimaryKeySelective(CodeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CodeWithBLOBs record);

    int updateByPrimaryKey(Code record);

    /**
     * 加载code表,返回{"xtlb":xtlb,"dmlb":dmlb,"dmz":dmz,"dmsm1":dmsm1}集合
     *
     * @return
     */
    List<Map> loadCodeMap();
}