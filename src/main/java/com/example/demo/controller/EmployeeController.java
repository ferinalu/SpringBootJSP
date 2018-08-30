/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.demo.dao.EmployeeDAO;
import com.example.demo.pojo.Employees;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author BINTANG
 */
public class EmployeeController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("employees");
        try {
            List<Employees> list = EmployeeDAO.layDs();
            mv.addObject("employeeList",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }
    
}
