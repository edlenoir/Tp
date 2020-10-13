import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPersonne {

	private Personne p1;
	
	private Personne p2;
	
	@Before
	public void setUp() {
		this.p1 = new Personne("Delatour");
		this.p2 = new Personne("Delatour");
	}
	
	@After
	public void tearDown() {
		this.p1 = null;
		this.p2 = null;
	}
	
	@Test
	public void testIndiceOccurrence() {
		List<Personne> personnes = new LinkedList<Personne>();
		personnes.add(this.p1);
		assertEquals(0, personnes.indexOf(this.p2));
	}
	
	@Test
	public void testCléValeur() {
		Map<Personne, Integer> personnes = new HashMap<Personne, Integer>();
		personnes.put(this.p1, 25);
		assertEquals((Integer) 25, personnes.get(this.p2));
	 }
	
	@Test
    public void testAppartientElément() {
        Set<Personne> personnes = new HashSet<Personne>();
        personnes.add(this.p1);
        assertTrue(personnes.contains(this.p2)); 
    }
	 
	 @Test
	 public void testDoublonDansEnsemble() {
		 Set<Personne> personnes = new HashSet<Personne>();
		 personnes.add(this.p1);
		 personnes.add(this.p2);			
		 assertEquals(1, personnes.size());
    }

}
