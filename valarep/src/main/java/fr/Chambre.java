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
    
}


