import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testclone() {
		Immeuble im1 = new Immeuble(1,10,"blanc",23,5);
		Immeuble im2 =im1.clone();
		assertNotSame(im1,im2);
		assertEquals(im1,im2);
	}

}
