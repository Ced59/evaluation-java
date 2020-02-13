package fr;

import java.util.ArrayList;

/**
 * Hotel
 */
public class Hotel {

    private String nom;
    private ArrayList<Chambre> chambres;
    private int nbreChbres;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }

    public int getNbreChbres() {
        return nbreChbres;
    }

    public void setNbreChbres(int nbreChbres) {
        this.nbreChbres = nbreChbres;
    }

    public Hotel(String nom, int nbreChbres, int nbreEtages) {
        this.nom = nom;
        this.nbreChbres = nbreChbres;
        this.chambres = new ArrayList<>();
        this.chambres = determineChambres(nbreChbres, nbreEtages);
    }

    private ArrayList<Chambre> determineChambres(int nbreChbres, int nbreEtages) {
        int noChbre;
        int nbreChbrePerEtage = nbreChbres / nbreEtages;


        for (int i = 1; i <= nbreEtages; i++){
            for (int j = 0; j < nbreChbrePerEtage; j++){
                noChbre = Integer.parseInt(i + "" + j);

                if (j < 4){
                    Chambre chambre = new Chambre(noChbre, "simple");
                    chambres.add(chambre);
                }
                else if (j == nbreChbrePerEtage - 1){
                    Chambre chambre = new Chambre(noChbre, "suite");
                    chambres.add(chambre);
                }
                else {
                    Chambre chambre = new Chambre(noChbre, "double");
                    chambres.add(chambre);
                }

            }
        }
    }

    public int nbreChambresOccupees(){
        int nbreChambreLibres = 0;
        for (Chambre c : chambres){
            if (c.getNomOccupant() == null){
                nbreChambreLibres++;
            }
        }
        return (this.nbreChbres - nbreChambreLibres);
    }
}
