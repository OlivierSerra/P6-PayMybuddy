package com.openclassroom.PayMyBuddy.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="virement")
public class Virement {
    
    //A RAJOUTER DANS LA TABLE - N'EXISTE PAS 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="virement_ID")
    private int virement_ID;
    
    @Column(name ="connexion")
    private String connexion;
    
    @Column(name ="description")
    private String description;
    
    @Column(name="amount")
    private String Amount;

    public int getVirement_ID() {
        return this.virement_ID;
    }

    public void setVirement_ID(int virement_ID) {
        this.virement_ID = virement_ID;
    }

    public String getConnexion() {
        return this.connexion;
    }

    public void setConnexion(String connexion) {
        this.connexion = connexion;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return this.Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

}
