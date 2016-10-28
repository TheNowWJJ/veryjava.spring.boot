package cn.veryjava;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
@SpringBootTest(classes = ProfilesApplication.class)
public class VeryJavaPropertiesTest {

  @Autowired
  private VeryJavaProperties properties;

  @Test
  public void testProfile() {
    Assert.assertEquals(null, properties);
  }
}