/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Regions;
import java.util.List;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author Ignatius
 */
public class RegionDAO {
    private final FunctionDAO fdao;

    public RegionDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }

    public boolean insertOrUpdate(Regions regions) {
        return this.fdao.insertOrUpdate(regions);
    }
     public  List<Object> search(String category, String data){
     return this.fdao.get("FROM Regions WHERE "+category+" LIKE '%"+data+"%'");
    
   }
    
   /**
     * Fungsi untuk menampilkan semua data pada table Region
     * @return memanggil fungsi get pada FunctionDAO
     */
    public List<Object> getAll(){
        return this.fdao.get("FROM Regions");
    }
    /**
     * Fungsi get job by ID
     * @param regionId String
     * @return 
     */
    public Regions getRegionById(String regionId){
        return (Regions) this.fdao.getById("FROM Regions WHERE regionId='"+regionId+"'");
}
}
