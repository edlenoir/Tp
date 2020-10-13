import java.util.LinkedList;

public class Cite implements Cloneable {
	public Cite(LinkedList<ObjectGraphique> list, String str) {
		super();
		this.list = list;
		this.str = str;
	}

	private LinkedList <ObjectGraphique> list;
	private String str;
	
	public Cite(String str) {
		this.list = new LinkedList();
		this.str = str;
	}

	  @Override
	    protected Cite clone() throws CloneNotSupportedException {
	        return (Cite) super.clone();
	    }

	public LinkedList<ObjectGraphique> getList() {
		return list;
	}

	@Override
	public String toString() {
		return "Cite [list=" + list + ", str=" + str + "]";
	}
	
	
	
	
}
