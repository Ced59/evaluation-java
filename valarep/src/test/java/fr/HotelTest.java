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

        assertEquals(20, h.tauxOccupation());
    }
}
