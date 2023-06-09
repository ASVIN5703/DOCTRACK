package com.doctrackapp.webapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	      @Id
	      @GeneratedValue(strategy=GenerationType.IDENTITY)
	      @Column(name="admin_name")
          private String username;
	      @Column(name="admin_password")
	      private String password;
	      public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
          @Override
		public String toString() {
			return "Admin [username=" + username + ", password=" + password + "]";
		}
		
}
