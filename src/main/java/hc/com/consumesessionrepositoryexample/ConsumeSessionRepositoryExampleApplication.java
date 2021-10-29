package hc.com.consumesessionrepositoryexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumeSessionRepositoryExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumeSessionRepositoryExampleApplication.class, args);
    }

}
