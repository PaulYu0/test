package cn.itcast.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"cn.itcast"})

public class Demo {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Demo.class);
		
		springApplication.setBannerMode(Banner.Mode.OFF);
		
		springApplication.run(args);
		
	}
}
