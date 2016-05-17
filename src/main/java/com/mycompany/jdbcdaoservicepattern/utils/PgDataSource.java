/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.utils;

import javax.inject.Named;
import javax.sql.DataSource;
import org.postgresql.ds.PGPoolingDataSource;

/**
 *
 * @author juang
 */
@Named
public class PgDataSource {

    public DataSource getDataSource() {
        PGPoolingDataSource datasource = new PGPoolingDataSource();
        datasource.setDataSourceName("A Data Source");
        datasource.setServerName("10.26.5.12");
        datasource.setDatabaseName("db_wbfs_dxnpharma");
        datasource.setUser("dxndba");
        datasource.setPassword("dxnoke");
        datasource.setMaxConnections(10);
        return datasource;
    }

}
