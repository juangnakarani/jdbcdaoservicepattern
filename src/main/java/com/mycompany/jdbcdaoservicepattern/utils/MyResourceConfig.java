/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.utils;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;



/**
 *
 * @author juang
 */ 
@ApplicationPath("resources")
public class MyResourceConfig extends ResourceConfig {
    public MyResourceConfig() {
        packages("com.mycompany.jdbcdaoservicepattern.controller");
    }
}
