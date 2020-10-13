import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileBorneeTest {
	private FileBornee f;
	private FileBornee t;

	@Before
	public void setUp() throws Exception {
		this.f = new FileBornee(5);
		
	}

	@After
	public void tearDown() throws Exception {
		this.f = null;
		
	}

	@Test
	public void FileBorneeVide() {
		assertTrue(f.isEmpty());
	}
	
	@Test
	public void FileBorneeNonVide()throws EmptyQueueException {
		f.enqueue(1);
		assertFalse(f.isEmpty());
	}
	
	@Test
	public void FileBorneeMaxsize() {
		assertEquals(5,f.maxSize);
	}
	
	@Test
	public void FileBorneeMaxsize2()throws EmptyQueueException {
		f.enqueue(1);
		assertEquals(5,f.maxSize);
	}
	
	@Test
	public void FileBorneeNb0() {
		assertEquals(0,f.getSize());
	}
	
	@Test
	public void FileBorneeEnfilerIncr()throws EmptyQueueException {
		assertEquals(0,f.getSize());
		f.enqueue(1);
		assertEquals(1,f.getSize());
		f.enqueue(5);
		assertEquals(2,f.getSize());
		f.enqueue(6);
		assertEquals(3,f.getSize());
		f.enqueue(32);
		assertEquals(4,f.getSize());
		f.enqueue(4);
		assertEquals(5,f.getSize());
	}
	
	@Test
	public void FileBorneeEnfilerPleine()throws EmptyQueueException {
		assertEquals(0,f.getSize());
		f.enqueue(1);
		assertEquals(1,f.getSize());
		f.enqueue(5);
		assertEquals(2,f.getSize());
		f.enqueue(6);
		assertEquals(3,f.getSize());
		f.enqueue(32);
		assertEquals(4,f.getSize());
		f.enqueue(4);
		assertEquals(5,f.getSize());
		f.enqueue(7);
		assertEquals(5,f.getSize());
	}
	
	@Test
	public void FileBorneeNonPlein() {
		assertFalse(f.isFull());
	
	}
	
	@Test
	public void FileBorneePleine()throws EmptyQueueException {
		f.enqueue(1);
		f.enqueue(5);
		f.enqueue(6);
		f.enqueue(32);
		assertFalse(f.isFull());
		f.enqueue(32);
		assertTrue(f.isFull());
	}
	
	
	@Test
	public void FileBorneeFront() throws EmptyQueueException {
		f.enqueue(1);
		f.enqueue(3);
		f.enqueue(5);
		assertEquals(1,f.front());
	}
	
	@Test
	public void FileBorneeDefilement() throws EmptyQueueException {
		f.enqueue(1);
		f.dequeue();
		assertTrue(f.isEmpty());
	}
	
	
	@Test
	public void FileBorneeDefilement1erElemNonVide() throws EmptyQueueException {
		f.enqueue(1);
		f.enqueue(5);
		f.dequeue();
		assertFalse(f.isEmpty());
	}
	
	@Test
	public void FileBorneeDefilement1erElem() throws EmptyQueueException {
		f.enqueue(1);
		f.enqueue(5);
		f.dequeue();
		f.dequeue();
		f.enqueue(7);
		assertEquals(7,f.front());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void TestIllegalArgumentException() throws IllegalArgumentException {
		this.t = new FileBornee(-3);
	}
	
	@Test (expected = EmptyQueueException.class)
	public void TestEmptyQueueExceptionFront() throws EmptyQueueException {
		f.front();
	}
	
	@Test (expected = EmptyQueueException.class)
	public void TestEmptyQueueExceptionDequeue() throws EmptyQueueException {
		f.dequeue();
	}
	
	
	/*
	Reponse a la question 2
	Le Code de la classe FileBornée est simple  algorithmiquement car il n'y a pas beaucoup de ligne et en plus il y a tres peut de boucle et il y a peut de fonctiont .Donc se qui en fait un classe tres simple. 
	*/
	
	
	
	
	
	
	
	
	

}
