package com.doctrackapp.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.doctrackapp.webapp.model.Admin;
import com.doctrackapp.webapp.repository.AdminRepository;


public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adrepo;
	
	public void saveLogin(Admin admin) {
        this.adrepo.save(admin);
    }
}
