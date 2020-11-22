package com.course.system.mapper;

import com.course.system.domain.TestDemoDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //把该mapper注入到spring的bean中
public interface TestDemoMapper {

    List<TestDemoDto>  querymapper();

}
