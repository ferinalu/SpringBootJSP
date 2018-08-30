/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Jobs;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class JobDAO {

    private FunctionDAO fdao;

    public JobDAO() {
    }
    
    public JobDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }

    /**
     * Fungsi insert or update data Jooooooob
     *
     * @param job
     * @return boolean true/false
     */
    public boolean insertOrUpdate(Jobs jobs) {
        return this.fdao.insertOrUpdate(jobs);
    }

    /**
     * Fungsi untuk mendapatkan semua data/getall
     *
     * @return List
     */
    public List<Object> getAll() {
        return this.fdao.get("FROM Jobs");
    }

    /**
     * Fungsi search
     *
     * @param category - what colum we will find
     * @param data - what we will find
     * @return List - List Object from Jobs table
     */
    public List<Object> search(String category, String data) {
        return this.fdao.get("FROM Jobs WHERE "
                +category+ " LIKE '%"+data+"%'");
    }

    /**
     * Fungsi getById
     *
     * @param jobId - id from Jobs table
     * @return Job as object from Job class
     */
    public Jobs getJobById(String jobId) {
        return (Jobs) this.fdao
                .getById("FROM Jobs WHERE jobId='" + jobId + "'");
    }
}
