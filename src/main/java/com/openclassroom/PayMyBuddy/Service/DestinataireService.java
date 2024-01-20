package com.openclassroom.PayMyBuddy.Service;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openclassroom.PayMyBuddy.Model.Destinataire;
import com.openclassroom.PayMyBuddy.Repository.DestinataireRepository;

//import jakarta.persistence.Id;

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
/*
    public Iterable <Destinataire> getDestinataireByName(String name) {
        return DestinataireRepository.findByName(name);
    }
 */
    public Destinataire saveDestinataire(Destinataire destinataire) {
        Objects.requireNonNull(destinataire, "Destinataire cannot be null");

        Destinataire addedDestinataire = destinataireRepository.save(destinataire);

        return addedDestinataire;
    }

    public Destinataire updateDestinataire(int ID) {
        return destinataireRepository.updatedestinataire(ID);   
    }
    
    //
    public void deleteDestinataireById (int id) {
        destinataireRepository.deleteById(id);
    }
/*     
    //but: avoir tous les virements pour un destinataire. Il n'a plus qu'à vérifier s'il a reçu le virment
    public Iterable <Destinataire> getDestinataireByVirementConnexion(int Connexion) {
        return  destinataireRepository.findByVirementAndConnexion(int Connexion);
    }
 */
    

    }
