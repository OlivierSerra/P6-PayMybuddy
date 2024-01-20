package com.openclassroom.PayMyBuddy.Utils;

import com.openclassroom.PayMyBuddy.Model.ListOfConnexions;
import com.openclassroom.PayMyBuddy.Repository.ListOfConnexionsRepository;
//import com.openclassroom.PayMyBuddy.Model.Connexion;

import java.util.ArrayList;
import java.util.List;

public class MyListOfConnexion {

    private ListOfConnexionsRepository listOfConnexionsRepository;

    public MyListOfConnexion(ListOfConnexionsRepository listOfConnectionsRepository) {
        this.listOfConnexionsRepository = listOfConnexionsRepository;
    }
    
    public List<ListOfConnexions> creerListePersonnelle() {

        Iterable<ListOfConnexions> listeGlobale = getListOfConnections();

        List<ListOfConnexions> listePersonnelle = new ArrayList<>();

        for (ListOfConnexions connexion: listeGlobale) {
            if (connexion != null) {
                listePersonnelle.add(connexion);
            }
        }
        return listePersonnelle;
    }

    public Iterable <ListOfConnexions> getListOfConnections() {
        return listOfConnexionsRepository.findAll();
    }
}
