package com.example.demo.controller;

import com.example.demo.dao.RegionDAO;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Person;
import com.example.demo.pojo.Regions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private static List<Person> persons = new ArrayList<Person>();

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);

        return "index";
    }

    @RequestMapping(value = {"/personList"}, method = RequestMethod.GET)
    public String viewPersonList(Model model) {

        model.addAttribute("persons", persons);

        return "personList";
    }

    @RequestMapping(value = {"/country"}, method = RequestMethod.GET)
    public String viewCountry(Model model) {

        return "country";
    }
    
    @RequestMapping(value = {"/department"}, method = RequestMethod.GET)
    public String viewDepartment(Model model) {

        return "department";
    }
    
    @RequestMapping(value = {"/employee"}, method = RequestMethod.GET)
    public String viewEmployee(Model model) {

        return "employee";
    }
    
    @RequestMapping(value = {"/job"}, method = RequestMethod.GET)
    public String viewJob(Model model) {

        return "job";
    }
    
    @RequestMapping(value = {"/location"}, method = RequestMethod.GET)
    public String viewLocation(Model model) {

        return "location";
    }
    
    @RequestMapping(value = {"/region"}, method = RequestMethod.GET)
    public String viewRegion(Model model) {

        return "region";
    }
    
}
