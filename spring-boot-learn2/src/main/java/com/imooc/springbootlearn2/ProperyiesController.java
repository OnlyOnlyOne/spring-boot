package com.imooc.springbootlearn2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Properyies controller.
 * 演示读取配置的Controller
 */
@RestController
public class ProperyiesController {
    @Value("${school.grade}")
    Integer grade;

    @Value("${school.classnum}")
    Integer classnum;

    @GetMapping("/gradeclass")
    public String gradeClass() {
        return "年级：" + grade + " 班级：" + classnum;
    }
}
