

public class ExpressionMult extends ExpressionArithmetique {
		
		
		public ExpressionMult() {
			super();
		}
		
		public int evaluate() {
	        int res = 0;
	        for (Entier e: this.list)   {
	        	if (e == this.list.getFirst()) {
	        		res =e.evaluate();
	        	}	
	        	else
	        		res = res * e.evaluate();
	        }
	        return res;
	}


}
