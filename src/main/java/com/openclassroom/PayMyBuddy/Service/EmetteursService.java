package com.openclassroom.PayMyBuddy.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openclassroom.PayMyBuddy.Model.Emetteurs;
import com.openclassroom.PayMyBuddy.Repository.EmetteursRepository;

//import jakarta.persistence.Id;

@Service
public class EmetteursService {

    @Autowired
    private EmetteursRepository emetteursRepository;
    
    public Iterable <Emetteurs> getEmetteurs() {
        return emetteursRepository.findAll();
    }
    
    public Optional <Emetteurs> getEmetteursById(int ID) {
        return emetteursRepository.findById(ID);
    } 

    public Emetteurs saveEmetteurs(int ID) {
        Emetteurs addedEmetteurs = emetteursRepository.saveEmetteurs(ID);
        return addedEmetteurs;
    }
    
    public Emetteurs deleteEmetteurs(int ID) {
        return emetteursRepository.deleteEmetteurs(ID);
    }

    public Emetteurs updateEmetteurs(int ID) {
        return emetteursRepository.updateEmetteurs(ID);   
    }

    // Avoir tous les virements émis par un émetteur
    public Iterable <Emetteurs> getEmetteursByVirementConnexion (int ID) {
        return emetteursRepository.findByVirementAndConnexion( ID);
    }
}
