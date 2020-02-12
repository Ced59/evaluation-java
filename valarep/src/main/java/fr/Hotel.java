package fr;

import java.util.ArrayList;

/**
 * Hotel
 */
public class Hotel {

    private String nom;
    private ArrayList<Chambre> chambres;
    private int nbreChbres;


    public Hotel(String nom, int nbreChbres, int nbreEtages) {
        this.nom = nom;
        this.nbreChbres = nbreChbres;
        
    }
}