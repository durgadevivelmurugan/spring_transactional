package com.trans.entity;

public class EmployeeDto {

	private String empname;
	private String email;
	private String deptname;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public EmployeeDto(String empname, String email, String deptname) {
		super();
		this.empname = empname;
		this.email = email;
		this.deptname = deptname;
	}
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
