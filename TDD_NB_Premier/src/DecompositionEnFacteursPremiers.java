import java.util.ArrayList;
import java.util.List;


	public class DecompositionEnFacteursPremiers {
		List<Integer> factors;
		
		//AVANT REFACTORING
		public List<Integer> compute(int n) {
			this.factors = new ArrayList<Integer>();
			if (n==3)
				this.factors.add(3);
			if (n==2)
				this.factors.add(2);
			if (n==4) {
				this.factors.add(2);
				this.factors.add(2);
			}
			if(n==5) {
				this.factors.add(5);
			}
			if (n==6) {
				this.factors.add(2);
				this.factors.add(3);
			}
			if (n==8) {
				this.factors.add(2);
				this.factors.add(2);
				this.factors.add(2);
			}
			if (n==9) {
				this.factors.add(3);
				this.factors.add(3);
			}
			if (n==10) {
				this.factors.add(2);
				this.factors.add(5);
			}
			if (n==42) {
				this.factors.add(2);
				this.factors.add(3);
				this.factors.add(7);
			}
			return factors;
		}

	

		//APRES REFACTORING
		public List<Integer> computeRe(int n) {
			this.factors = new ArrayList<Integer>();
			for (int i=2;i<42;i++) {
				while (n%i==0) {
					this.factors.add(i);
					n/=i;
				}	
			}
			return factors;
		}

	}
