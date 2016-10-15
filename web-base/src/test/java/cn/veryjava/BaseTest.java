package cn.veryjava;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

public class BaseTest {
  @Autowired
  private WebApplicationContext context;

  private MockMvc mvc;

  @Before
  public void setUp() {
    this.setMvc(MockMvcBuilders.webAppContextSetup(this.context).build());
  }

  public MockHttpServletResponse doGet(String url) throws Exception {
    ResultActions ra = this.getMvc().perform(get(url));
    return ra.andReturn().getResponse();

  }

  public MockHttpServletResponse doPost(String url, Object params) throws Exception {
    ObjectMapper om = new ObjectMapper();
    ResultActions ra = this.getMvc()
     .perform(post(url).content(om.writeValueAsString(params)).contentType(MediaType
      .APPLICATION_JSON));
    return ra.andReturn().getResponse();
  }

  public MockHttpServletResponse doPatch(String url, Object params) throws Exception {
    ObjectMapper om = new ObjectMapper();
    ResultActions ra = this.getMvc()
     .perform(patch(url).content(om.writeValueAsString(params)).contentType(MediaType
      .APPLICATION_JSON));
    return ra.andReturn().getResponse();
  }

  public MockHttpServletResponse doPut(String url, Object params) throws Exception {
    ObjectMapper om = new ObjectMapper();

    ResultActions ra = this.getMvc().perform(put(url, om.writeValueAsString(params))
     .contentType(MediaType.APPLICATION_JSON));

    return ra.andReturn().getResponse();
  }

  public MockHttpServletResponse doDelete(String url, Object params) throws Exception {
    ObjectMapper om = new ObjectMapper();

    ResultActions ra = this.getMvc().perform(delete(url, om.writeValueAsString(params))
     .contentType(MediaType.APPLICATION_JSON));

    return ra.andReturn().getResponse();
  }

  public MockMvc getMvc() {
    return mvc;
  }

  public void setMvc(MockMvc mvc) {
    this.mvc = mvc;
  }

}
