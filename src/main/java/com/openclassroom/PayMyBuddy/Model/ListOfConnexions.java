package com.openclassroom.PayMyBuddy.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="ListOfConnections")
public class ListOfConnexions {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name ="connections_id")
    private int connections_id;

    @Column (name ="connections1_nom")
    private String connections1_nom;
    
    @Column (name ="connections1_prenom")
    private String connections1_prenom;

    public String getConnections1_nom() {
        return this.connections1_nom;
    }

    public void setConnections1_nom(String connections1_nom) {
        this.connections1_nom = connections1_nom;
    }

    public String getConnections1_prenom() {
        return this.connections1_prenom;
    }

    public void setConnections1_prenom(String connections1_prenom) {
        this.connections1_prenom = connections1_prenom;
    }

    public String getConnections2_nom() {
        return this.connections2_nom;
    }

    public void setConnections2_nom(String connections2_nom) {
        this.connections2_nom = connections2_nom;
    }

    public String getConnections2_prenom() {
        return this.connections2_prenom;
    }

    public void setConnections2_prenom(String connections2_prenom) {
        this.connections2_prenom = connections2_prenom;
    }
    
    // a supprimer de la table
    @Column (name= "connections2_nom")
    private String connections2_nom;
    
    // a supprimer de la table
    @Column (name ="connections2_prenom")
    private String connections2_prenom;

}
