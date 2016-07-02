/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.java.dao.LoginDao;
import java.sql.Connection;

/**
 *
 * @author Pinkesh
 */
public class LoginDaoImpl implements LoginDao {

    DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public boolean isValidUser(String username, String password) throws SQLException {
        String query = "Select count(1) from user where Email = ? and password = ?";
        Connection con = dataSource.getConnection();
        PreparedStatement statement = con.prepareStatement(query);
        statement.setString(1, username);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return (resultSet.getInt(1) > 0);
        } else {
            return false;
        }
    }

}
