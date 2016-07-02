/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.service;

import java.sql.SQLException;

/**
 *
 * @author Pinkesh
 */
public interface LoginService
{
	public boolean isValidUser(String username, String password) throws SQLException;
}
