/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.dao;

import com.tabeldata.configs.KoneksiDatabase;
import com.tabeldata.model.Pasien;
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
public class PasienDao {
    public void save(Pasien p) throws SQLException{
        KoneksiDatabase koneksiDb = new KoneksiDatabase();
        DataSource dataSource = koneksiDb.getDataSource();
        Connection connection = dataSource.getConnection();
        
        String sql = "INSERT INTO latihan_1.pasien (nama,alamat,tanggal_lahir) VALUES (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, p.getNama());
        statement.setString(2, p.getAlamat());
        statement.setDate(3, p.getTanggalLahir());
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
    
    public void update(Pasien p) throws SQLException{
        KoneksiDatabase koneksiDb = new KoneksiDatabase();
        DataSource dataSource = koneksiDb.getDataSource();
        Connection connection = dataSource.getConnection();
        
        String sql = "UPDATE latihan_1.pasien SET nama=?, alamat=?, tanggal_lahir=? where id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, p.getNama());
        statement.setString(2, p.getAlamat());
        statement.setDate(3, p.getTanggalLahir());
        statement.setInt(4, p.getId());
        
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
    
    public void delete(Integer idPasien) throws SQLException{
        KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
        DataSource dataSource = koneksiDatabase.getDataSource();
        Connection connection = dataSource.getConnection();
        
        String sql = "delete from latihan_1.pasien where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, idPasien);
        
        statement.executeUpdate();
        statement.close();
        connection.close();
    }
    
    public List<Pasien> findAll() throws SQLException{
        List<Pasien> listPasien = new ArrayList<>();
        
        KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
        DataSource dataSource = koneksiDatabase.getDataSource();
        Connection connection = dataSource.getConnection();
        
        String sql = "select * from latihan_1.pasien order by id";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            Pasien pasien = new Pasien();
            pasien.setId(resultSet.getInt("id"));
            pasien.setNama(resultSet.getString("nama"));
            pasien.setAlamat(resultSet.getString("alamat"));
            pasien.setTanggalLahir(resultSet.getDate("tanggal_lahir"));
            listPasien.add(pasien);
        }
        
        resultSet.close();
        statement.close();
        connection.close();
        return listPasien;
    }
    
    public Pasien findById(Integer idPasien) throws SQLException{
        KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
        DataSource dataSource = koneksiDatabase.getDataSource();
        Connection connection = dataSource.getConnection();
        
        String sql = "select * from latihan_1.pasien where id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idPasien);
        ResultSet resultSet = statement.executeQuery();
        Pasien pasien = new Pasien();
        if (resultSet.next()){ 
            pasien.setId(resultSet.getInt("id"));
            pasien.setNama(resultSet.getString("nama"));
            pasien.setAlamat(resultSet.getString("alamat"));
            pasien.setTanggalLahir(resultSet.getDate("tanggal_lahir"));
        }
        
        resultSet.close();
        statement.close();
        connection.close();
        return pasien;
    }
}
