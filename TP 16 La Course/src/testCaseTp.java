import static org.junit.Assert.*;

import org.junit.Test;

public class testCaseTp {

	@Test
    public void testCaseTp() {
        assertEquals(15,Plateau.calculDeplacement(5,6));
        assertEquals(3,Plateau.calculDeplacement(5,3));
        assertEquals(6,Plateau.calculDeplacement(16,4));
        assertEquals(5,Plateau.calculDeplacement(16,5));
        assertEquals(2,Plateau.calculDeplacement(36,2));
        assertEquals(-26,Plateau.calculDeplacement(36,1));
        assertEquals(1,Plateau.calculDeplacement(45,1));
        assertEquals(-45,Plateau.calculDeplacement(45,2));
        }
}
	