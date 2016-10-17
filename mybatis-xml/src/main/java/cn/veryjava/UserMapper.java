package cn.veryjava;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 描述: TODO:
 * 包名: barton.mybatis.mapper.
 * 作者: barton.
 * 日期: 16-9-1.
 * 项目名称: mybatis
 * 版本: 1.0
 * JDK: since 1.8
 */
@Mapper
public interface UserMapper {
  User findByName(@Param("name") String name);

  int insert(@Param("name") String name, @Param("age") int age);
}
