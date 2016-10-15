package cn.veryjava;

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
public interface StudentService {

  /**
   * 查询
   */
  List select();

  /**
   * 新增
   */
  void add();

  /**
   * 更新
   */
  void update();

  /**
   * 删除
   */
  void delete();

}
