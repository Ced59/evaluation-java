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

        boolean test = h.louerChbre("suite", "Caudron", 2);

        h.toString();

        System.out.println(test);

        h.getChambres().get(100).definirOccupant("Cedric", 2);

        

        for (Chambre chambre : h.getChambres()){

            chambre.toString();

            if (chambre.getNomOccupant() != null){
                System.out.println("Occupant chambre n°" + chambre.getNoChbre() + " Type: " + chambre.getType() + " : " + chambre.getNomOccupant());
            }
            
        }

       
        
        int nbreJours = 0;
        passeJoursEtAfficheEtatHotel(h, nbreJours);

        nbreJours = 3;
        passeJoursEtAfficheEtatHotel(h, nbreJours);

        nbreJours = 15;
        passeJoursEtAfficheEtatHotel(h, nbreJours);
        
    }


    private static void passeJoursEtAfficheEtatHotel(Hotel h, int nbreJours) {
        for (int i = 1; i < nbreJours; i++){
            h.jourSuivant();
        }

        System.out.println("");
        System.out.println(nbreJours + " jours plus tard");
        System.out.println("Nombre de chambres de l'hotel: " + h.getNbreChbres());
        System.out.println("Nombre de chambres occupées de l'hotel: " + h.nbreChambresOccupees());
        System.out.println(h.tauxOccupation() + " % d'occupation de l'hotel.");
    }

    public static Hotel tauxOccupation_40_sur_200() {
        Hotel h = new Hotel("Novotel", 200, 3);

        for (int i = 0; i < 40; i++) {
            h.getChambres().get(i).definirOccupant("Toto", 15);
        }
        return h;
    }
}
