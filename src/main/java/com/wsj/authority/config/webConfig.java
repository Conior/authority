package com.wsj.authority.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wangshijian
 * @Description:
 * @date 2020/12/9 5:29 下午
 */
@Configuration
public class webConfig implements WebMvcConfigurer {
    @Bean
    public LocaleResolverConfig localeResolver(){
        return new LocaleResolverConfig();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login/login");
        registry.addViewController("/login").setViewName("login/login");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/console").setViewName("console");

        // 角色
        registry.addViewController("/role/role-list").setViewName("role/role-list");
        registry.addViewController("/role/role_operation").setViewName("role/role_operation");


    }
}
