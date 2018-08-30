/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import java.util.List;
import com.example.demo.pojo.Countries;
import tools.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author BINTANG
 */
public class CountryDAO {
    public static List<Countries> layDS(){
        List<Countries> lst = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "from Countries";
            Query query = session.createQuery(hql);
            lst = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
}
