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
















}