package cn.veryjava;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyBatisApplication.class)
public class MybatisApplicationTests {

  @Autowired
  private UserMapper userMapper;

  @Test
  @Rollback
  public void testInsert() {
    userMapper.insert("AAA", 20);
    User u = userMapper.findByName("AAA");
    Assert.assertEquals(20, u.getAge());
  }


  @Test
  public void testFindByName() {
    User user = userMapper.findByName("admin");

    Assert.assertNotEquals(null, user);
  }
}
