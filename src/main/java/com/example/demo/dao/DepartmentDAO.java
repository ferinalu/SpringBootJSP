/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import java.util.List;
import com.example.demo.pojo.Departments;
import tools.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author BINTANG
 */
public class DepartmentDAO {
    public static List<Departments> layDS(){
        List<Departments> lst = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "from Departments";
            Query query = session.createQuery(hql);
            lst = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    
}
