/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import java.util.List;
import com.example.demo.pojo.Employees;
import tools.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author BINTANG
 */
public class EmployeeDAO {
    public static List<Employees> layDs(){
        List<Employees> list = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "from Employees";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
