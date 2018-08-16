package com.emrubik.springcloud.server.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emrubik.springcloud.server.web.service.ComputeClient;

@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(Integer a,Integer b) {
        Integer c = a+b ;
        return c + computeClient.add(a, b);
    }

}