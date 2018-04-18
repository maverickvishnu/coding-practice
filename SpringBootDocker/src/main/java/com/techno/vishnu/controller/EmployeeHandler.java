package com.techno.vishnu.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techno.vishnu.model.Employee;
import com.techno.vishnu.repo.EmployeeRepo;

@RestController
@RequestMapping("demo")
public class EmployeeHandler {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeHandler.class);
		
	    @Autowired
		private EmployeeRepo empRepo;
		
		@RequestMapping("/")
		public String test() {
			return "This is test service";
		}
		
		@RequestMapping(value="/get" , method=RequestMethod.GET)
		public List<Employee> getEmployee(){
			return empRepo.getAllEmployee();
		}
		
		@RequestMapping(value="/add" , method=RequestMethod.POST)
		public void addPromotion(@RequestBody Employee emp) {
			System.out.println("Inside post method..");
			empRepo.addEmployee(emp);
		}
	}


