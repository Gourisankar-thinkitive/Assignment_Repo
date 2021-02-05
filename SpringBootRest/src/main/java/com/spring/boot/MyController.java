package com.spring.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello()
	{
		return "hello world";
	}
	
	@GetMapping(value = "/emp")
	public Employee emp()
	{
		return new Employee(1,"tapu", 180_000);
	}
	
	@GetMapping(value = "/emp/{id}")
	public Employee empId(@PathVariable("id") Integer id)
	{
		return new Employee();
	}
	
	
	@PostMapping(value = "/save")
	public String insert(@RequestBody Employee e)
	{
		Services s = new Services();
		s.insert(e);
		return "Inserted sucessfully";
	}
	
	@GetMapping(value = "/all")
	public List<Employee> display()
	{
		Services s = new Services();
		return s.display();
	}

	
	@PutMapping(value = "/update")
	public Employee update(@RequestBody Employee e)
	{
		
			
		return new Employee();
	}
	
	@DeleteMapping(value = "/update")
	public Employee delete(@RequestBody Employee e)
	{
		return new Employee();
	}
	

}
