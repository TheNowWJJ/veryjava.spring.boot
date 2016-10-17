package cn.veryjava;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * 描述: TODO:
 * 包名: com.hospital.material.config.
 * 作者: barton.
 * 日期: 16-10-16.
 * 项目名称: hospital
 * 版本: 1.0
 * JDK: since 1.8
 */
@Configuration
@MapperScan("com.*.*.mapper")
public class MyBatisConfig {
  @Bean
  public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
    sqlSessionFactoryBean.setDataSource(dataSource());

    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

    sqlSessionFactoryBean.setMapperLocations(resolver
     .getResources("classpath:/mapper/*.xml"));
    return sqlSessionFactoryBean.getObject();
  }

  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource dataSource() {
    return new DruidDataSource();
  }
}
