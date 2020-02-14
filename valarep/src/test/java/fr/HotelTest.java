package fr;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class HotelTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void tauxOccupation_40chambresOccupeesSur200_Retourne20Pourcent(){
        Hotel h = new Hotel("Novotel", 200, 4);

        for (int i = 0; i < 40; i++){
            h.getChambres().get(i).definirOccupant("Toto", 15);
        }

        assertEquals(20.0, h.tauxOccupation(), 1);
    }

    @Test
    public void tauxOccupation_200chambresOccupeesSur200_Retourne100Pourcent(){
        Hotel h = new Hotel("Novotel", 200, 4);

        for (int i = 0; i < 200; i++){
            h.getChambres().get(i).definirOccupant("Toto", 15);
        }

        assertEquals(100.0, h.tauxOccupation(), 1);
    }

    @Test
    public void nbreChambresOccupees_200_retourne200(){
        Hotel h = new Hotel("Novotel", 200, 4);

        assertEquals(200, h.getNbreChbres());
    }

}
