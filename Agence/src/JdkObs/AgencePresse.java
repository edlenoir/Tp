package JdkObs;


import java.util.Deque;
import java.util.Observer;
import java.util.LinkedList;
import java.util.Observable;

public class AgencePresse extends Observable {
	private Deque<String> nouvelles;
	
	public Deque<String> getNouvelles() {
		return nouvelles;
	}

	public AgencePresse() {
		super();
		this.nouvelles = new LinkedList<String>();
	}
	
	public String getLatestNews(){
		return this.nouvelles.getLast();
	}
	
	public void addNews(String news){
		if (this.nouvelles.size() == 100)
			this.nouvelles.removeFirst();
		this.nouvelles.addLast(news);
		this.setChanged();
		this.notifyObservers();
	}


}
