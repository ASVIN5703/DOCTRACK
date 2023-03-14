package com.doctrackapp.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.doctrackapp.webapp.model.Doctor;
import com.doctrackapp.webapp.service.DoctorService;
@Configuration
@Controller
public class DoctorController {
	//display all docs 	
	@GetMapping("/")
	public String lo() {
		return "redirect:/login";
	}
	@Autowired
	private DoctorService docService;
	@GetMapping("/home")
	public String viewDoctors(Model model) {
		model.addAttribute("listdoctors",docService.getAllDoctors());
		return "index";
	}
	@GetMapping("/showNewDoctorForm")
    public String showNewDoctorForm(Model model) {
        // create model attribute to bind form data
       Doctor doctor = new  Doctor();
        model.addAttribute("doctor", doctor);
        return "new_doctor";
    }
//	String doc_pin="";
//	 @PostMapping(path="/usersearch")
	 
//	 public String pincode(@RequestParam String doc_pin) {
//		 this.doc_pin=doc_pin;
//		 return "redirect:/userlogin";
//	 }
////      @GetMapping("/view")
//      public String viewnearby(Model m) {
//    	
//    	  m.addAttribute("nearbydoc",docService.getNearby(doc_pin));
//    	  
//    	  return "";
//      }
    @PostMapping("/saveDoctor")
    public String saveDoctor(@ModelAttribute("doctor") Doctor doctor) {
        // save employee to database
        docService.saveDoctor(doctor);
        return "redirect:/home";
    }
   
   
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {

        // get doc from the service
        Doctor doctor= this.docService.getDoctorById( (int)id);
        System.out.println("Came to showformaain");
         // System.out.println(docService.getDoctorById( doc_id));
        // set doctor as a model attribute to pre-populate the form
        model.addAttribute("doctor", doctor);
        System.out.println("model added");
        return "updatedoctor";
    }

    @GetMapping("/deleteDoctor/{id}")
    public String deleteDoctor(@PathVariable(value = "id") int id) {

        // call delete employee method 
        this.docService.deleteDoctorById((int) id);
        return "redirect:/home";
    }
    
}
