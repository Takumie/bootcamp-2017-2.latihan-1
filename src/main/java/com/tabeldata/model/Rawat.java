/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.model;

import java.sql.Date;
import lombok.Data;
/**
 *
 * @author LENOVO
 */

@Data
public class Rawat {
    private Integer id;
    private Pasien pasien;
    private Ruang ruang;
    private Date waktuRegister;
    private Date waktuCheckout;
}
