
public class FileBornee {

	public final int maxSize;
	private int size;
	private Cellule front; 
	private Cellule back;
	
	private class Cellule {
		public int valeur;
		public Cellule suivant;
		public Cellule(int valeur, Cellule suivant) {
			this.valeur = valeur;
			this.suivant = suivant;
		}
	}
	
	public FileBornee(int maxSize) {
		if (maxSize <= 0)
			throw new IllegalArgumentException("le nombre maximum d'éléments doit être supérieur à zéro" + maxSize);
		this.maxSize = maxSize;
		this.size = 0;
		this.front = null;
		this.back = null;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public boolean isFull() {
		return this.size == this.maxSize;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int front() throws EmptyQueueException {
		if (this.isEmpty())
			throw new EmptyQueueException();
		return this.front.valeur;
	}
	
	public void enqueue(int element) {
		if (this.size < this.maxSize) {
			this.size += 1;
			Cellule toEnqueue = new Cellule(element, null);
			if (this.front == null) {
				this.back = toEnqueue;
				this.front = toEnqueue;
			}
			else {
				this.back.suivant = toEnqueue;
				this.back = toEnqueue;
			}
		}
	}
	
	public void dequeue() throws EmptyQueueException {
		if (this.isEmpty())
			throw new EmptyQueueException();
		this.size-=1;
		this.front = this.front.suivant;
	}
	
	
}