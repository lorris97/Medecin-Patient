/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.medecin;

import com.mycompany.patient.Patient;

/**
 *
 * @author lorris
 */
public class Medecin {
    private String nom;
    private String Prenom;
    private Patient p;

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    
    
    
    
    public String consulter(Patient p)
    {
        String s = "";
        
        s = "Le patient " + p.getPrenom() + " " + p.getNom() + " est atteint des symptomes  " + p.getSymptomes() + " il est atteint d'une grippe ";
        
        
        
        return s ;
    }
            
    
    
    
    
}
