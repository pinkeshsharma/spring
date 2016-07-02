/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.controller;

import com.java.delegate.LoginDelegate;
import com.java.model.LoginBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Pinkesh
 */
@Controller
public class CustomController {

    @Autowired
    private LoginDelegate loginDelegate;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("login");
        LoginBean loginBean = new LoginBean();
        model.addObject("loginBean", loginBean);
        return model;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean") LoginBean loginBean) {
        ModelAndView model = null;
        try {
            boolean isValidUser = loginDelegate.isValidUser(loginBean.getUsername(), loginBean.getPassword());
            if (isValidUser) {
                System.out.println("User Login Successful");
                HttpSession session = request.getSession();
                session.setAttribute("loggedInUser", loginBean.getUsername());
                model = new ModelAndView("welcome");
                
                request.setAttribute("message", "Hello, Welcome..!!");
            } else {
                model = new ModelAndView("login");
                model.addObject("loginBean", loginBean);
                request.setAttribute("message", "Invalid credentials!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            model = new ModelAndView("welcome");
            request.setAttribute("message", e);
        }

        return model;
    }
    
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView displaySignup(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("signup");
        LoginBean loginBean = new LoginBean();
        model.addObject("loginBean", loginBean);
        return model;
    }
    
    @RequestMapping(value = "/map", method = RequestMethod.GET)
    public ModelAndView displayMap(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("map");
        
        return model;
    }
}
