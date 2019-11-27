package com.cer.mall.mylitemall.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @ClassName: YmlConfig
 * @Description: TODO yml配置文件获取
 * @Author: xujin
 * @Date: 2019/11/27 16:17
 * @Version: 1.0
 */


@Component
@PropertySource("classpath:application.yml")
@ConfigurationProperties(prefix = "info")
public class YmlConfig {
    private String name;

    public String getName() {
        return name;
    }
}
