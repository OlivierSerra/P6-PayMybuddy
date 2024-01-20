package com.openclassroom.PayMyBuddy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.openclassroom.PayMyBuddy.Model.Destinataire;
import com.openclassroom.PayMyBuddy.Model.Virement;

@Repository
public interface VirementRepository extends JpaRepository<Virement, Integer>{

    Virement findVirement(int id);

    Virement saveVirement(int id);

    Virement deleteVirement(int id);

    Destinataire updateVirement(int iD);

}
