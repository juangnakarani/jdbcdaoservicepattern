/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.dao;

import com.mycompany.jdbcdaoservicepattern.models.SystemParameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import org.jvnet.hk2.annotations.Service;

/**
 *
 * @author juang
 */
//@Service @Named
public class SystemParameterDao {

    private Connection connection;
    private PreparedStatement getAllStatement;
    private final String getAllQuery = "SELECT company_id, invpref,coalesce(nxtinvno,0)+1 as nxtinvno,idnpref,coalesce(nxtidnno,0)+1 as nxtidnno,icnpref,"
            + "       coalesce(nxticnno,0)+1 as nxticnno,odnpref,coalesce(nxtodnno,0)+1 as nxtodnno,ocnpref,"
            + "       coalesce(nxtocnno,0)+1 as nxtocnno,joupref,coalesce(nxtjouno,0)+1 as nxtjouno,joupref2,"
            + "       pvpref,coalesce(nxtpvno,0)+1 as nxtpvno,defRemInv,defRemIDN,defRemICN,defRemODN,defRemOCN,"
            + "       defRemJOU,"
            //above textfield tab general 
            //checkbox tab general
            + "       coalesce(autoinvno,false) as autoinvno,coalesce(autoidnno,false) as autoidnno,"
            + "       coalesce(autoicnno,false) as autoicnno,coalesce(autoodnno,false) as autoodnno,"
            + "       coalesce(autoocnno,false) as autoocnno,coalesce(autojouno,false) as autojouno,"
            + "       coalesce(autoocnno,false) as autoocnno,coalesce(autojouno,false) as autojouno,"
            //radio tab general  
            + "jouformat,pvformat,"
            //textfield def acc
            + "        accrdesc,realgdesc,realldesc,unrelgdesc,unrelldesc,cretransdesc,remmanjou,"
            + "       unrellapdesc,unrelgapdesc,remautojou, "
            //combo def acc
            + "       accracct,chrgsacct,realgacct,reallacct,unrellacct,unrelgacct,  "
            //below textfield ocbc
            + "       prdid,bankcurr,payamtcurr,payeectry,payloc,delmtd,resstatus,invfiller,gstacct "
            //        + ",TO_CHAR(a.acc_date_from,'DD/MM/YYYY') as date_from,TO_CHAR(a.acc_date_to,'DD/MM/YYYY') as date_to"
            + " FROM master.sys_param;";

    public void setConnection(Connection connection) throws SQLException {
        this.connection = connection;
        this.getAllStatement = this.connection.prepareStatement(getAllQuery);

    }

    public List<SystemParameter> getAll() throws SQLException {
        List<SystemParameter> list = new ArrayList<SystemParameter>();
        ResultSet rs = getAllStatement.executeQuery();
        while (rs.next()) {
            SystemParameter systemParameter = new SystemParameter();
            systemParameter.setCompanyId(rs.getString("company_id"));
            systemParameter.setAutoinvno(rs.getBoolean("autoinvno"));
            systemParameter.setNvpref(rs.getString("nvpref"));
            systemParameter.setNxtinvno(rs.getInt("nxtinvno"));
            list.add(systemParameter);
        }
        return list;
    }
}
