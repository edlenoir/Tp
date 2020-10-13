
public class Interpreteur {
	private int h;
	private int m;
	private int s;	
	private String nom;
	
	public Interpreteur () {
		this.nom = "";
        this.h = 0;
        this.m = 0;
        this.s = 0;
	}

	
	public String promptQuestion() {
		return ("$ ");
	}
	
	public boolean isOff() {
		if (this.h == 0 &&this.m == 0 &&this.s == 0 &&this.nom == "")
			return true;
		return false;
	}
	
	
	public boolean isIn() {
		if (this.h == 0 &&this.m == 0 &&this.s == 0 &&this.nom == "")
			return false;
		return true;
	}
	
	public void setTime(int h , int m , int s ) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public void sendCommand(String s) {
		int i = 0;
		if (s.length() >= 4 ) {
			i++;
			}
		
		if (s.length() == 4 ){
		}
		
	   if(s=="Stop!"  && isOff() ) {   
	   }
		
	}
	
	public String  getResponse() {
		
		if (this.h <6 && this.h>=20) {
			return ("|Buenos tardes Pedro!");
		}
		if(this.h <12 && this.h >=6) {
			return ("|Buenos tardes Pedro!");
		}
		if(this.h < 10 && this.h >=20) {
			return ("|Buenos tardes Pedro!");
		}
		if(this.h == 20 && this.m == 5&& this.s == 1)
			return ("> |Buenos dias Pedro!\n");
		
		return "> Adios Brian\n";
		
	}
}
