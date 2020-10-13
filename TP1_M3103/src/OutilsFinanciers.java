
public class OutilsFinanciers {
	
	public static double tauxDeChange(Devise d1,Devise d2) {
		switch (d1) {
		  case EUR:
		    switch(d2) {
		    case EUR:
		    	return 1;
		    case USD:
		    	return 1.31486;
		    }
		  case USD:
			  switch(d2) {
			  case EUR:
				  return 0.760541;
		  	  case USD:
		  		  return 1; 		 
			  }
	}
		return 0;
	}
	
	public static Couple convertir(Couple<Devise,Double> couple,Devise d) {
		Couple<Devise,Double> c = new Couple<>(d,couple.getV2()*tauxDeChange(couple.getV1(),d));
		return c;
	}
}
