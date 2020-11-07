
public class ExpressionPlus extends ExpressionArithmetique{
	

	
	public ExpressionPlus() {
		super();
	}

	public int evaluate() {
		int res = 0;
		for(Entier e: this.list) {
			res +=e.evaluate();
		}
		return res;
	}
}
