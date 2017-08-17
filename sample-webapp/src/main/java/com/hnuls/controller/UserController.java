package com.hnuls.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hnuls.pojo.User;
import com.hnuls.service.UserService;

@Controller
public class UserController {
	@Resource    
    private UserService userService;
        
    @RequestMapping("/showUser")
    public String toShowUser(HttpServletRequest request,Model model){    
        int userId = Integer.parseInt(request.getParameter("id"));    
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
    
    @RequestMapping("/findUser")
    public String toFindUser(HttpServletRequest request, Model model){
    	return "findUser";
    }
}
