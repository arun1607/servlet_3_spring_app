package com.app.learning.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = { "com.app.learning" })
@Import({ SecurityConfig.class, WebConfig.class })
public class AppConfig {

}
