/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.services;

import com.mycompany.jdbcdaoservicepattern.models.SystemParameter;
import java.util.List;
import javax.sql.DataSource;
import org.jvnet.hk2.annotations.Contract;

/**
 *
 * @author juang
 */
@Contract
public interface SystemParameterService {
    void setDataSource(DataSource dataSource);
    List<SystemParameter> getSystemParameters();
}
