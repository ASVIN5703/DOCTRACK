package com.doctrackapp.webapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctrackapp.webapp.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
