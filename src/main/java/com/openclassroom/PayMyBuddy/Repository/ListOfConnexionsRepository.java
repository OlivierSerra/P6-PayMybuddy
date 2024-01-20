package com.openclassroom.PayMyBuddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.openclassroom.PayMyBuddy.Model.ListOfConnexions;

@Repository
public interface ListOfConnexionsRepository extends JpaRepository<ListOfConnexions, Integer>{

    ListOfConnexions findListOfConnections(int iD);

    ListOfConnexions saveListOfConnections(int iD);

    ListOfConnexions deleteListOfConnections(int iD);

    ListOfConnexions updateListOfConnections(int iD);
    
}
