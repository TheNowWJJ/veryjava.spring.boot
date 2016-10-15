package cn.veryjava;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {WebBaseApplication.class, MockServletContext.class})
@WebAppConfiguration
public class WebBaseApplicationTests extends BaseTest {

  @Test
  public void getHello() throws Exception {
    Assert.assertEquals("Hello World! Hello Spring Boot!", doGet("/hello").getContentAsString());
  }

}
