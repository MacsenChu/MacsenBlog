package xyz.macsen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("xyz.macsen.about.mapper")
@EnableFeignClients(basePackages = {"xyz.macsen.article.feign"})
public class AboutApplication {
    public static void main(String[] args) {
        SpringApplication.run(AboutApplication.class, args);
    }
}
