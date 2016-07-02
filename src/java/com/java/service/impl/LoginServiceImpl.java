/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.service.impl;

import com.java.dao.LoginDao;
import com.java.service.LoginService;
import java.sql.SQLException;

/**
 *
 * @author Pinkesh
 */
public class LoginServiceImpl implements LoginService {

    private LoginDao loginDao;

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    @Override
    public boolean isValidUser(String username, String password) throws SQLException {
        return loginDao.isValidUser(username, password);
    }

}
