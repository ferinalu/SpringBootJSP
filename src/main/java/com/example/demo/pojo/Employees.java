package com.example.demo.pojo;
// Generated Aug 30, 2018 10:05:38 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private int employeeId;
     private Departments departments;
     private Jobs jobs;
     private Employees employees;
     private String firstName;
     private String lastName;
     private String email;
     private String phoneNumber;
     private Date hireDate;
     private BigDecimal salary;
     private BigDecimal commissionPct;
     private Set departmentses = new HashSet(0);
     private Set employeeses = new HashSet(0);

    public Employees() {
    }

	
    public Employees(int employeeId, Jobs jobs, String lastName, String email, Date hireDate) {
        this.employeeId = employeeId;
        this.jobs = jobs;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
    }
    public Employees(int employeeId, Departments departments, Jobs jobs, Employees employees, String firstName, String lastName, String email, String phoneNumber, Date hireDate, BigDecimal salary, BigDecimal commissionPct, Set departmentses, Set employeeses) {
       this.employeeId = employeeId;
       this.departments = departments;
       this.jobs = jobs;
       this.employees = employees;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.hireDate = hireDate;
       this.salary = salary;
       this.commissionPct = commissionPct;
       this.departmentses = departmentses;
       this.employeeses = employeeses;
    }
   
    public int getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public Departments getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Departments departments) {
        this.departments = departments;
    }
    public Jobs getJobs() {
        return this.jobs;
    }
    
    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
    public BigDecimal getSalary() {
        return this.salary;
    }
    
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public BigDecimal getCommissionPct() {
        return this.commissionPct;
    }
    
    public void setCommissionPct(BigDecimal commissionPct) {
        this.commissionPct = commissionPct;
    }
    public Set getDepartmentses() {
        return this.departmentses;
    }
    
    public void setDepartmentses(Set departmentses) {
        this.departmentses = departmentses;
    }
    public Set getEmployeeses() {
        return this.employeeses;
    }
    
    public void setEmployeeses(Set employeeses) {
        this.employeeses = employeeses;
    }




}


