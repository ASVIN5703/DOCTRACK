package com.doctrackapp.webapp.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.doctrackapp.webapp.model.Doctor;
@Component("ds")
public interface DoctorService {
   List<Doctor> getAllDoctors();
   void saveDoctor(Doctor doctor);
   Doctor getDoctorById(int doc_id);
   void deleteDoctorById(int id);
  // List<Doctor> getNearby();
  
}
