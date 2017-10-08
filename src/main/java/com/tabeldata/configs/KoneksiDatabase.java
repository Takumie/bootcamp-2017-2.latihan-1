/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.configs;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author LENOVO
 */
public class KoneksiDatabase {
    private final static String url="jdbc:postgresql://localhost:5432/rumah_sakit";
    private final static String username="bootcamp_latihan";
    private final static String password="latihan";
    
    public DataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setUrl(url);
        return ds;
    }
}
