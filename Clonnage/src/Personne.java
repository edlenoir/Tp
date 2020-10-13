
public class Personne implements Cloneable{
	
	private Patronyme patronyme;
	private int age;
	
	public Personne(Patronyme patronyme, int age) {
		this.patronyme = patronyme;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Personne [patronyme=" + patronyme + ", age=" + age + "]";
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Patronyme getPatronyme() {
		return patronyme;
	}
	
	public Personne clone()  {
		Personne clone= null;
		
		try {
			clone = (Personne) super.clone();
			clone.patronyme = this.patronyme.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
		
		
	}

}
