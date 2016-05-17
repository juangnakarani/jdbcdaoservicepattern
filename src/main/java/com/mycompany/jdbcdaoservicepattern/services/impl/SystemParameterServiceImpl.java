/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.services.impl;

import com.mycompany.jdbcdaoservicepattern.dao.SystemParameterDao;
import com.mycompany.jdbcdaoservicepattern.models.SystemParameter;
import com.mycompany.jdbcdaoservicepattern.services.SystemParameterService;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

/**
 *
 * @author juang
 */
@Named("syspramservice")
public class SystemParameterServiceImpl implements SystemParameterService{
    private Connection connection;
    @Inject
    private @Named("sysparamdao") SystemParameterDao systemParameterDao;
    
    @Override
    public void setDataSource(DataSource dataSource){
        try {
            connection = dataSource.getConnection();
            systemParameterDao.setConnection(connection);
        } catch (SQLException ex) {
            Logger.getLogger(SystemParameterServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    public List<SystemParameter> getSystemParameters(){
        try {
            return systemParameterDao.getAll();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return new ArrayList<>();
    }
}
