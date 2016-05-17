/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.controller;

import com.mycompany.jdbcdaoservicepattern.models.SystemParameter;
import com.mycompany.jdbcdaoservicepattern.services.SystemParameterService;
import com.mycompany.jdbcdaoservicepattern.services.impl.SystemParameterServiceImpl;
import com.mycompany.jdbcdaoservicepattern.utils.PgDataSource;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.postgresql.ds.PGPoolingDataSource;

/**
 *
 * @author juang
 */
@Path("/")
@Named
public class SystemParameterController {

    private String pesan;
//    @Inject
//    private PgDataSource dataSource;
    //@Inject
    //private SystemParameterService parameterService;

    @GET
    @Produces("application/json")
    @Path("hallo")
    public String getIt() {
        PGPoolingDataSource datasource = new PGPoolingDataSource();
        datasource.setDataSourceName("A Data Source");
        datasource.setServerName("10.26.5.12");
        datasource.setDatabaseName("db_wbfs_dxnpharma");
        datasource.setUser("dxndba");
        datasource.setPassword("dxnoke");
        datasource.setMaxConnections(10);
        SystemParameterService parameterService = new SystemParameterServiceImpl();
        parameterService.setDataSource(datasource);
        List<SystemParameter> list = parameterService.getSystemParameters();
        return pesan = "hallo ini adalah sysparam controller";
    }
}
