package com.cawbutler.springboot.swagger.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置文件类
 *
 * @EnableSwagger2：开启Swagger2功能
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//这个方法的作用（生成接口的时候页面显示的信息）
                .select()//表示的是选择哪些路径和API生成文档
                .apis(RequestHandlerSelectors
                        .basePackage("com.cawbutler.springboot.swagger.demo.controller"))//告诉他要扫描的接口存在的这个包
                .paths(PathSelectors.any())//对所有的API进行监控
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2")
                .description("Swagger2 学习")
                .termsOfServiceUrl("www.baidu.com")//更新服务条款url
                .version("1.0.0")
                .build();
    }

}
