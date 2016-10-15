package cn.veryjava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-12.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@RestController
@RequestMapping
public class HelloController {

  @RequestMapping(value = "hello", method = RequestMethod.GET)
  public String hello() {
    return "Hello World! Hello Spring Boot!";
  }
}
