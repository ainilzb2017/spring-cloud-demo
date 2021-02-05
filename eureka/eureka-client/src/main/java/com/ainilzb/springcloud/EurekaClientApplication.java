package com.ainilzb.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: EurekaClientApplication
 * @Description:
 * @Author 李泽波
 * @Date 2021/2/4
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
