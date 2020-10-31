public class Vehicule {

 // Immatriculation du v�hicule
private String immatriculation;

 /**
7 * Instancie un v�hicule
8 * @param immat immatriculation du v�hicule
9 */
 	public Vehicule(String immat){
	this.immatriculation = immat;
 }
 /**
15 * Permet d'obtenir l'immatriculation du v�hicule
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