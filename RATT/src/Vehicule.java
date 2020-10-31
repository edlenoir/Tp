public class Vehicule {

 // Immatriculation du véhicule
private String immatriculation;

 /**
7 * Instancie un véhicule
8 * @param immat immatriculation du véhicule
9 */
 	public Vehicule(String immat){
	this.immatriculation = immat;
 }
 /**
15 * Permet d'obtenir l'immatriculation du véhicule
16 * @return immatriculation
17 */
	public String getImmatriculation(){
 	return this.immatriculation;
 }


 /**
24 * @see java.lang.Object#toString()
25 */
 	@Override
 	public String toString(){
 	return this.immatriculation;
 	}
}