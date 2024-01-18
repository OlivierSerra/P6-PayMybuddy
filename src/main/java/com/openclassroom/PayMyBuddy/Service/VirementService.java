package com.openclassroom.PayMyBuddy.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openclassroom.PayMyBuddy.Model.Destinataire;
import com.openclassroom.PayMyBuddy.Model.Virement;
import com.openclassroom.PayMyBuddy.Repository.VirementRepository;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Id;

@Service
public class VirementService {

    @Autowired
    private VirementRepository virementRepository;

    public Iterable<Virement> getVirement() {
        return virementRepository.findAll();
    }

    public Optional <Virement> getVirement(int ID) {
        return virementRepository.findById(ID);
    }
    
    public @NonNull Virement saveVirement(int ID) {
        Virement addedVirement = virementRepository.saveVirement(ID);
        return addedVirement;
    }

    public Virement deleteVirement(int ID) {
        Virement deletedVirement = virementRepository.deleteVirement(ID); 
        return deletedVirement;
    }

    public Destinataire updateEmetteurs(int ID) {
        return virementRepository.updateVirement(ID);   
    }
}
