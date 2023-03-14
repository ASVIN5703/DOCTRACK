package com.doctrackapp.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	 @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	 
	  private int doc_id;
	 @Column(name="doc_name")
      private String doc_name;
	 @Column(name="doc_phone_no")
      private String doc_phone_no;
	 @Column(name="doc_specialization")
      private String doc_specialization;
	 @Column(name=" doc_availabletime")
      private String doc_availabletime;
	 @Column(name="doc_email")
      private String doc_email;
	 @Column(name="doc_pin")
	 private int doc_pin;
       public int getDoc_pin() {
		return doc_pin;
	}
	public void setDoc_pin(int doc_pin) {
		this.doc_pin = doc_pin;
	}
	public int getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(int doc_id) {
		this.doc_id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public String getDoc_phone_no() {
		return doc_phone_no;
	}
	public void setDoc_phone_no(String doc_phone_no) {
		this.doc_phone_no = doc_phone_no;
	}
	public String getDoc_specialization() {
		return doc_specialization;
	}
	public void setDoc_specialization(String doc_specialization) {
		this.doc_specialization = doc_specialization;
	}
	public String getDoc_availabletime() {
		return doc_availabletime;
	}
	public void setDoc_availabletime(String doc_availabletime) {
		this.doc_availabletime = doc_availabletime;
	}
	public String getDoc_email() {
		return doc_email;
	}
	public void setDoc_email(String doc_email) {
		this.doc_email = doc_email;
	}
	   @Override
	public String toString() {
		return "Doctor [doc_id=" + doc_id + ", doc_name=" + doc_name + ", doc_phone_no=" + doc_phone_no
				+ ", doc_specialization=" + doc_specialization + ", doc_availabletime=" + doc_availabletime
				+ ", doc_email=" + doc_email + ", doc_pin=" + doc_pin + "]";
	}
	
       
}
