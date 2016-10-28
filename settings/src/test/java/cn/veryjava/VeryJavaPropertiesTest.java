package cn.veryjava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-28.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SettingsApplication.class)
public class VeryJavaPropertiesTest {

  @Value("${veryjava.name}")
  private String name;

  @Value("${veryjava.object}")
  private String object;

  @Value("${veryjava.age}")
  private String age;

  @Autowired
  private VeryJavaProperties properties;

  @Test
  public void testProperties1() {
    System.out.println(name);
    System.out.println(object);
    System.out.println(age);
  }

  @Test
  public void testProperties2() {
    System.out.println(properties.getName());
    System.out.println(properties.getAge());
    System.out.println(properties.getObject());
  }

  @Test
  public void testRandom() {
    System.out.println(properties.getMy().getSecret());
    System.out.println(properties.getMy().getNumber());
    System.out.println(properties.getMy().getBignumber());
    System.out.println(properties.getMy().getUuid());
    System.out.println(properties.getMy().getLessThanTen());
    System.out.println(properties.getMy().getInRange());
  }

}