package cn.veryjava.controller;

import cn.veryjava.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.controller.
 * 作者: barton.
 * 日期: 16-11-3.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@RestController
public class DemoController {

  @Autowired
  private DemoService demoService;

  @RequestMapping(value = "/demo",method = RequestMethod.GET)
  public String demo(String name) {
    return demoService.demo(name);
  }
}
