package com.hqhcn.android.tool.swagger.config;


import com.google.common.base.Predicates;
import com.hqh.android.tool.swagger.annotation.SwaggerIgnore;
import com.hqh.android.tool.swagger.annotation.SwaggerShow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.hqh.android.tool.swagger.config.SwaggerResponseMessage.buildResponseMessages;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .apis(Predicates.and(RequestHandlerSelectors.withClassAnnotation(SwaggerShow.class)))
                .apis(Predicates.not(RequestHandlerSelectors.withClassAnnotation(SwaggerIgnore.class)))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(SwaggerCustomApiInfo.apiInfo())
                .useDefaultResponseMessages(false)
                .globalResponseMessage(RequestMethod.POST, buildResponseMessages())
                .globalResponseMessage(RequestMethod.GET, buildResponseMessages());
    }

}



