package com.trans.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trans.entity.Department;
import com.trans.entity.Employee;
import com.trans.entity.EmployeeDto;
import com.trans.repository.DepartmentRepository;
import com.trans.repository.EmployeeRepository;
import com.trans.service.EmployeeService;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Override
	@Transactional//spring internally take care of commit ,rollback all the exception handling internally
	public String saveEmp(EmployeeDto employeeDto) {
		Department department=new Department();
		department.setDeptname(employeeDto.getDeptname());
		department.setDeptcode(employeeDto.getDeptname());
		
		Long deptid=departmentRepository.save(department).getDeptid();
		Employee employee=new Employee();
		employee.setEmpname(employeeDto.getEmpname());
		employee.setEmail(employeeDto.getEmail());
		employee.setDeptid(deptid);
		employeeRepository.save(employee);
		return "Employee is saved with EmpId" + employee.getEmpid();
	}

}
