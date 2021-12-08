package com.imooc.springbootlearn2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 读取配置类
* */
@RestController
public class ConfigController {
    @Autowired
    private SchoolConfig schoolConfig;

    @GetMapping("/gradefromconfig")
    public String gradeClass() {
        return "年级：" + schoolConfig.grade + " 班级：" + schoolConfig.classnum;
    }
}
