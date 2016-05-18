/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.utils;

import com.mycompany.jdbcdaoservicepattern.config.PgDataSource;
import com.mycompany.jdbcdaoservicepattern.config.impl.PgDataSourceImpl;
import com.mycompany.jdbcdaoservicepattern.dao.SystemParameterDao;
import com.mycompany.jdbcdaoservicepattern.services.SystemParameterService;
import com.mycompany.jdbcdaoservicepattern.services.impl.SystemParameterServiceImpl;
import javax.ws.rs.ApplicationPath;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author juang
 */
@ApplicationPath("resources")
public class MyResourceConfig extends ResourceConfig {

    public MyResourceConfig() {
        packages("com.mycompany.jdbcdaoservicepattern.controller");
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(PgDataSourceImpl.class).to(PgDataSource.class);
                bind(SystemParameterServiceImpl.class).to(SystemParameterService.class);
                bind(SystemParameterServiceImpl.class).to(SystemParameterService.class);
//                        .proxy(true).proxyForSameScope(false).in(RequestScoped.class);
            }
        });

    }
}
