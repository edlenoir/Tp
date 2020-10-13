import static org.junit.Assert.*;

import org.junit.Test;

public class PileBorneeTest {

	@Test
	public void testPileBorneeVide() {
		PileBornee p = new PileBornee(3);
		 assertEquals(p.isEmpty(), true);
	}
	
	@Test
	public void testPileBornee1elem() {
		PileBornee p = new PileBornee(3);
		p.push(2);
		assertEquals(p.isEmpty(), false);
	}
	
	@Test
	public void testPileBorneeTailleMax() {
		PileBornee p = new PileBornee(5);
		assertEquals(5, p.getMaxSize());
	}
	
	@Test
	public void testPileBorneeTailleMaxBougePas() {
		PileBornee p = new PileBornee(5);
		p.push(2);
		assertEquals(5, p.getMaxSize());
	}
	@Test
	public void testPileBornee0elem() {
		PileBornee p = new PileBornee(5);
		assertEquals(0, p.getSize());
	}
	@Test
	public void testPileBorneeNonPleine() {
		PileBornee p = new PileBornee(5);
		assertEquals(p.isFull(), false);
	}
	
	//public void testPileBornee2ElemPlein6() {
		//PileBornee p = new PileBornee(2);
		//p.push(2);
		//assertEquals(1, p.getSize());
		//p.push(4);
		//assertEquals(2, p.getSize());
		
	@Test
	public void testPileBornee2ElemPlein8() {
		PileBornee p = new PileBornee(2);
		p.push(2);
		assertEquals(1, p.getSize());
		p.push(4);
		assertEquals(2, p.getSize());
		
	}
	
	@Test
	public void testPileBornee2ElemPlein9() {
		PileBornee p = new PileBornee(2);
		p.push(2);
		try {
			assertEquals(2, p.top());
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		p.push(4);
		try {
			assertEquals(4, p.top());
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
		p.push(6);
		try {
		assertEquals(4, p.top());
		}
		catch (EmptyStackException e) {
			e.printStackTrace();
		}

	}
	@Test
	public void testPileBorneePop() {
		PileBornee p = new PileBornee(2);
		p.push(2);
		p.pop();
		assertEquals(0, p.getSize());
		assertEquals(2, p.getMaxSize());
	}
	
	@Test
	public void testPileBorneePop11() {
		PileBornee p = new PileBornee(2);
		p.push(2);
		p.pop();
		assertEquals(p.isEmpty(), true);
		p.push(2);
		p.push(5);
		p.pop();
		try {
			assertEquals(2, p.top());
			}
			catch (EmptyStackException e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void testEmptyStackException() {
		PileBornee p = new PileBornee(2);
		try {
			p.top();
			}
			catch (EmptyStackException e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void testIllegalArgumentException() {
		try {
			PileBornee p = new PileBornee(-1);
			try {
				p.top();
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
			}
			catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
	}
	
	@Test(expected = FullStackException.class)
	public void testFullStackException() throws FullStackException {
		PileBornee p1 = new PileBornee(2);
		p1.push(1);
		p1.push(1);
		p1.push(1);
	}


	

	
	
	


	
	

}
