package atm;

import java.util.List;

public class TestDistributeur {

	public static void main(String[] args) {
		Distributeur d = new Distributeur(10, 10, 10);
		List<Couple> proposition = d.donnerBillets(10);
		System.out.println(d.toStringProposition(proposition, 10));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(20);
		System.out.println(d.toStringProposition(proposition, 20));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(30);
		System.out.println(d.toStringProposition(proposition, 30));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(40);
		System.out.println(d.toStringProposition(proposition, 40));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(50);
		System.out.println(d.toStringProposition(proposition, 50));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(60);
		System.out.println(d.toStringProposition(proposition, 60));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(70);
		System.out.println(d.toStringProposition(proposition, 70));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(100);
		System.out.println(d.toStringProposition(proposition, 100));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(110);
		System.out.println(d.toStringProposition(proposition, 110));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(210);
		System.out.println(d.toStringProposition(proposition, 210));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(310);
		System.out.println(d.toStringProposition(proposition, 310));
		
		d.recharger(10, 10, 10);
		proposition = d.donnerBillets(3000);
		System.out.println(d.toStringProposition(proposition, 3000));
	}

}
