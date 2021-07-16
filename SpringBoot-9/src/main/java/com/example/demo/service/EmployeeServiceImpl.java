package com.example.demo.service;

import java.util.*;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.EmployeeDao;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	EmployeeDao dao;
	
	@Override
	public List<Employee> getAllEmployees()
	{
		return dao.findAll();
	}
	
	@Override
	public List<Employee> getEmployeeByName(String name)
	{
		return dao.getUsingEmpName(name);
	}
	
	
	@Override
	public List<Employee> getEmployeeBySalary(float lower,float higher)
	{
		return dao.getEmployeeBySal(lower, higher);
	}
	
	@Override
	public Employee getEmployeeWithId(int empId)
	{
		return dao.getById(empId);
	}
	
	@Override
	public Employee addEmployee(Employee emp)
	{
		return dao.save(emp);
	}
	
	@Override
	public Employee updateEmployee(int empId,Employee emp)
	{
		return dao.save(emp);
	}
	
	@Override
	public void deleteEmployee(int empId)
	{
		dao.deleteById(empId);
	}
	

}
