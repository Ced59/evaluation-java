package fr;

import java.util.ArrayList;

public class Parking {

    private ArrayList<String> listImmatriculations;
    private ArrayList<String> listImmatricutationsPresentes;
    private int capaciteMax;


    public Parking() {
        
        listImmatriculations = new ArrayList<String>();
        listImmatricutationsPresentes = new ArrayList<String>();
    }




    public ArrayList<String> getListImmatriculations() {
        return listImmatriculations;
    }

    public void setListImmatriculations(ArrayList<String> listImmatriculations) {
        this.listImmatriculations = listImmatriculations;
    }

    public ArrayList<String> getListImmatricutationsPresentes() {
        return listImmatricutationsPresentes;
    }

    public void setListImmatricutationsPresentes(ArrayList<String> listImmatricutationsPresentes) {
        this.listImmatricutationsPresentes = listImmatricutationsPresentes;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public ArrayList<String> addAuthorizedImmatriculation(String immat) {

        if (!this.listImmatriculations.contains(immat)){
            this.listImmatriculations.add(immat);
        }
        
        return this.listImmatriculations;
    }


    public boolean enterParking(String immat) {

        if (this.capaciteMax == this.listImmatricutationsPresentes.size()){
            return false;
        }
        else{
            
            if (this.listImmatriculations.contains(immat)) {
                this.listImmatricutationsPresentes.add(immat);
                return true;
            }
            else {
                return false;
            }

        }

    }

    public boolean quitParking(String immat){

    }

}