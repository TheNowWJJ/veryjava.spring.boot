package cn.veryjava;

import cn.veryjava.datasources.domain.SystemUser;
import cn.veryjava.datasources.domain.User;
import cn.veryjava.datasources.jdbcmapper.UserMapper;
import cn.veryjava.datasources.ssabmapper.SysUserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DataSourceApplication.class)
public class DataSourceApplicationTests {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private SysUserMapper sum;

  @Test
  @Rollback
  public void testJDBCDataSource() {
    userMapper.insert("AAA", 20);
    User u = userMapper.findByName("AAA");
    Assert.assertEquals(20, u.getAge());
  }

  @Test
  @Rollback
  public void testSSABDataSource(){
    SystemUser user = sum.findById(1l);
    Assert.assertNotEquals(null,user);
    System.out.println(user);
  }

}
