import java.util.LinkedList;

public abstract class ExpressionArithmetique {

	
	protected LinkedList<Entier> list;
	protected LinkedList<ExpressionArithmetique> listexp;



	public ExpressionArithmetique() {
		this.list = new LinkedList<Entier>();
		this.listexp = new LinkedList<ExpressionArithmetique>();
	}
	


	public void add(Entier e) {
		this.list.add(e);
	}
	
	public void add(ExpressionPlus ep) {
		this.listexp.add(ep);
	}
	
	public void add(ExpressionMoins em) {
		this.listexp.add(em);
	}
	
	public void add(ExpressionDiv ed) {
		this.listexp.add(ed);
	}
	
	public void add(ExpressionMult emult) {
		this.listexp.add(emult);
	}
	

	public int evaluate() {
		int res = 0;
		for(Entier e: this.list) {
			res +=e.evaluate();
		}
		return res;
	}
}
