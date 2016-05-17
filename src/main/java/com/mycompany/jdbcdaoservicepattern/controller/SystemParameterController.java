/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author juang
 */
@Path("/")
public class SystemParameterController {
    private String pesan;
    @GET
    @Produces("text/plain")
    @Path("hallo")
    public String getIt() {
        return pesan = "hallo ini adalah sysparam controller";
    }
}
