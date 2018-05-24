package com.hqhcn.android.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisCache {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public final static String CAHCENAME = "cache";// 缓存名
    public final static int CAHCETIME = 60;// 默认缓存时间


    /**
     * 模糊删除所有key
     *
     * @param pattern
     */
    public void deleteCacheWithPattern(String pattern) {
        Set<String> keys = redisTemplate.keys(pattern);
        redisTemplate.delete(keys);
    }

    /**
     * 设置一天的缓存
     *
     * @param key
     * @param value
     */
    public void setOneDay(String key,String value){
        ValueOperations<String,String> record = stringRedisTemplate.opsForValue();
        record.set(key,value,24, TimeUnit.HOURS);
    }

    public void append(String key,String value){
        ValueOperations<String,String> record = redisTemplate.opsForValue();
        record.append(key,value);
    }

    public String get(String key){
        ValueOperations<String,String> record = redisTemplate.opsForValue();
        return record.get(key)==null?"":record.get(key);
    }

    /**
     * 清空所有缓存
     */
    public void clearCache() {
        deleteCacheWithPattern(RedisCache.CAHCENAME + "|*");
    }


    /**
     * 生成 缓存 key
     *
     * @param lsh  流水号
     * @param ksxm 考试项目
     * @param kscs 考试次数
     * @return 缓存key
     */
    public String GPSKey(String lsh, String ksxm, int kscs) {
        return "GPS_" + lsh + "_" + ksxm + "_" + kscs;
    }
}
