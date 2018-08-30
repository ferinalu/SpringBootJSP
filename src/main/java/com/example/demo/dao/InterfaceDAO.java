/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import java.util.List;

/**
 *
 * @author Ignatius
 */
public interface InterfaceDAO {
    public boolean insertOrUpdate(Object object);
    public boolean delete(String id);
    public List<Object> get(String query);
    public Object getById(String query);
    public String getAutoId();
}
