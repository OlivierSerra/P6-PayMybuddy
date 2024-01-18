package com.openclassroom.PayMyBuddy.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.openclassroom.PayMyBuddy.Model.ListOfConnections;
import com.openclassroom.PayMyBuddy.Repository.ListOfConnectionsRepository;

import jakarta.persistence.Id;

@Service
public class ListOfConnectionsService {

    @Autowired
    private ListOfConnectionsRepository listOfConnectionsRepository;
    
    public Iterable <ListOfConnections> getListOfConnections() {
        return listOfConnectionsRepository.findAll();
    }

    public Optional <ListOfConnections> getListOfConnectionsById(int Id) {
        return listOfConnectionsRepository.findById(Id);
    }

    public ListOfConnections saveListOfConnections(int Id) {
        ListOfConnections addedListOfConnections = listOfConnectionsRepository.saveListOfConnections(Id);
        return addedListOfConnections;
    }

    public ListOfConnections deleteListOfConnections(int Id) {
        ListOfConnections deletedListOfConnections = listOfConnectionsRepository.deleteListOfConnections(Id);
        return deletedListOfConnections;
    }

    public ListOfConnections updateListOfConnections(int Id) {
        return listOfConnectionsRepository.updateListOfConnections(Id);
    }
}
