package fr;

/**
 * Chambre
 */
public class Chambre {

    private int noChbre;
    private int joursRestants;
    private String nomOccupant;
    private String type;


    public Chambre(int noChbre, String type) {
        this.joursRestants = 0;
        this.nomOccupant = null;
        this.noChbre = noChbre;
        if (type == "double" || type == "suite"){
            this.type = type;
        }
        else {
            this.type = "simple";
        }
    }


    public boolean definirOccupant(String nomOccupant, int nbreJoursRestants){
        boolean check = false;

        if (this.nomOccupant == null)
        {
            check = true;
            this.nomOccupant = nomOccupant;
            this.joursRestants = nbreJoursRestants;
        }
        else {
            check = false;
        }
        return check;
    }

    public void jourSuivant(){
        if (this.joursRestants >= 1){
            this.joursRestants --;
        }
        
        if (this.joursRestants == 0){
            this.nomOccupant = null;
        }
    }

    public String toString(){
        String texte;
        String statut;
        if (this.nomOccupant != null){
            statut = "louée";
        }
        else {
            statut = "libre";
        }

        texte = "Chambre " + this.noChbre + ":" + this.type + " - " + statut;


        return texte;
    }
    
}


