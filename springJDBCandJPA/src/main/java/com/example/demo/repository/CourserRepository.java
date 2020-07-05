package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Course;

@Repository
@Transactional
public class CourserRepository {

	@PersistenceContext
	EntityManager em;

	public Course findById(Long Id)  {

		Course course = new Course();
		
			course = em.find(Course.class, Id);
		
		return course;
	}
	
	

	public Course save(Course course) {

		if (course.getId() == null)
			em.persist(course);
		else
			em.merge(course);
		return course;

	}
	
	public void deleteById(Long Id) {
		
		Course course=findById(Id);
		
		 em.remove(course);
	}

}
