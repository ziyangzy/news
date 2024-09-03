package com.heima.wemedia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//扫描降级代码类的包
@ComponentScan("com.heima.apis")
public class InitConfig {
}