package cn.veryjava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-17.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Controller
public class ErrorController {
  @RequestMapping("/404")
  public String page404() {
    return "error/404";
  }

  @RequestMapping("/500")
  public String page500() {
    return "error/500";
  }
}
