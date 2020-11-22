package com.course.system.controller;


import com.course.system.domain.TestDemoDto;
import com.course.system.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TsetController {

    @Autowired
    private   TestDemoService testDemoService;

    @RequestMapping("/test")
    public String test(){
        return "success";
    }

    @RequestMapping("/ooxx")
    @ResponseBody
    public List<TestDemoDto> testqwer(){
        System.out.println("阿薩德");
        return testDemoService.queryservice();
    }

}
