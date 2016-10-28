package cn.veryjava.datasources.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-28.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Configuration
@MapperScan(value = "cn.veryjava.datasources.ssabmapper")
public class SSABDataSourceConfig {

  @Bean
  @ConfigurationProperties(prefix = "secondary.datasource")
  public DataSource dataSource() {
    return new DruidDataSource();
  }
}
