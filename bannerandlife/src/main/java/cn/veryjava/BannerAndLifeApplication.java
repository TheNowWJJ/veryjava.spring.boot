package cn.veryjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@Configuration
public class BannerAndLifeApplication extends ApplicationObjectSupport {

  @Autowired
  private ExitCodeConfig exitCodeConfig;

  public static void main(String[] args) {
    SpringApplication.run(BannerAndLifeApplication.class, args);
  }

  @RequestMapping("/exit")
  @ResponseBody
  public String exit() {
    SpringApplication.exit(super.getApplicationContext(), exitCodeConfig);
    return "ok";
  }

}
