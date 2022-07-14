package com.example;

import com.example.config.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import com.example.domain.Person;
import com.example.domain.Student;
import com.example.domain.MyProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private Person person;

	@Autowired
	private Student student;
	@Autowired
	private MyProperties myProperties;

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		System.out.println(person);
	}

	@Test
	public void studentTest() {
		System.out.println(student);
	}

	@Test
	public void myPropertiesTest() {
		System.out.println(myProperties);
	}

	@Test
	public void iocTest() {
		System.out.println(applicationContext.containsBean("myService"));
		System.out.println((MyService)applicationContext.getBean("myService"));
	}
}
