package com.techno.vishnu.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.techno.vishnu.model.Employee;

@Component
public class EmployeeRepo {

	private static List<Employee> epmList = new ArrayList<>();
	static {
		Employee firstEmp = new Employee(1 ,"Vishnu" ,2000);
		Employee secEmp = new Employee(1 ,"Vishnu" ,2000);
		Employee thirdEmp = new Employee(1 ,"Vishnu" ,2000);
		epmList.add(firstEmp);
		epmList.add(secEmp);
		epmList.add(thirdEmp);
	}
	public List<Employee> getAllEmployee() {
		return epmList;
	}
	
	public void addEmployee(Employee emp) {
		epmList.clear();
		epmList.add(emp);
	}
}
