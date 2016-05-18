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
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author juang
 */
@Path("/")
@Named
public class SystemParameterController {

    private String pesan;
    @Inject
    private PgDataSource pgDataSource;
    @Inject
    private SystemParameterService parameterService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("hallo")
    public String getIt() {

        parameterService.setDataSource(pgDataSource.getDataSource());
        List<SystemParameter> list = parameterService.getSystemParameters();
//        return pesan = "hallo ini adalah sysparam controller";
        pgDataSource.closeDataSource();
        for (SystemParameter parameter : list) {
            System.out.println(parameter.getCompanyId());
            System.out.println(parameter.getNvpref());
            System.out.println(parameter.getNxtinvno());
        }
//        GenericEntity<List<SystemParameter>> entity = new GenericEntity<List<SystemParameter>>(list) {};
        GenericEntity entity = new GenericEntity< List<SystemParameter>>(list) {
        };

        return list.toString();
    }
}
