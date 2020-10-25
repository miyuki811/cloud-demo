package com.example.cloudprovider.service.impl;

import com.example.cloudproviderapi.service.ProviderService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @Author zjw
 * @Date 2020/10/4 19:57
 * @DESC
 */
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String getProvider() {
        return "调用服务成功";
    }

}
