package com.doctrackapp.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctrackapp.webapp.model.Doctor;
import com.doctrackapp.webapp.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	private DoctorRepository docrepo;
	@Override
	public List<Doctor> getAllDoctors(){
    	return docrepo.findAll();
    }
	@Override
	public void saveDoctor(Doctor doctor) {
        this.docrepo.save(doctor);
    }
	 @Override
	    public Doctor getDoctorById(int id) {
		 System.out.println("Executed servidce dovtor id");
	        Optional < Doctor > optional = docrepo.findById(id);
	        Doctor doctor = null;
	        if (optional.isPresent()) {
	           doctor= optional.get();
	        } else {
	            throw new RuntimeException(" Doctor not found for id :: " + id);
	        }
	        return doctor;
	    }

	   @Override
	    public void deleteDoctorById(int id) {
	        this.docrepo.deleteById(id);
	    }
//	public List<Doctor> getNearby(String doc_pin) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
