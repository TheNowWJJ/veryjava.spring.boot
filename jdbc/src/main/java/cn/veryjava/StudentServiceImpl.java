package cn.veryjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-13.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Service
public class StudentServiceImpl implements StudentService {

  @Autowired
  private JdbcTemplate jdbc;

  @Override
  public List select() {
    return jdbc.queryForList("SELECT * FROM STUDENT");
  }

  @Override
  public void add() {
    jdbc.update("INSERT INTO STUDENT(ID,NAME,AGE)VALUES(4,'NAME4',14)");
  }

  @Override
  public void update() {
    jdbc.update("UPDATE STUDENT SET NAME='NAME44' WHERE ID=4");
  }

  @Override
  public void delete() {
    jdbc.update("DELETE FROM STUDENT WHERE ID=1");
  }
}
