package xyz.macsen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("xyz.macsen.info.mapper")
public class BlogInfoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogInfoApplication.class, args);
    }
}
