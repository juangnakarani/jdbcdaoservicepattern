/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.config.impl;

import com.mycompany.jdbcdaoservicepattern.config.PgDataSource;
import javax.inject.Named;
import javax.sql.DataSource;
import org.postgresql.ds.PGPoolingDataSource;

/**
 *
 * @author juang
 */
//@Named("datasource")
public class PgDataSourceImpl implements PgDataSource{
    private PGPoolingDataSource dataSource;
    
    @Override
    public DataSource getDataSource() {
        dataSource = new PGPoolingDataSource();
        dataSource.setDataSourceName("A Data Source");
        dataSource.setServerName("10.26.5.12");
        dataSource.setDatabaseName("db_wbfs_dxnpharma");
        dataSource.setUser("dxndba");
        dataSource.setPortNumber(5433);
        dataSource.setPassword("dxnoke");
        dataSource.setMaxConnections(10);
        return dataSource;
    }

    @Override
    public void closeDataSource() {
        this.dataSource.close();
    }

}
