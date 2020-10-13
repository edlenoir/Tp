import java.util.Arrays;

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
public boolean existeChemin(int x,int y) {
	if (labyrinthe[x][y] == 1) {
		return false;
	}
	if (labyrinthe[x][y] == 0) {
		existeChemin(x+1 ,y);
	}		
	return false;
	}
}