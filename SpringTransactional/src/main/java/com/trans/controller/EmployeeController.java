package com.trans.controller;

import java.util.Date;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trans.entity.EmployeeDto;
import com.trans.service.EmployeeService;

@RestController

public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	 @PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeDto employeeDto) {
		return employeeService.saveEmp(employeeDto);
	}
	
}
