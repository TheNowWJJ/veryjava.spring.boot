package cn.veryjava;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-13.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JdbcApplication.class)
public class StudentServiceTest {

  @Autowired
  private StudentService service;

  @Test
  public void select() throws Exception {
    service.select().forEach(student -> System.out.println(student));
  }

  @Test
  public void add() throws Exception {
    service.add();
    select();
  }

  @Test
  public void update() throws Exception {
    service.update();
    select();
  }

  @Test
  public void delete() throws Exception {
    service.delete();
    select();
  }

}