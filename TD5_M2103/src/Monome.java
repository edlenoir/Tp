public class Monome {
    private float coefficient;
    private int exposant;

    /**
     * construit un mon�me
     * 
     * @param coefficient
     *            coefficient du mon�me
     * @param exposant
     *            exposant du mon�me
     * @exception IllegalArgumentException
     *                si l'exposant est n�gatif
     */
    public Monome(float coefficient, int exposant)
            throws IllegalArgumentException {
            if (this.exposant<0){
                throw new IllegalArgumentException("Constructeur de monome");
            }
        this.coefficient = coefficient;
        this.exposant = exposant;
    }


    /**
     * retourne le coefficient d'un mon�me
     * 
     * @return coefficient
     */
    public float getCoefficient() {
        return this.coefficient;
    }

    /**
     * retourne l'exposant d'un mon�me
     * 
     * @return exposant
     */
    public int getExposant() {
        return this.exposant;
    }

    /**
     * calcule la somme de deux mon�mes
     * 
     * @param m
     *            deuxi�me op�rande de la somme
     * @return mon�me r�sultat
     * @exception ArithmeticException
     *                si les exposants des 2 mon�mes ne sont pas les m�mes
     */
    public Monome somme(Monome m) throws ArithmeticException {
        if (this.exposant==m.exposant){
            throw new ArithmeticException();
        }
        return new Monome(this.coefficient+m.coefficient,this.exposant);
    }

    /**
     * calcule le produit de deux mon�mes
     * 
     * @param m
     *            deuxi�me op�rande du produit
     * @return mon�me r�sultat
     */
    public Monome produit(Monome m) {
        return new Monome(this.coefficient*m.coefficient,this.exposant+m.exposant);
    }

    /**
     * calcule la d�riv�e d'un mon�me
     * 
     * @return mon�me r�sultat
     */
    public Monome derivee() {
        if (this.exposant==0){
            return new Monome(0,0);
        }
        else{
                return new Monome(this.coefficient*this.exposant,this.exposant-1);
            }
        }



    /**
     * produit une version unicode d'un mon�me
     * 
     * @return cha�ne r�sultat
     */
    @Override
    public String toString() {
        if (this.estNul()) {
            return "0";
        } else {
            if (this.exposant == 0) {
                return "" + this.getCoefficient();
            }
            return "" + this.getCoefficient() + "xe" + this.getExposant();
        }
    }

    /**
     * teste si un mon�me est nul
     * 
     * @return true si le mon�me est nul
     */
    public boolean estNul() {
        return (this.coefficient==0.0);
    }

}
