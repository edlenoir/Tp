package JdkObs;


import java.util.LinkedHashSet;
import java.util.Set;

public class Publisher {
	
	private Set<Suscriber> observers;
	
	public Publisher(){
		this.observers = new LinkedHashSet<Suscriber>();
	}
	
	public void attach(Suscriber obs){
		this.observers.add(obs);
	}
	
	public void detach(Suscriber obs){
		this.observers.remove(obs);
	}
	
	public void notifyObservers(){
		for (Suscriber obs : this.observers){
			obs.update(this);
		}
	}
}
