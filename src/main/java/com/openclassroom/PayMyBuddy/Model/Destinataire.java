package com.openclassroom.PayMyBuddy.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="Destinataire")
public class Destinataire {
     //n'existe pas dans la table destinataire - a rajouter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;
    
    @Column(name ="MF")
    private String MF;   
    
    @Column(name = "nom")
    private String nom;
    
    @Column(name = "prenom")
    private String prenom;
    
    @Column(name =" adresse")
    private String adresse;
    
    @Column(name = "email")
    private String email;
    
    @Column(name ="telephone")
    private int telephone;
    
    @Column(name ="initial_amount")
    private int initial_amount;


}
