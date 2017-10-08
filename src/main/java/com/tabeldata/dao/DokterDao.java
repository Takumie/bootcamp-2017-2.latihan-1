/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.dao;

import com.tabeldata.configs.KoneksiDatabase;
import com.tabeldata.model.Dokter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author LENOVO
 */
public class DokterDao {
    public void save(Dokter x) throws SQLException{
        KoneksiDatabase koneksiDb = new KoneksiDatabase();
        DataSource dataSource = koneksiDb.getDataSource();
        Connection connection = dataSource.getConnection();
        
        String sql = "INSERT INTO latihan_1.dokter (nama,spesialis) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, x.getNama());
        statement.setString(2, x.getSpesialis());
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
    
    public void update(){
    
    }
    
    public void delete(){
    
    }
    
    public void findAll(){
    
    }
    
    public void findById(){
    
    }
}
