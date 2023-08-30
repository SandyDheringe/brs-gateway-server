package com.brsgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BrsGatewayServerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BrsGatewayServerApplication.class, args);

        new SpringApplicationBuilder()
                .profiles("dev")
                .sources(BrsGatewayServerApplication.class)
                .run(args);
    }

}
