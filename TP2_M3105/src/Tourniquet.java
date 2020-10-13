public class Tourniquet extends ObjectGraphique {
    
    

    private String couleur;
    private int hauteur;
    private int largeur;
    
    public Tourniquet(double coordX, double coordY, String c, int hauteur, int largeur) {
        super(coordX, coordY);
        this.setCouleur(c);
        this.setHauteur(hauteur);
        this.setLargeur(largeur);
    }


    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }


    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }


    public String toString() {
        return "Tourniquet [couleur=" + couleur + ", hauteur=" + hauteur + ", largeur=" + largeur + "]";
    }
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (!(obj instanceof Tourniquet)) {
                return false;
            } else {
                Tourniquet b = (Tourniquet) obj;
                return this.couleur == this.couleur && this.largeur == b.largeur && this.hauteur== b.hauteur && super.equals(obj);
            }
        }
    }
    
    

}