package com.estudiantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudiantes.model.User;



@Repository
public interface I_UserRepository extends JpaRepository <User,Long> {


    
}