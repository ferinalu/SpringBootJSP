/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Employees;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class EmployeeDAO {
    private FunctionDAO fdao;
    
    public EmployeeDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }
    
    /**
     * Fungsi insert dan update data Job
     * @param employee
     * @return boolean true/false
     */   
    public boolean insertOrUpdate(Employees employees) {
        return this.fdao.insertOrUpdate(employees);
    }
    
     /**
     * fungsi untuk mendapatkan semua data / getAll
     * @return List data employee
     */
    
    public List<Object>getAll(){
        return this.fdao.get("FROM Employees");
    }
    
    public Employees getEmployeeById(Integer employeeId) {
        return (Employees) this.fdao
                .getById("FROM Employees WHERE employeeId=" + employeeId + "");
    }
    
    
     /**
     * Fungsi yang digunakan untuk mencari data Employee
     * @param category - what column we will find
     * @param data - what we will find
     * @return List
     */
    public List<Object> search(String category, String data){
        return  this.fdao.get("FROM Employees WHERE " +category+ " LIKE '%" +data+ "%'");
    }
    
    /**
     * Fungsi getById
     * @param employeeId - id from Employee table
     * @return Employee as object from Employee class
     */
    /*
    public Employee getEmployeeById(String employeeId){
        return (Employee) this.fdao.getById("FROM employee WHERE employeeId='"+employeeId+"'");
    }
    */
}