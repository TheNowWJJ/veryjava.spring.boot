package cn.veryjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ProfilesApplication {

  @Autowired
  private VeryJavaProperties properties;

  public static void main(String[] args) {
    SpringApplication.run(ProfilesApplication.class, args);
  }

  @RequestMapping("/profiles")
  @ResponseBody
  public String profiles() {
    return properties.getName();
  }
}
