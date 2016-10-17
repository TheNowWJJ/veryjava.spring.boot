package cn.veryjava;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
  @Select("SELECT * FROM USER WHERE NAME = #{name}")
  User findByName(@Param("name") String name);

  @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
  int insert(@Param("name") String name, @Param("age") int age);
}
