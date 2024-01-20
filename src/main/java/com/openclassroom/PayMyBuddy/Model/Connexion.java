package com.openclassroom.PayMyBuddy.Model;

//import java.util.ArrayList;
//import java.util.List;

public class Connexion {
    private String nom;
    private boolean active;

    public Connexion(String nom, boolean active) {
        this.nom = nom;
        this.active = active;
    }

    public String getNom() {
        return nom;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Connexion{" +
                "nom='" + nom + '\'' +
                ", active=" + active +
                '}';
    }
}
