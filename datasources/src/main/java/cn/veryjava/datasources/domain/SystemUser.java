package cn.veryjava.datasources.domain;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.datasources.domain.
 * 作者: barton.
 * 日期: 16-10-28.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
public class SystemUser {

  private long id;
  private String name;
  private String password;
  private int disable;

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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getDisable() {
    return disable;
  }

  public void setDisable(int disable) {
    this.disable = disable;
  }

  @Override
  public String toString() {
    return "SystemUser{" +
     "id=" + id +
     ", name='" + name + '\'' +
     ", password='" + password + '\'' +
     ", disable=" + disable +
     '}';
  }
}
