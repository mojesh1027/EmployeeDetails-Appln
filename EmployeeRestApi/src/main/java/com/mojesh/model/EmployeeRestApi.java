package com.mojesh.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeRestApi {
	@Id
	private Integer edi;
	private String ename;
	private String email;
	private String  password;
	private String address;
	private Double salary;
	private String disignation;
	public EmployeeRestApi() {
		super();
	}
	public Integer getEdi() {
		return edi;
	}
	public void setEdi(Integer edi) {
		this.edi = edi;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDisignation() {
		return disignation;
	}
	public void setDisignation(String disignation) {
		this.disignation = disignation;
	}
	@Override
	public String toString() {
		return "EmployeeApi [edi=" + edi + ", ename=" + ename + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", salary=" + salary + ", disignation=" + disignation + "]";
	}
	
}
