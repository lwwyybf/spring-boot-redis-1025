package com.lww.springbootredis1025.service;

public interface RedisService {

    /**
     * 保存数据
     * @param key
     * @param value
     * @return
     */
    boolean set(String key,String value);

    /**
     * 根据key取值
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置有效天数
     * @param key
     * @param expire
     * @return
     */
    boolean expire(String key,long expire);

    /**
     * 根据key取值
     * @param key
     * @return
     */
    boolean remove(String key);

}
