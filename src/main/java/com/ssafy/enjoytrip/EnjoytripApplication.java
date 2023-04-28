package com.ssafy.enjoytrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 만약 이 스프링부트앱 클래스가 enjoytrip패키지 밖에 있어서 
 * 다른 ComponentScan의 대상들을 인식하지 못한다면
 * @ComponentScan(basePackages = {"com.ssafy"})를 붙여줘야 한다. 
 */
@SpringBootApplication
public class EnjoytripApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnjoytripApplication.class, args);
	}

}
