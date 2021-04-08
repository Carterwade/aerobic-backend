package edu.nju.aerobic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("edu.nju.aerobic.mapper")
@SpringBootApplication
public class AerobicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AerobicApplication.class, args);
	}
}
