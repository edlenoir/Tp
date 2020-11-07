

public class ExpressionMoins extends ExpressionArithmetique {
		
	
	public ExpressionMoins() {
		super();
	}
	
	public int evaluate() {
        int res = 0;
        for (Entier e : this.list)   {
            if (e == this.list.getFirst()) {
                res += e.evaluate();
            } else if (e.evaluate() > 0) {
                res -= e.evaluate();
            } else {
                res += Math.abs(e.evaluate());
            }
        }
        return res;
    }
	

	

}
