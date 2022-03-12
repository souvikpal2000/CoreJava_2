package com.ibm.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.mvcdemo.dao.UserDAO;
import com.ibm.mvcdemo.entity.User;

@Controller
public class UserController {
	@Autowired
	private UserDAO udao;
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("message", "Welcome to MVC");
		return "Display";
	}
	
	@GetMapping("/loginpage")
	public String sendLoginPage() {
		return "redirect:static/login.html";
	}
	
	@PostMapping("/authenticate")
	public String authenticateUser(@RequestParam("uname") String username, @RequestParam("pwd") String password, Model model) {
			User user = new User(username, password);
			String message = "Ooops... Invalid Username/Password.... Try Again!!";
			if(udao.findUser(user)) {
				message = "Spring web mvc Welcomes You";
			}
			model.addAttribute("message", message);
			return "Display";
	}
}	
