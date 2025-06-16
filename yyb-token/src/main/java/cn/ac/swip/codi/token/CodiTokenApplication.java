package cn.ac.swip.codi.token;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.ac.swip.*"})
public class CodiTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodiTokenApplication.class, args);
    }
}
