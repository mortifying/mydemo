package com.mydemotest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * mydemo
 * Created by yusb on 2019-05-10
 */
public class LoggerTest {

    //定义日志对象
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String... strings) {
        //级别为debug的日志
        logger.debug("Hello! debug!");
        //级别为info的日志
        logger.info("Hello! info!");
        //级别为warn的日志
        logger.warn("Hello! warn!");
        //级别为error的日志
        logger.error("Hello! error!");
    }
}
