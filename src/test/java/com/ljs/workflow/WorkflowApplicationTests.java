package com.ljs.workflow;

import org.flowable.engine.repository.Deployment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkflowApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void contextLoads() {

    }

    @Test
    public void testFlowable() {


        logger.info("日志测试 log info");
        logger.error("日志测试 log error");
        logger.debug("日志测试 log debug");
    }

}

