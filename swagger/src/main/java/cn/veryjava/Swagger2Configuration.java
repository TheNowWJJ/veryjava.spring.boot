package cn.veryjava;

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
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-13.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
     .title("应用接口文档")
     .description("应用接口文档 1.0版本")
     .version("1.0")
     .build();
  }

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
     .apiInfo(apiInfo())
     .select()
     .apis(RequestHandlerSelectors.basePackage("cn.veryjava.swagger2"))
     .paths(PathSelectors.any())
     .build();
  }
}
