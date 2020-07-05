package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.SpringJpaHibernateApllication;


@SpringBootTest(classes=SpringJpaHibernateApllication.class)
class CourseRepositoryTest {

	@Test
	public void contextLoads() {
		
	System.out.println("*****************Inside the testing Junit CourseRepositoryTest********************");
	}

}
