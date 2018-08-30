/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.demo.dao.CountryDAO;
import com.example.demo.pojo.Countries;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author BINTANG
 */
public class CountryController implements Controller
{
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("countries");
        try {
            List<Countries> list = CountryDAO.layDS();
            mv.addObject("countryList",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    
}
