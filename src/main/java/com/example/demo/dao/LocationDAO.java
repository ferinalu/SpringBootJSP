/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entities.Locations;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ignatius
 */
public class LocationDAO {

    private final FunctionDAO fdao;

    public LocationDAO(SessionFactory factory) {
        this.fdao = new FunctionDAO(factory);
    }

    public boolean insertOrUpdate(Locations locations) {
        return this.fdao.insertOrUpdate(locations);
    }

    public List<Object> search(String category, String data) {
        return this.fdao.get("FROM Locations WHERE " + category + " LIKE '%" + data + "%'");

    }

    /**
     * Fungsi untuk menampilkan semua data pada table Location
     *
     * @return memanggil fungsi get dari FunctionDAO
     */
    public List<Object> getAll() {
        return this.fdao.get("FROM Locations");
    }

    /**
     * Fungsi DAO untuk mengambil data dari tabel Location berdasarkan ID
     *
     * @param locationId String
     * @return Location
     */
    public Locations getLocationById(String locationId) {
        return (Locations) this.fdao.getById("FROM Locations WHERE locationId='" + locationId + "'");
    }

}
