package com.imooc.springbootlearn2;


import org.springframework.web.bind.annotation.*;

/**
 * 描述： 演示各种 传参形式
 */
// 统一设置接口前缀
@RestController
@RequestMapping("/prefix")
public class ParaController {
    @GetMapping("/firstrequest")
    public String firstRequest() {
        return "only spring boot接口";
    }

    @GetMapping("/info")
    public String firstRequest(String name, Integer age) {
        return "myname:" + name + " myage:" + age;
    }

    @GetMapping("/requestpara")
    public String requestpara(@RequestParam Integer num,String name) {
        return "par from request:" + num ;
    }

    @GetMapping("/para/{num}")
    public String pathpara(@PathVariable Integer num) {
        return "par from request:" + num ;
    }

    //多个地址可以访问
    @GetMapping({"/multiurl1","/multiurl2"})
    public String multiurl(@RequestParam Integer num) {
        return "par from request:" + num ;
    }

    //设置参数并不是必须的
    @GetMapping("/required")
    public String required(@RequestParam(required = false,defaultValue = "0") Integer num) {
        return "par from request:" + num ;
    }
}
