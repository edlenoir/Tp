import java.nio.charset.Charset;

public class Touche {
    
    private ListeCirculaire<Character> l;
    
    public Touche(String s) {
        this.l = new ListeCirculaire<Character>();
        for(char i : s.toCharArray()) {
            this.l.ajouter(i);
        }
    }
    
    public Character getCaractere(int nbAppui) {
        if (nbAppui == 0%4) {
            return this.l.getListeCirculaire().get(0);
        }
        if (nbAppui == 1%4) {
            return this.l.getListeCirculaire().get(1);
        }
        if (nbAppui == 2%4) {
            return this.l.getListeCirculaire().get(2);
        }
        if (nbAppui == 3%4) {
            return this.l.getListeCirculaire().get(3);
        }
        return null;
    }
 }