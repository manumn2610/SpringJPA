package com.example.demo;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.PersonJdbcDao;
import com.example.demo.entity.Person;


public class SpringJdbCandJpaApplication implements CommandLineRunner {
	Logger log = LoggerFactory.getLogger(SpringJdbCandJpaApplication.class);
	@Autowired
	PersonJdbcDao persondao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbCandJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//log.info("All users ->{}", persondao.findAll());
		//log.info("USER 10004->{}", persondao.findById(10007));
		//String [] location= {"Bangalore","Mysore"};
		//log.info("USER by location ->{}", persondao.findBylocationAndName("Mysore", "Paddy"));
		//log.info("USER by location or name ->{}", persondao.findBylocationORName("Mysore", "Manu"));
		//log.info("Number of records deleted ->{}", persondao.deleteById(10002));
		//log.info("Number of records deleted ->{}", persondao.deleteById(10003));
		//log.info("Inserting the user 10008-->{}",persondao.insertPerson(new Person(10008,"Ramu","Mysore",new Date())));
		//log.info("Inserting the user 10007-->{}",persondao.insertPerson(new Person(10007,"Harsha","Chikmagalure",new Date())));

		//log.info("updating the user 10003-->{}",persondao.updatePerson(new Person(10004,"Paddy","USA",new Date())));






	}

}
