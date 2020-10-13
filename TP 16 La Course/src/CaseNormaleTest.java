import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CaseNormaleTest {

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

}