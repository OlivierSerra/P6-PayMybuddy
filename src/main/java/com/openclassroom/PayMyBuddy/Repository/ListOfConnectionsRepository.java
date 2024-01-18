package com.openclassroom.PayMyBuddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openclassroom.PayMyBuddy.Model.Destinataire;
import com.openclassroom.PayMyBuddy.Model.ListOfConnections;

@Repository
public interface ListOfConnectionsRepository extends JpaRepository<ListOfConnections, Integer>{

    ListOfConnections saveListOfConnections(int iD);

    ListOfConnections deleteListOfConnections(int iD);

    ListOfConnections updateListOfConnections(int iD);
    
}
