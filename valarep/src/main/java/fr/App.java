package fr;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Hotel h = tauxOccupation_40_sur_200();
        System.out.println(h.toString());

        h.louerChbre("suite", "Caudron", 2);

        System.out.println(h.toString());

        

        h.getChambres().get(100).definirOccupant("Cedric", 2);

        

        displayDetailsChbresOccupes(h);

       
        
        int nbreJours = 0;
        passeJoursEtAfficheEtatHotel(h, nbreJours);

        nbreJours = 1;
        passeJoursEtAfficheEtatHotel(h, nbreJours);
        displayDetailsChbresOccupes(h);

        nbreJours = 2;
        passeJoursEtAfficheEtatHotel(h, nbreJours);
        displayDetailsChbresOccupes(h);

        nbreJours = 15;
        passeJoursEtAfficheEtatHotel(h, nbreJours);
        displayDetailsChbresOccupes(h);
        
    }

    private static void displayDetailsChbresOccupes(Hotel h) {
        for (Chambre chambre : h.getChambres()){

            chambre.toString();

            if (chambre.getNomOccupant() != null){
                System.out.println("Occupant chambre n°" + chambre.getNoChbre() + " Type: " + chambre.getType() + " : "
                 + chambre.getNomOccupant() + " pour " + chambre.getJoursRestants() + " jours encore.");
            }
            
        }
    }


    private static void passeJoursEtAfficheEtatHotel(Hotel h, int nbreJours) {
        for (int i = 0; i < nbreJours; i++){
            h.jourSuivant();
        }

        System.out.println("");
        System.out.println(nbreJours + " jours plus tard");
        System.out.println("Nombre de chambres de l'hotel: " + h.getNbreChbres());
        System.out.println("Nombre de chambres occupées de l'hotel: " + h.nbreChambresOccupees());
        System.out.println("Nombre de chambres libres de l'hotel: " + h.nbreChambresLibres());
        System.out.println(h.tauxOccupation() + " % d'occupation de l'hotel.");
    }

    public static Hotel tauxOccupation_40_sur_200() {
        Hotel h = new Hotel("Novotel", 200, 4);

        for (int i = 0; i < 40; i++) {
            h.getChambres().get(i).definirOccupant("Toto", 15);
        }
        return h;
    }
}
