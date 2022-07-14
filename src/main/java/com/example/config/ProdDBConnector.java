package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "prod")
public class ProdDBConnector implements DBConnector{
    @Override
    public String configure() {
        System.out.println("数据库配置环境prod");
        return "数据库配置环境prod";
    }
}
