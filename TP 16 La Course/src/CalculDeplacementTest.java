import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculDeplacementTest {
	    
	    private static Plateau plateau;

	    @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
	        plateau = new Plateau();
	    }    

	    @AfterClass
	    public static void tearDownAfterClass() throws Exception {
	        plateau = null;
	    }

	    @Test
	    public void testCasesNormales() {
	        assertEquals(1,plateau.calculDeplacement(1,1));
	        assertEquals(2,plateau.calculDeplacement(2,2));
	        assertEquals(6,plateau.calculDeplacement(4,6));
	    }

	    @Test
	    public void testCasesEnAttente() {
	        assertEquals(2,plateau.calculDeplacement(12,2));
	        assertEquals(0,plateau.calculDeplacement(12,3));
	        assertEquals(5,plateau.calculDeplacement(18,5));
	        assertEquals(0,plateau.calculDeplacement(18,4));
	        assertEquals(2,plateau.calculDeplacement(24,2));
	        assertEquals(0,plateau.calculDeplacement(24,6));
	        assertEquals(5,plateau.calculDeplacement(27,5));
	        assertEquals(0,plateau.calculDeplacement(27,1));
	        assertEquals(4,plateau.calculDeplacement(33,4));
	        assertEquals(0,plateau.calculDeplacement(33,6));
	    }
	    

	    @Test
	    public void testCaseTp() {
	        assertEquals(15,plateau.calculDeplacement(5,6));
	        assertEquals(3,plateau.calculDeplacement(5,3));
	        assertEquals(6,plateau.calculDeplacement(16,4));
	        assertEquals(5,plateau.calculDeplacement(16,5));
	        assertEquals(2,plateau.calculDeplacement(36,2));
	        assertEquals(-26,plateau.calculDeplacement(36,1));
	        assertEquals(1,plateau.calculDeplacement(45,1));
	        assertEquals(-45,plateau.calculDeplacement(45,2));
	    }
	    
	    @Test
	    public void testCasePair() {
	        assertEquals(2,plateau.calculDeplacement(15,2));
	        assertEquals(-3,plateau.calculDeplacement(15,3));
	        assertEquals(-5,plateau.calculDeplacement(20,5));
	        assertEquals(2,plateau.calculDeplacement(20,2));
	        }
}

