package com.example.cloudconsumer.controller;

import com.example.cloudproviderapi.service.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zjw
 * @Date 2020/10/4 19:17
 * @DESC
 */
@RefreshScope
@RestController
public class ConsumerController {

    @Value("${type}")
    private String type;

    @Reference
    private ProviderService providerService;

    @GetMapping("/getMsg")
    public String getMsg() {
        return type;
    }

    @GetMapping("/getProvider")
    public String getProvider() {
        return providerService.getProvider();
    }

}
