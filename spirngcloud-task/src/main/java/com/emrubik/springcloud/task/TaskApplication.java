/*******************************************************************************
 * @(#)TaskApplication.java 2017年3月20日
 *
 * Copyright 2017 emrubik Group Ltd. All rights reserved.
 * EMRubik PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package com.emrubik.springcloud.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * TODO 这里请补充该类型的简述说明
 * @author <a href="mailto:changj@emrubik.com">chang jiang</a>
 * @version $Revision 1.0 $ 2017年3月20日 上午9:59:14
 */
@SpringBootApplication
@EnableTask
@EnableConfigurationProperties({ TimestampTaskProperties.class })
public class TaskApplication {
    private static final Log logger = LogFactory.getLog(TaskApplication.class);

    @Configuration
    public static class TaskConfiguration {

        @Bean
        public CommandLineRunner commandLineRunner() {
            return new CommandLineRunner() {
                @Override
                public void run(String... args) throws Exception {
                    System.out.println("The CommandLineRunner was executed");
                }
            };
        }
    }
    
    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

//    @Bean
//    public TimestampTask timeStampTask() {
//        return new TimestampTask();
//    }
//    /**
//     * A commandline runner that prints a timestamp.
//     */
//    public class TimestampTask implements CommandLineRunner {
//
//        @Autowired
//        private TimestampTaskProperties config;
//
//        @Override
//        public void run(String... strings) throws Exception {
//            DateFormat dateFormat = new SimpleDateFormat(config.getFormat());
//            logger.info(dateFormat.format(new Date()));
//        }
//    }
}
