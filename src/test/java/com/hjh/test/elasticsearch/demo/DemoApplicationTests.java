package com.hjh.test.elasticsearch.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
		Employee employee = new Employee();
		employee.setId("1");
		employee.setFirstName("xuxu");
		employee.setLastName("zh");
		employee.setAge(26);
		employee.setAbout("i am in peking");
        Employee save = employeeRepository.save(employee);
        System.err.println("add a obj");
	}

	@Test
	public void get(){
        Optional<Employee> employee = employeeRepository.findById("2");
        System.out.println(employee.get().getFirstName());
    }

}
