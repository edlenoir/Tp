import java.util.Arrays;
import java.util.HashMap;

public class Table {
	Convive [] table;
	HashMap<Convive,Integer> membre = new HashMap<Convive,Integer>();
	
	public int nbConvive() {
		int nbconv = 0;
		for (int i = 1 ;i< table.length;i++) {
			if(table[i] != null)
				nbconv ++;
		}
		return nbconv;
	}
	
	public void mettreATable(int place,Convive cov) {
		this.table[place - 1] = cov;
		this.membre.put(cov,place - 1);
	}


	
	
	
	
	
}
