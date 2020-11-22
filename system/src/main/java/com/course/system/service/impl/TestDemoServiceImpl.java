package com.course.system.service.impl;

import com.course.system.domain.TestDemoDto;
import com.course.system.mapper.TestDemoMapper;
import com.course.system.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDemoServiceImpl  implements TestDemoService {

    @Autowired
    private TestDemoMapper testDemoMapper;
    @Override
    public List<TestDemoDto>  queryservice() {
        System.out.println("asd");
        List<TestDemoDto> k=testDemoMapper.querymapper();
        return k;
    }
}
