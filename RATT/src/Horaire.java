import java.util.Date;

public class Horaire {
// Date d'entree du vehicule
	private long dateEntree;

 // Date de sortie du vehicule
	private long dateSortie;

/**
9 * Instancie un horaire. Les dates d'entrée et de sortie sont fixées à -1
10 (non renseignées)
11 */
 public Horaire(){
 this.dateEntree = -1;
 this.dateSortie = -1;
 }

 /**
18 * Permet d'obtenir la date d'entrée du véhicule
19 * @return date d'entrée
20 */
 public long getDateEntree(){
 return this.dateEntree;
 }

 /**
26 * Permet d'obtenir la date de sortie du véhicule
27 * @return date de sortie
28 */
 public long getDateSortie(){
 return this.dateSortie;
 }

 /**
34 * Fixe la date d'entrée
35 * @param dateEntree date d'entrée
36 * @throws Exception "Date d'entrée invalide" si la date d'entrée
37 inférieure ou égale à 0
38 */
 public void setDateEntree(long dateEntree) throws Exception {
if (dateEntree <= 0)
 {
 throw new Exception("Date d'entrée invalide (<=0)");
 }
 this.dateEntree = dateEntree;
this.dateSortie = -1;
 }



 /**
56 * Fixe la date de sortie
57 * @param dateSortie date de sortie
58 * @throws Exception "Date d'entrée non fixée" si la date d'entrée n'est
59 pas initialisée
60 * @throws Exception "Date de sortie invalide" si la date de sortie est
61 inférieure ou égale à 0
62 * @throws Exception "La date d'entrée doit être inférieure à la date de
63 sortie" si la date d'entrée est supérieure ou égale à la date de sortie
64 */
 public void setDateSortie(long dateSortie) throws Exception , DejaInitialise{
 if (this.dateEntree == -1){
 throw new Exception ("Date d'entrée non fixée");
 }
 if(this.dateEntree != -1) {
	 throw new DejaInitialise("Date deja rentrer");
 }
 if (dateSortie <= 0)
 {
 throw new Exception("Date de sortie invalide (<=0)");
 }
 if (this.dateEntree >= dateSortie){
 throw new Exception ("La date d'entrée doit être inférieure à la date de sortie");
 }
 this.dateSortie = dateSortie;
 }

 /**
81 * Retourne le temps passé entre la date d'entrée et la date de sortie si
82 elle est spécifiée (heure courante sinon).
83 * @return temps passé
84 */
 public long tempsPasse(){
long min = this.dateEntree;

 long max = this.dateSortie;
 if (max == -1){
 max = new Date().getTime();
 }
 return max-min;
 }
}