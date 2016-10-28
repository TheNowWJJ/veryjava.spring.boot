package cn.veryjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SettingsApplication {

  @Autowired
  private VeryJavaProperties properties;

  public static void main(String[] args) {
    SpringApplication.run(SettingsApplication.class, args);
  }

  @RequestMapping("/settings")
  @ResponseBody
  public String settings(){
    return properties.getName();
  }
}
