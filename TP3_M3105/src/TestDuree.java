import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public abstract class TestDuree {
	
	protected FabriqueADuree fabrique ;
	
	

	@Test
	public void testGetters() {
		Duree d = new DureeEnHeuresMinutesSecondes(1, 2, 3);
		assertEquals(1,d.getHeures());
		assertEquals(2,d.getMinutes());
		assertEquals(3,d.getSecondes());
	}

	@Test (expected=IllegalArgumentException.class)
	public void testHeuresNegative() {
		fabrique.create(-1, 2, 3);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testMinutesNegative() {
		fabrique.create(1, -2, 3);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testMinutesSuperieur59() {
		fabrique.create(1, 60, 3);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testSecondesNegative() {
		fabrique.create(1, 2, -3);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testSecondesSuperieur59() {
		fabrique.create(1, 2, 60);
	}
	
	@Test
	public void testEqualsValeursEgales() {
		assertEquals(fabrique.create(1,2,3),fabrique.create(1,2,3));
	}
	
	@Test
	public void testEqualsValeursNonEgales() {
		assertNotEquals(fabrique.create(1,2,3),fabrique.create(2,2,3));
		assertNotEquals(fabrique.create(1,2,3),fabrique.create(1,1,3));
		assertNotEquals(fabrique.create(1,2,3),fabrique.create(1,2,2));
	}
	
	@Test
	public void testAjouterUneSeconde() {
		Duree d123 = fabrique.create(1,2,3);
		d123.ajouterUneSeconde();
		assertEquals(fabrique.create(1,2,4),d123);
		
		Duree d1259 = fabrique.create(1,2,59);
		d1259.ajouterUneSeconde();
		assertEquals(fabrique.create(1,3,0),d1259);
		
		Duree d5959 = fabrique.create(1,59,59);
		d5959.ajouterUneSeconde();
		assertEquals(fabrique.create(2,0,0),d5959);
	}
	@Test
	public void testplusUneMinute() {
		Duree d123 = fabrique.create(1, 2, 3);
		d123.plusUneMinute();
		assertEquals(fabrique.create(1,3,3),d123);
		
		Duree d1593 = fabrique.create(1, 59, 3);
		d1593.plusUneMinute();
		assertEquals(fabrique.create(2,0,3),d1593);
		
	}
	@Test
	public void testplusUneHeure() {
		Duree d123 = fabrique.create(1, 2, 3);
		d123.plusUneHeure();
		assertEquals(fabrique.create(2,2,3),d123);
	}
	
	@Test 
	public void testToString() {
		assertEquals("1:2:3", fabrique.create(1,2,3).toString());
	}
}



