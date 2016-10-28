package cn.veryjava;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-28.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@Component
public class ExitCodeConfig implements ExitCodeGenerator {
  @Override
  public int getExitCode() {
    // 自定义程序结束时返回的退出码
    System.out.println("// the application exited;");
    return 1024;
  }
}
