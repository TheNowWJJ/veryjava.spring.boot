package cn.veryjava;

/**
 * 描述: TODO:
 * 包名: barton.mybatis.bean.
 * 作者: barton.
 * 日期: 16-9-1.
 * 项目名称: mybatis
 * 版本: 1.0
 * JDK: since 1.8
 */
public class User {
  private long id;
  private String name;
  private int age;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
