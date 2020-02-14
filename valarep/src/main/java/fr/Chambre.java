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
        if (type.equals("double") || type.equals("suite")){
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
            System.out.println(nomOccupant + " a loué la chambre n° " + this.getNoChbre() + " pour " + nbreJoursRestants + " jours.");
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


    public int getNoChbre() {
        return noChbre;
    }

    public void setNoChbre(int noChbre) {
        this.noChbre = noChbre;
    }

    public int getJoursRestants() {
        return joursRestants;
    }

    public void setJoursRestants(int joursRestants) {
        this.joursRestants = joursRestants;
    }

    public String getNomOccupant() {
        return nomOccupant;
    }

    public void setNomOccupant(String nomOccupant) {
        this.nomOccupant = nomOccupant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


