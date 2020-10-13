import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBasket {
	private ScoreKeeper j;
	@Before
	public void setUp() throws Exception {
		this.j = new ScoreKeeper();
	}
	
	@After
	public void tearDown() throws Exception {
		this.j = null;
	}
	
	
	@Test
	public void testCasScore() {
		assertEquals("000:000",this.j.getScore());
	}
	
	@Test
	public void testCasA1() {
		this.j.scoreTeamA1();
		assertEquals("001:000",this.j.getScore());
	}
	
	public void testCasA2() {
		this.j.scoreTeamA2();
		assertEquals("002:000",this.j.getScore());
	}
	
	public void testCasA3() {
		this.j.scoreTeamA3();
		assertEquals("003:000",this.j.getScore());
	}
	
	@Test
	public void testCasB1() {
		this.j.scoreTeamB1();
		assertEquals("000:001",this.j.getScore());
	}
	
	public void testCasB2() {
		this.j.scoreTeamB2();
		assertEquals("000:002",this.j.getScore());
	}
	
	public void testCasB3() {
		this.j.scoreTeamB3();
		assertEquals("000:003",this.j.getScore());
	}
	
}
