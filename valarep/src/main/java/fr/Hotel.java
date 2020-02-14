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

        if (nbreChbrePerEtage < 5){
            System.out.println("Il vous faut minimum 5 chambres par étage!");
            System.exit(0);
        }

        if (nbreChbrePerEtage >= 100){
            System.out.println("Il ne doit pas y avoir plus de 100 chambres par étage!");
            System.exit(0);
        }

        for (int i = 1; i <= nbreEtages; i++){
            for (int j = 0; j < nbreChbrePerEtage; j++){
                if (j <10) {
                    noChbre = Integer.parseInt(i + "0" + j);
                } else {
                    noChbre = Integer.parseInt(i + "" + j);
                }


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
        return chambres;
    }

    public int nbreChambresOccupees(){
        int nbreChambreLibres = 0;
        for (Chambre c : this.chambres){
            if (c.getNomOccupant() == null){
                nbreChambreLibres++;
            }
        }
        return (this.nbreChbres - nbreChambreLibres);
    }

    public int nbreChambresLibres(){
        int nbreChambreLibres = 0;
        for (Chambre c : this.chambres){
            if (c.getNomOccupant() == null){
                nbreChambreLibres++;
            }
        }
        return nbreChambreLibres;
    }

    public double tauxOccupation(){
        return ((double)nbreChambresOccupees()/(double)this.nbreChbres * 100);
    }

    public boolean louerChbre(String type, String nom, int nbreJours){

        for (Chambre c : this.chambres){
            if (c.getNomOccupant() == null && c.getType().equals(type)){
                c.definirOccupant(nom, nbreJours);
                return true;
            }
        }
        System.out.println("Il n'y a plus de chamnbre libre correspondant aux critères.");
        return false;
    }

    public void jourSuivant(){
        for (Chambre c : this.chambres){
            c.jourSuivant();
        }
    }

    public String toString(){
        StringBuilder texte = new StringBuilder();
        String newLine = System.getProperty("line.separator");

        texte = new StringBuilder("Hôtel " + this.nom + " : " + this.tauxOccupation() + " % d'occupation. Voici la liste des chambres: " + newLine);

        for (Chambre c : this.chambres){
            String statut = "";
            if (c.getNomOccupant() == null){
                statut = "libre";
            }
            else {
                statut = "louée";
            }
            texte.append("Chamnbre ").append(c.getNoChbre()).append(" : ").append(c.getType()).append(" - ").append(statut).append(newLine);
        }

        return texte.toString();
    }
}
