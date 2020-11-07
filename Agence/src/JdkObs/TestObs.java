package JdkObs;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestObs {
	private AgencePresse afp;
	private EmailSuscriber email;
    private SMSSuscriber tel;

    @Before
    public void setUp() throws Exception {
        this.afp  = new AgencePresse();
        this.email = new EmailSuscriber("nom_prénom@gmail.com");
        this.tel = new SMSSuscriber("+33 06 xx xx xx xx");
        this.afp.addObserver(this.email);
        this.afp.addObserver(this.tel);
    }



	
	@Test
	public void testlastnewsEmail() {
		afp.addObserver(this.email);
		afp.addNews("Test de SMS");
		assertEquals("Test de SMS",  this.email.getlastMsg());
	}
	
	@Test
	public void testlastnewsSMS() {
		afp.addObserver(this.tel);
		afp.addNews("Test de SMS");
		assertEquals("Test de SMS", this.tel.getlastMsg());
	}

}
