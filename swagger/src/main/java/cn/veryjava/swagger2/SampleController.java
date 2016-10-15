package cn.veryjava.swagger2;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-13.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

  @ApiOperation(value = "sample接口", notes = "sample")
  @ApiImplicitParam(value = "姓名", name = "name", required = true, dataType = "String")
  @RequestMapping(value = "/{name}", method = RequestMethod.GET)
  public String abc(@PathVariable String name) {
    return name;
  }
}
