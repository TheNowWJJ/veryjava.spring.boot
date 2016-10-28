package cn.veryjava.datasources.ssabmapper;

import cn.veryjava.datasources.domain.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.datasources.ssabmapper.
 * 作者: barton.
 * 日期: 16-10-28.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Mapper
public interface SysUserMapper {

  @Select("SELECT ID,NAME,PASSWORD,DISABLE FROM SYSTEM_USER WHERE ID = #{id}")
  SystemUser findById(@Param("id") long id);
}
