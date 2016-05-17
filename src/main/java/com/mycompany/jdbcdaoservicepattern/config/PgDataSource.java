/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.config;

import javax.sql.DataSource;

/**
 *
 * @author juang
 */
public interface PgDataSource {
    public DataSource getDataSource();
    void closeDataSource();
}
