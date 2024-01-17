package com.openclassroom.PayMyBuddy.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="produit")
public class Emetteurs {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ID")
    private int ID;

    @Column(name ="MF")
    private String MF;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prénom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name ="email")
    private String email;

    @Column(name ="telephone")
    private int telephone;

    @Column(name = "initial_amount")
    private int initial_amount;

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMF() {
        return this.MF;
    }

    public void setMF(String MF) {
        this.MF = MF;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return this.prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return this.telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getInitial_amount() {
        return this.initial_amount;
    }

    public void setInitial_amount(int initial_amount) {
        this.initial_amount = initial_amount;
    }

}
