

public class ExpressionDiv extends ExpressionArithmetique {
	

	
	public ExpressionDiv() {
		super();
	}
	
	public int evaluate()throws ArithmeticException {
        int res = 0;
        for (Entier e : this.list)   {
            if (e == this.list.getFirst()) {
                res += e.evaluate();
            } 
            else if(e.evaluate() == 0){
            	throw new ArithmeticException("On peut pas diviser par 0");
            }
            else {
                res = res / e.evaluate(); 
            }
        }
        return res;
    }
	


}
