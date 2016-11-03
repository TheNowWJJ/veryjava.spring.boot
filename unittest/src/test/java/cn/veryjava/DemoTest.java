package cn.veryjava;

import cn.veryjava.service.DemoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-11-3.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {UnitTestApplication.class, MockServletContext.class})
public class DemoTest {

  @Autowired
  private DemoService demoService;

  @Autowired
  private WebApplicationContext context;

  @Test
  public void testDemo() {
    Assert.assertEquals("Hello World! Hello sunshineasbefore!", demoService.demo("sunshineasbefore"));
  }

  @Test
  public void testControllerDemo() throws Exception {
    MockMvc mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    RequestBuilder e = get("/demo").param("name", "sunshineasbefore");
    String response = mvc.perform(e).andReturn().getResponse().getContentAsString();
    Assert.assertEquals("Hello World! Hello sunshineasbefore!", response);
  }
}
