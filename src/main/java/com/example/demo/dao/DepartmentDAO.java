/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Departments;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class DepartmentDAO {
    
    private FunctionDAO fdao;

    public DepartmentDAO(FunctionDAO functionDAO) {
        this.fdao = functionDAO;
    }
    
    /**
     * fungsi tampil data / get all
     * @return list object from department
     */
    public List<Object> getAll() {
        return this.fdao.get("from Departments");
    }
    
    /**
     * Fungsi yang digunakan untuk mencari data Department
     * @param category - what column we will find
     * @param data - what we will find
     * @return List
     */
    public List<Object> search(String category, String data){
        return  this.fdao.get("FROM Departments WHERE " +category+ " LIKE '%" +data+ "%'");
    }
    public Departments getDepartmentById(Integer departmentId) {
        return (Departments) this.fdao
                .getById("FROM Departments WHERE departmentId='" + departmentId + "'");
    }
}
