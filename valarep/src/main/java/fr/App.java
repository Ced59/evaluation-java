package fr;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Hotel h = tauxOccupation_40_sur_200();
        System.out.println(h.toString());

        boolean test = h.louerChbre("suite", "Caudron", 2);

        h.toString();

        System.out.println(test);

        h.getChambres().get(100).definirOccupant("Cedric", 2);

        System.out.println(h.getChambres().get(100).getNoChbre());
        System.out.println(h.getChambres().get(100).getNomOccupant());

        for (Chambre chambre : h.getChambres()){

            chambre.toString();

            if (chambre.getNomOccupant() != null){
                System.out.println("Occupant chambre n°" + chambre.getNoChbre() + " Type: " + chambre.getType() + " : " + chambre.getNomOccupant());
            }
            
            
        }
        

    }

    public static Hotel tauxOccupation_40_sur_200() {
        Hotel h = new Hotel("Novotel", 200, 4);

        for (int i = 0; i < 40; i++) {
            h.getChambres().get(i).definirOccupant("Toto", 15);
        }
        return h;
    }
}
