import java.util.Date;

public class Horaire {
// Date d'entree du vehicule
	private long dateEntree;

 // Date de sortie du vehicule
	private long dateSortie;

/**
9 * Instancie un horaire. Les dates d'entr�e et de sortie sont fix�es � -1
10 (non renseign�es)
11 */
 public Horaire(){
 this.dateEntree = -1;
 this.dateSortie = -1;
 }

 /**
18 * Permet d'obtenir la date d'entr�e du v�hicule
19 * @return date d'entr�e
20 */
 public long getDateEntree(){
 return this.dateEntree;
 }

 /**
26 * Permet d'obtenir la date de sortie du v�hicule
27 * @return date de sortie
28 */
 public long getDateSortie(){
 return this.dateSortie;
 }

 /**
34 * Fixe la date d'entr�e
35 * @param dateEntree date d'entr�e
36 * @throws Exception "Date d'entr�e invalide" si la date d'entr�e
37 inf�rieure ou �gale � 0
38 */
 public void setDateEntree(long dateEntree) throws Exception {
if (dateEntree <= 0)
 {
 throw new Exception("Date d'entr�e invalide (<=0)");
 }
 this.dateEntree = dateEntree;
this.dateSortie = -1;
 }



 /**
56 * Fixe la date de sortie
57 * @param dateSortie date de sortie
58 * @throws Exception "Date d'entr�e non fix�e" si la date d'entr�e n'est
59 pas initialis�e
60 * @throws Exception "Date de sortie invalide" si la date de sortie est
61 inf�rieure ou �gale � 0
62 * @throws Exception "La date d'entr�e doit �tre inf�rieure � la date de
63 sortie" si la date d'entr�e est sup�rieure ou �gale � la date de sortie
64 */
 public void setDateSortie(long dateSortie) throws Exception , DejaInitialise{
 if (this.dateEntree == -1){
 throw new Exception ("Date d'entr�e non fix�e");
 }
 if(this.dateEntree != -1) {
	 throw new DejaInitialise("Date deja rentrer");
 }
 if (dateSortie <= 0)
 {
 throw new Exception("Date de sortie invalide (<=0)");
 }
 if (this.dateEntree >= dateSortie){
 throw new Exception ("La date d'entr�e doit �tre inf�rieure � la date de sortie");
 }
 this.dateSortie = dateSortie;
 }

 /**
81 * Retourne le temps pass� entre la date d'entr�e et la date de sortie si
82 elle est sp�cifi�e (heure courante sinon).
83 * @return temps pass�
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