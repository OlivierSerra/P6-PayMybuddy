package com.openclassroom.PayMyBuddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openclassroom.PayMyBuddy.Model.Destinataire;
import com.openclassroom.PayMyBuddy.Model.Emetteurs;

@Repository
public interface EmetteursRepository extends JpaRepository<Emetteurs, Integer>{

    
    Emetteurs saveEmetteurs(int iD);

    Emetteurs deleteEmetteurs(int iD);

    Emetteurs updateEmetteurs(int iD);
    
}
