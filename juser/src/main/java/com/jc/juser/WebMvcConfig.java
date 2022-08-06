package com.jc.juser;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author ZhangFan
 * @Description //配置授权拦截器
 * @Date 13:12 2022/7/31
 * @Param
 * @return
 **/

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * @Author ZhangFan
     * @Description //配置默认访问页面。
     * 注：代替controller写空方法 适用于get访问，post访问需重定向：redirect
     * @Date 13:05 2022/7/31
     * @Param [registry]
     * @return void
     **/

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //setViewName 为页面名称。ViewController 为访问路径
        registry.addViewController("/").setViewName("login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);//设置优先级
    }
}
