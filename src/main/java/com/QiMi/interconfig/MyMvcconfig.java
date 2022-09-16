package com.QiMi.interconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//（4）后端配置登录拦截器，如果没有登录，则不能跳到用户列表（5分）
//@Configuration
public class MyMvcconfig  implements WebMvcConfigurer {
    @Autowired
    private Myintercom myintercom;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myintercom)
                .addPathPatterns("/**")
                .excludePathPatterns("/","/","/");
    }

}
