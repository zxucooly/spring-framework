package zxu.config;

import zxu.pojo.Dog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "zxu.config")
public class BeanConfig {

    @Value("${my.ip}")
    private String ip;

    @Bean
    public Dog dog() {
        System.out.println("ip=" + ip);
        return new Dog("花花", 2);
    }
}
