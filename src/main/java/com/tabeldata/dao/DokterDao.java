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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
    
    public void delete(Integer idDokter) throws SQLException{
        KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
        DataSource dataSource = koneksiDatabase.getDataSource();
        Connection connection = dataSource.getConnection();
        
        String sql = "delete from latihan_1.dokter where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, idDokter);
        
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
    
    public List<Dokter> findAll() throws SQLException{
        List<Dokter> listDokter = new ArrayList<>();
        
        KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
        DataSource dataSource = koneksiDatabase.getDataSource();
        Connection connection = dataSource.getConnection();
        
        String sql = "select * from latihan_1.dokter order by id";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            Dokter dokter = new Dokter();
            dokter.setId(resultSet.getInt("id"));
            dokter.setNama(resultSet.getString("nama"));
            dokter.setSpesialis(resultSet.getString("spesialis"));
            listDokter.add(dokter);
        }
        
        resultSet.close();
        statement.close();
        connection.close();
        return listDokter;
    }
    
    public void findById(){
    
    }
}
