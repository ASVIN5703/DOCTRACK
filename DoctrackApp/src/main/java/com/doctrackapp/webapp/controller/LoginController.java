package com.doctrackapp.webapp.controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@Controller
public class LoginController {
	
	
	@GetMapping("/login")
	public String viewLogin() {
		return"AdminLogin";
	}
	   @PostMapping(path="/login")
	     
	      public String adminVerify(ModelMap model,@RequestParam String admin_id,@RequestParam String admin_password)
	      {   if(admin_id.equals("root")&&admin_password.equals("Asvin"))
	         {    return "redirect:/home";
	    		  
	         }
	         model.put("errorMsg", "Enter crtly");
	          
	    	  return "AdminLogin";
	      }
	      
    
}
