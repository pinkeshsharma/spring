/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.delegate;

import com.java.service.LoginService;
import java.sql.SQLException;

/**
 *
 * @author Pinkesh
 */
public class LoginDelegate
{
	private LoginService loginService;

	public LoginService getLoginService()
	{
		return this.loginService;
	}

	public void setLoginService(LoginService loginService)
	{
		this.loginService = loginService;
	}

	public boolean isValidUser(String username, String password) throws SQLException
	{
	    return loginService.isValidUser(username, password);
	}
}
