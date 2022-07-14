package com.example.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration    // 表示当前类是一个自定义配置类
@ConfigurationProperties(prefix = "test") // 将配置文件中以person开头的属性注入到该类中
@EnableConfigurationProperties(MyProperties.class) // 开启对应配置类的属性注入功能
@PropertySource("classpath:test.properties") // 指定自定义配置文件的位置和名称
public class MyProperties {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
