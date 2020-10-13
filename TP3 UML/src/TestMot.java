import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.junit.Test;

import chaviro.ModeleMots;

public class TestMot {

	@Test
	public void testHashCodeTenta() {
		assertEquals(0, TableMots.hashCode(new String("tenta")));
	}
	
	@Test
	public void testHashCodePatte() {
		assertEquals(2, TableMots.hashCode(new String("patte")));
	}
	
	@Test
	public void testHashCodeVit() {
		assertEquals(3, TableMots.hashCode(new String("vit")));
	}
	
	@Test
	public void testEqualsTentaTenta() {
		assertTrue(TableMots.equals(new String("tenta"), new String("tenta")));
	}
	
	@Test
	public void testNotEqualsTentaPatte() {
		assertFalse(TableMots.equals(new String("tenta"), new String("patte")));
	}
	
	@Test
    public void testApplication() throws FileNotFoundException, TableMotsPleine {
        TableMots tabMots = new TableMots();
        chaviro.ModeleMots modeleMots = new ModeleMots();
        Scanner sc = new Scanner(new FileReader("./src/chaviro.txt"));
        while (sc.hasNext()) { 
            String mot = sc.next();
            tabMots.enregistrerMot(mot);
            modeleMots.enregistrerMot(mot);
        }
        sc.close();
        System.out.println(tabMots);
        assertEquals(modeleMots.toString(),tabMots.toString());
    }
}
