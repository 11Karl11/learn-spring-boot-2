package org.xian.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author xian
 */

@SpringBootApplication
public class BootApplication {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BootApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
        log.trace("trace");
        log.debug("debug");
        log.warn("warn");
        log.info("info");
        log.error("error");
    }
}
