package com.laungcisin.springboot.rocketmq.dao;

import com.laungcisin.springboot.rocketmq.entity.Subscribe;

import java.util.List;

public interface SubscribeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Subscribe record);

    int insertSelective(Subscribe record);

    Subscribe selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subscribe record);

    int updateByPrimaryKey(Subscribe record);

    List<Subscribe> findAllSubscribe();
}