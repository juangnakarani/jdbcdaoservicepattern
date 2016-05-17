/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jdbcdaoservicepattern.models;

/**
 *
 * @author juang
 */
public class SystemParameter {
    private String companyId;
    private boolean autoinvno;
    private int nxtinvno;
    private String nvpref;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public boolean isAutoinvno() {
        return autoinvno;
    }

    public void setAutoinvno(boolean autoinvno) {
        this.autoinvno = autoinvno;
    }

    public int getNxtinvno() {
        return nxtinvno;
    }

    public void setNxtinvno(int nxtinvno) {
        this.nxtinvno = nxtinvno;
    }

    public String getNvpref() {
        return nvpref;
    }

    public void setNvpref(String nvpref) {
        this.nvpref = nvpref;
    }
    
}
