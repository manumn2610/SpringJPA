package com.example.demo;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.PersonJdbcDao;
import com.example.demo.entity.Course;
import com.example.demo.entity.Person;
import com.example.demo.repository.CourserRepository;

@SpringBootApplication
public class SpringJpaHibernateApllication implements CommandLineRunner {
	Logger log = LoggerFactory.getLogger(SpringJpaHibernateApllication.class);
	@Autowired
	CourserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateApllication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("CourseDetails1 ->{}", repository.findById(10003L));
		log.info("CourseDetails2 ->{}", repository.findById(24L));
		/* repository.deleteById(24L);
		 repository.deleteById(27L);
		 repository.deleteById(30L);
*/



		//log.info("CourseDetails ->{}", repository.findByString("Spring Aspect Oriented Programming in 50 steps"));

		//log.info("CourseInserted ->{}", repository.save(new Course("Spring Aspect Oriented Programming in 50 steps")));

		





	}

}
