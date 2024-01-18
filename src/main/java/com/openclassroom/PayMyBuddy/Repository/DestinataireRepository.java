package com.openclassroom.PayMyBuddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.openclassroom.PayMyBuddy.Model.Destinataire;

@Repository
public interface DestinataireRepository extends JpaRepository<Destinataire, Integer>{

    Destinataire saveDestinataire(int iD);

    Destinataire deleteDestinataire(int iD);

    Destinataire updatedestinataire(int iD);

}
