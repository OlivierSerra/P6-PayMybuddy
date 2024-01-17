package com.openclassroom.PayMyBuddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openclassroom.PayMyBuddy.Model.Emetteurs;

@Repository
public interface EmetteursRepository extends JpaRepository<Emetteurs, Integer>{
    
}
