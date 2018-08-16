package com.emrubik.springcloud.server.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ProperitesController {

    @Value("${database.driver}")
    private String driver;

    @RequestMapping("/driver")
    public String from() {
        return this.driver;
    }
}
