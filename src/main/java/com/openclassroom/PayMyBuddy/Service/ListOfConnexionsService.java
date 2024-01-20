package com.openclassroom.PayMyBuddy.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openclassroom.PayMyBuddy.Model.Connexion;
import com.openclassroom.PayMyBuddy.Model.ListOfConnexions;
import com.openclassroom.PayMyBuddy.Repository.ListOfConnexionsRepository;

@Service
public class ListOfConnexionsService {

     private List<Connexion> connexions;

    @Autowired
    private ListOfConnexionsRepository listOfConnectionsRepository;
    
    public Iterable <ListOfConnexions> getListOfConnections() {
        return listOfConnectionsRepository.findAll();
    }

    public Optional <ListOfConnexions> getListOfConnectionsById(int Id) {
        return listOfConnectionsRepository.findById(Id);
    }

    public ListOfConnexions saveListOfConnections(int Id) {
        ListOfConnexions addedListOfConnections = listOfConnectionsRepository.saveListOfConnections(Id);
        return addedListOfConnections;
    }

    public ListOfConnexions deleteListOfConnections(int Id) {
        ListOfConnexions deletedListOfConnections = listOfConnectionsRepository.deleteListOfConnections(Id);
        return deletedListOfConnections;
    }

    public ListOfConnexions updateListOfConnections(int Id) {
        return listOfConnectionsRepository.updateListOfConnections(Id);
    }
    
    // me constituer une liste personnelle à partir de la liste globale des connexions
    public void ListeGlobaleConnections() {
        this.connexions = new ArrayList<>();
        this.connexions.add(new Connexion("Connexion", true));
    }

    public Iterable <Connexion> getListeGlobale() {
        return connexions;
    }
}
