package com.openclassroom.PayMyBuddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.openclassroom.PayMyBuddy.Model.Destinataire;

@Repository
public interface DestinataireRepository extends JpaRepository<Destinataire, Integer>{

    Destinataire findDestinataire(int iD);

    Destinataire saveDestinataire(int iD);

    Destinataire deleteDestinataire(int iD);

    Destinataire updatedestinataire(int iD);

    public Iterable<Destinataire> findByName(String name);

    public Iterable<Destinataire> findByVirementAndName(int ID, String name);
    
}
