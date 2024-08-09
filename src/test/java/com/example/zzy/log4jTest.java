package com.example.zzy;

import org.junit.jupiter.api.Test;
import org.apache.log4j.Logger;


public class log4jTest {
    static Logger logger = Logger.getLogger(log4jTest.class);
    @Test
    public void testLog4j(){
        logger.info("info");
    }
}
