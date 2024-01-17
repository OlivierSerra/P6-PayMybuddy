package com.openclassroom.PayMyBuddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.openclassroom.PayMyBuddy.Model.Virement;

@Repository
public interface VirementRepository extends JpaRepository<Virement, Integer>{
    
}
