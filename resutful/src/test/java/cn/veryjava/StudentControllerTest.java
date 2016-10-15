package cn.veryjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-12.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RestfulApplication.class, MockServletContext.class})
public class StudentControllerTest extends BaseTest {

  @Test
  public void testGet() throws Exception {
    String response = doGet("/students").getContentAsString();
    ObjectMapper om = new ObjectMapper();
    List list = om.readValue(response, List.class);

    list.forEach(l -> System.out.println(((Map) l).get("id")));
  }

  @Test
  public void testAdd() throws Exception {
    Student student = new Student(4l, 15, "s5");
    String response = doPost("/students", student).getContentAsString();
    System.out.println(response);
  }

  @Test
  public void testUpdate() throws Exception {

    MockMvc mvc = MockMvcBuilders.standaloneSetup(new StudentController()).build();
    RequestBuilder e = put("/students/1").param("name", "update s1 's name").param
     ("age", "24");
    String response = mvc.perform(e).andReturn().getResponse().getContentAsString();
    System.out.println(response);
  }

  @Test
  public void testDelete() throws Exception {
    MockMvc mvc = MockMvcBuilders.standaloneSetup(new StudentController()).build();
    RequestBuilder e = delete("/students/1");
    String response = mvc.perform(e).andReturn().getResponse().getContentAsString();
    System.out.println(response);
  }
}