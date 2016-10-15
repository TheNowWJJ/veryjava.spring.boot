package cn.veryjava;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-13.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Component
@ConfigurationProperties(prefix = "jdbc")
public class Properties {
  private int port;

  private Resource dbPath;

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public Resource getDbPath() {
    return dbPath;
  }

  public void setDbPath(Resource dbPath) {
    this.dbPath = dbPath;
  }
}
