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






    public void setListImmatriculations(ArrayList<String> listImmatriculations) {
        this.listImmatriculations = listImmatriculations;
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
        if (!this.listImmatricutationsPresentes.contains(immat)){
            return false;
        }
        else {
            this.listImmatricutationsPresentes.remove(immat);
            return true;
        }
    }


    public boolean isInParking(String immat){
        return this.listImmatricutationsPresentes.contains(immat);
    }

    public boolean isFullParking(){
        if (this.capaciteMax == this.listImmatricutationsPresentes.size()){
            return true;
        }
        else {
            return false;
        }
    }

    public int nbreVehiculeInParking(){
        return this.listImmatricutationsPresentes.size();
    }

    public ArrayList<String> getListImmatricutationsPresentes() {
        return listImmatricutationsPresentes;
    }

    public ArrayList<String> getListImmatriculations() {
        return listImmatriculations;
    }

    public void displayImmatPresentes() {
        for (String immat : this.listImmatricutationsPresentes) {
            System.out.println(immat);
        }
    }

    public void displayImmatAuthoriezd() {
        for (String immat : this.listImmatriculations) {
            System.out.println(immat);
        }
    }

    public void remplissageRate() {
        double rate = (double)this.listImmatricutationsPresentes.size() / (double)this.capaciteMax * 100;
        displayRemplissageRate(rate);

    }

    public void displayRemplissageRate(double rate) {
        System.out.println("Le taux de remplissage est de " + rate + " %");
    }

}