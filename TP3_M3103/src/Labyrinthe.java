import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Labyrinthe {
  
  private int [][] labyrinthe = {
    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
    { 1, 1, 0, 0, 0, 0, 1, 1, 0, 1 },
    { 1, 1, 0, 1, 0, 1, 1, 0, 0, 1 },
    { 1, 0, 0, 1, 0, 0, 1, 0, 1, 1 },
    { 1, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
    { 1, 0, 1, 1, 0, 1, 1, 1, 0, 1 },
    { 1, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
    { 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 },
    { 1, 0, 1, 1, 0, 0, 0, 0, 0, 1 },
    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
  };
  
  private ArrayList<String> direction = new ArrayList <String>();

public void afficherlab() {
	for(int x = 0;x<labyrinthe.length;x++) {
		for(int y = 0;y<labyrinthe[x].length;y++) {
			if (labyrinthe[x][y] == 1) {
				System.out.print("*");
			}
			if (labyrinthe[x][y] == 2) {
				System.out.print(".");
			}
			if(labyrinthe[x][y] == 0)
				System.out.print(" ");
		}	
		System.out.println("");
}
}
public Labyrinthe() {
	this.labyrinthe = labyrinthe;
	this.direction = direction;
}


public boolean existeChemin(int x,int y) {
	 if (this.labyrinthe[x][y] != 0) {
         return false;
     }
     this.labyrinthe[x][y] = 2;
     if (x == 0 || y == 0 || x == this.labyrinthe.length-1 || y == this.labyrinthe.length-1){
         return true;
     }
     if(this.existeChemin(x-1, y)) {
    	 direction.add("Haut");
         return true;
     }
     if(this.existeChemin(x, y+1)) {
    	 direction.add("Droite");
         return true;
     }
     if(this.existeChemin(x+1, y)) {
    	 direction.add("Bas");
         return true;
     }
     if(this.existeChemin(x, y-1)) {
    	 direction.add("Gauche");
         return true;
     }
     return false;
	}


public ArrayList<String> getDirection() {
	return direction;
	}
public void setDirection(ArrayList<String> direction) {
	this.direction = direction;
	}
}