package com.laungcisin.springboot.rocketmq.service.subscribe;

import com.laungcisin.springboot.rocketmq.dao.SubscribeMapper;
import com.laungcisin.springboot.rocketmq.entity.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscribeService {
    @Autowired
    private SubscribeMapper subscribeMapper;

    public Subscribe getSubscribeById(Integer id) {
        return subscribeMapper.selectByPrimaryKey(id);
    }

    public List<Subscribe> findAllSubscribe() {
        return subscribeMapper.findAllSubscribe();
    }
}
