package com.zhen.springbootsample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 * <p>
 * Description：index controller
 * Auth：wuhengzhen
 * Date：2019-01-29
 * Time：14:33
 */
@RestController
public class IndexController {
    @RequestMapping("index")
    public String index() {
        return "hello world!";
    }
}
