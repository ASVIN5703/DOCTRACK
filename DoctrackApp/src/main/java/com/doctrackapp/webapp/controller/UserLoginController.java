package com.doctrackapp.webapp.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Configuration
@Controller
public class UserLoginController {
	@GetMapping("/userlogin")
	public String userlogin() {
		return "userlogin";
	}
	 @PostMapping(path="/userlogin")
     
     public String auserVerify(ModelMap model,@RequestParam String user_id,@RequestParam String user_password)
     {   if(user_id.equals("user")&&user_password.equals("Asvin"))
        {    return "usersearch";
   		  
        }
        model.put("errorMsg", "Enter crtly");
         
   	  return "userlogin";
     }
	 @GetMapping(path="/usersearch")
	 public String pincode() {
		 
		 return "home";
	 }
	 
      
}
