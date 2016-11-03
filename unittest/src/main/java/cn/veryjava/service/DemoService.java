package cn.veryjava.service;

import org.springframework.stereotype.Service;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.service.
 * 作者: barton.
 * 日期: 16-11-3.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Service
public class DemoService {

  public String demo(String name) {
    return "Hello World! Hello " + name + "!";
  }
}
