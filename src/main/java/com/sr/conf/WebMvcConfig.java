package com.sr.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Value("${uploadFile.resourceHandler}")
    private String resourceHandler;

    @Value("${uploadPath}")
    private String location;
    /**
     * 虚拟映射
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        // 就是说 url （http://localhost:8080/flow/upload_flowChart/xxxxxxx.jpg）
        //中出现 resourceHandler 匹配时，则映射到 location 中去,location 相当于虚拟的，被映射的路径
        // 映射本地文件时，开头必须是 file:/// 开头，表示协议
        registry.addResourceHandler(resourceHandler).addResourceLocations("file:" + location);

    }

}
