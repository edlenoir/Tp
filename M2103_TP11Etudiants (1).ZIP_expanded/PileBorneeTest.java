import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PileBorneeTest {
	private PileBornee p;
	private PileBornee b;

	@Before
	public void setUp() throws Exception {
		this.p = new PileBornee(2);
	}

	@After
	public void tearDown() throws Exception {
		this.p = null;
	}

	@Test
	public void TestpileVide() {
		assertTrue(p.isEmpty());
	}
	
	@Test
	public void TestpilenonVide()throws EmptyStackException,FullStackException {
		p.push(4);
		assertFalse(p.isEmpty());
	}
	
	@Test
	public void TestpiletailleMax() {
		assertEquals(2,p.getMaxSize());
	}
	
	@Test
	public void TestpiletailleMaxEnpiler()throws EmptyStackException,FullStackException {
		p.push(2);
		assertEquals(2,p.getMaxSize());
	}
	
	@Test
	public void TestpileElem0() {
		assertEquals(0,p.getSize());
	}
	
	@Test
	public void TestpileEnpilde3Elem()throws EmptyStackException,FullStackException {
		p.push(2);
		assertEquals(1,p.getSize());
		p.push(5);
		assertEquals(2,p.getSize());
		p.push(6);
		assertEquals(2,p.getSize());
	}
	
	@Test
	public void TestpilenonPlein() {
		assertFalse(p.isFull());
	}
	
	@Test
	public void TestpilePleine2Elem()throws EmptyStackException,FullStackException {
		p.push(2);
		assertFalse(p.isFull());
		p.push(4);
		assertTrue(p.isFull());
	}
	
	@Test
	public void TestpileTop3Elem() throws EmptyStackException,FullStackException  {
		p.push(2);
		assertEquals(2,p.top());
		p.push(4);
		assertEquals(4,p.top());
		p.push(6);
		assertEquals(4,p.top());
	}
	
	@Test
	public void TestpilePop()throws EmptyStackException,FullStackException {
		p.push(2);
		p.pop();
		assertFalse(p.isFull());
		assertEquals(2,p.getMaxSize());
	}
	
	@Test
	public void TestpilePop2Elem()throws EmptyStackException,FullStackException {
		p.push(2);
		p.pop();
		assertTrue(p.isEmpty());
		p.push(3);
		p.push(8);
		p.pop();
		try {
			assertEquals(3,p.top());
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void TestExceptCosntructeur() {
			this.b= new PileBornee(-4);
	}
	
	@Test(expected = EmptyStackException.class)
	public void TestExceptTop() throws EmptyStackException {
			p.top();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

