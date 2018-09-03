/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.pojo.Regions;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author misbah alkhafadh
 */
public class RegionController {
    private static List<Regions> region = new ArrayList<Regions>();
    
    @RequestMapping(value = {"/region"}, method = RequestMethod.GET)
    public String viewRegionList(Model model) {
//        List<Regions> list = RegionDAO.layDS();

        model.addAttribute("regions", region);
        return "region";
    }
}
