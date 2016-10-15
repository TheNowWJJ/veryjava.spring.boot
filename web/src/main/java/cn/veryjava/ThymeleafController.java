package cn.veryjava;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-12.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Controller
public class ThymeleafController {
  @RequestMapping("/thymeleaf")
  public String index(Model model) {
    Person single = new Person("aa", 11);

    List<Person> people = new ArrayList<>();

    Person p1 = new Person("xx", 11);
    Person p2 = new Person("yy", 22);
    Person p3 = new Person("zz", 33);

    people.add(p1);
    people.add(p2);
    people.add(p3);

    model.addAttribute("singlePerson", single);
    model.addAttribute("people", people);

    return "thymeleaf";
  }
}
