package cn.veryjava;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述: TODO:
 * 包名: cn.veryjava.
 * 作者: barton.
 * 日期: 16-10-12.
 * 项目名称: veryjava.spring.boot
 * 版本: 1.0
 * JDK: since 1.8
 */
@RestController
@RequestMapping(value = "students")
public class StudentController {
  static {
    System.out.println("我是静态代码块!");
  }

  /**
   * 查询
   */
  @RequestMapping(method = RequestMethod.GET)
  public List<Student> get() {
    return getStudent();
  }

  /**
   * 增加
   */
  @RequestMapping(method = RequestMethod.POST)
  public Student add(@RequestBody Student student) {
    List<Student> students = getStudent();

    System.out.println("新增前students的size:" + students.size());

    students.add(student);

    System.out.println("新增后students的size:" + students.size());

    return student;
  }

  /**
   * 更新
   */
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public String update(@PathVariable long id, @RequestParam String name, @RequestParam int age)
   throws IOException {
    List<Student> students = getStudent();

    System.out.println("更新前:");
    students.forEach(student -> System.out.println(student.getName()));

    students.forEach(student -> {
      if (id == student.getId()) {
        if (!StringUtils.isEmpty(name)) {
          student.setName(name);
        }
        if (0 != age) {
          student.setAge(age);
        }
      }
    });

    System.out.println("更新后:");
    students.forEach(student -> System.out.println(student.getName()));

    return "success";
  }

  /**
   * 删除
   */
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public String delete(@PathVariable long id) {
    List<Student> students = getStudent();

    System.out.println("删除前students的size :" + students.size());

    for (Student student : students) {
      if (id == student.getId()) {
        students.remove(student);
        break;
      }
    }

    System.out.println("删除后students的size :" + students.size());

    return "success";
  }

  private List<Student> getStudent() {
    List<Student> students = new ArrayList<>();

    Student s1 = new Student(1l, 12, "s1");
    Student s2 = new Student(2l, 13, "s2");
    Student s3 = new Student(3l, 14, "s3");

    students.add(s1);
    students.add(s2);
    students.add(s3);

    return students;
  }
}
