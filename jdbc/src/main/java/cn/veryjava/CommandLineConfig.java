package cn.veryjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
@Component
public class CommandLineConfig implements CommandLineRunner {

  @Autowired
  private Properties p;

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public void run(String... args) throws IOException {
    try {
      String query = "SELECT COUNT(1) FROM STUDENT";
      List count = jdbcTemplate.queryForList(query);
      if (count.size() == 0) {
        String sql = getStreamString(p.getDbPath().getInputStream());
        jdbcTemplate.update(sql);
      }
    } catch (Exception e) {
      String sql = getStreamString(p.getDbPath().getInputStream());
      jdbcTemplate.update(sql);
    }
  }

  /**
   * 将一个输入流转化为字符串
   */
  public static String getStreamString(InputStream tInputStream) {
    if (tInputStream != null) {
      try {
        BufferedReader tBufferedReader = new BufferedReader(new InputStreamReader(tInputStream));
        StringBuffer tStringBuffer = new StringBuffer();
        String sTempOneLine = new String("");
        while ((sTempOneLine = tBufferedReader.readLine()) != null) {
          tStringBuffer.append(sTempOneLine);
        }
        return tStringBuffer.toString();
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    return null;
  }
}
