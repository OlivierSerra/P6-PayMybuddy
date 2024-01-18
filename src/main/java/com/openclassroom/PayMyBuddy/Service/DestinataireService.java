package com.openclassroom.PayMyBuddy.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openclassroom.PayMyBuddy.Model.Destinataire;
import com.openclassroom.PayMyBuddy.Repository.DestinataireRepository;

import jakarta.persistence.Id;

@Service
public class DestinataireService {

    @Autowired
    private DestinataireRepository destinataireRepository; 

    public DestinataireService(DestinataireRepository destinataireRepository) {
        this.destinataireRepository = destinataireRepository;
    }
    

    public Iterable<Destinataire> getDestinataire() {
        return destinataireRepository.findAll();
    }

    public Optional <Destinataire> getDestinataireById(int Id){
        return destinataireRepository.findById(Id);
    }

    public Destinataire saveDestinataire(int ID) {
        Destinataire addedDestinataire = destinataireRepository.saveDestinataire(ID);
        return addedDestinataire;
    }

    public Destinataire deleteDestinataire(int ID) {
        return destinataireRepository.deleteDestinataire(ID);
    }

    public Destinataire updateDestinataire(int ID) {
        return destinataireRepository.updatedestinataire(ID);   
    }
}
