package com.laungcisin.springboot.rocketmq.web;

import com.laungcisin.springboot.rocketmq.entity.Subscribe;
import com.laungcisin.springboot.rocketmq.service.subscribe.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscribeController {

    @Autowired
    private SubscribeService subscribeService;

    @GetMapping("/subscribe/{id}")
    public Subscribe subscribe(@PathVariable Integer id) {
        return subscribeService.getSubscribeById(id);
    }
}
