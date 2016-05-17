/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.controller;

import com.mycompany.jdbcdaoservicepattern.models.SystemParameter;
import com.mycompany.jdbcdaoservicepattern.services.SystemParameterService;
import com.mycompany.jdbcdaoservicepattern.config.PgDataSource;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author juang
 */
@Path("/")
@Named
public class SystemParameterController {

    private String pesan;
    @Inject private PgDataSource pgDataSource;
    @Inject private SystemParameterService parameterService;

    @GET
    @Produces("application/json")
    @Path("hallo")
    public String getIt() {
        
        parameterService.setDataSource(pgDataSource.getDataSource());
        List<SystemParameter> list = parameterService.getSystemParameters();
        return pesan = "hallo ini adalah sysparam controller";
    }
}
