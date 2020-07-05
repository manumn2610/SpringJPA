package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	class PersonRowMapper implements RowMapper {

		@Override
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();

			person.setId(rs.getInt("Id"));
			person.setName(rs.getString("name"));

			person.setLocation(rs.getString("location"));
			person.setBirthDate(rs.getTimestamp("birth_date"));

			return person;
		}
	}

	public List<Person> findAll() {
		System.out.println("FindALl method>>>>>>>>>>>>>>>>>>>>>>>");
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class))

		;

	}

	public Person findById(int id) {
		System.out.println("FindById method>>>>>>>>>>>>>>>>>>>>>>>");
		 return (Person) jdbcTemplate.queryForObject("select * from person where id=?", new Object[] { id },
				new PersonRowMapper());
		


	}

	public Person findBylocationAndName(String location, String name) {
		System.out.println("FindById method>>>>>>>>>>>>>>>>>>>>>>>");
		return jdbcTemplate.queryForObject("select * from person where location=? and name=?",
				new Object[] { location, name }, new BeanPropertyRowMapper<Person>(Person.class));

	}

	public List<Person> findBylocationORName(String location, String name) {
		System.out.println("FindById method>>>>>>>>>>>>>>>>>>>>>>>");
		return jdbcTemplate.query("select * from person where location=? or name=?", new Object[] { location, name },
				new BeanPropertyRowMapper<Person>(Person.class));

	}

	public int deleteById(int id) {

		return jdbcTemplate.update("delete from person where id=?", new Object[] { id });
	}

	public int insertPerson(Person person) {
		return jdbcTemplate.update("insert into person(id,name,location,birth_date)" + "values(?,?,?,?) ",
				new Object[] { person.getId(), person.getName(), person.getLocation(),
						new java.sql.Timestamp(person.getBirthDate().getTime()) });

	}

	public int updatePerson(Person person) {
		return jdbcTemplate.update("update person " + "set name=?,location=?,birth_date=?" + " where id=?",
				new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()),
						person.getId() });

	}

}
