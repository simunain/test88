package com.course;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	private static final Logger LOG = LoggerFactory.getLogger(EurekaApplication.class);

//	public static void main(String[] args) {
//		SpringApplication.run(EurekaApplication.class, args);
//	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(EurekaApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("启动成功！！");
		LOG.info("Eureka地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
		//日志级别从低到高分为TRACE < DEBUG < INFO < WARN < ERROR < FATAL，如果设置为WARN，则低于WARN的信息都不会输出。
		LOG.trace("测试{}，日志级别{}，输出{}", "demo1", "trace", "trace level log");

		LOG.debug("测试{}，日志级别{}，输出{}", "demo1", "debug", "debug level log");

		LOG.info("测试{}，日志级别{}，输出{}", "demo1", "info", "info level log");

		LOG.warn("测试{}，日志级别{}，输出{}", "demo1", "warn", "warn level log");

		LOG.error("测试{}，日志级别{}，输出{}", "demo1", "error", "error level log");

	}

}
