public class Plateau {
    
    public static final int NB_CASES = 49;
    private Case[] cases;
    
   

    public Plateau() {
		this.cases = new Case[NB_CASES];
		// cas nominal
		for (int i = 0; i < NB_CASES; i++)
		    this.cases[i] = new CaseNormale(i);
			// les cas particuliers
			//Case n°5 – si vous faites 6, allez sur la case n°20, sinon avancez de la valeur du dé
			this.cases[5] =new CaseTp(5,6,20);
			//Case n°16 – si vous faites 4, allez sur la case n°22, sinon avancez de la valeur du dé
			this.cases[16] =new CaseTp(16,4,22);
			//Case n°36 – si vous faites 1, reculez sur la case n°10, sinon avancez de la valeur du dé
			this.cases[36] =new CaseTp(36,1,10);
			//Case n°45 – si vous faites 2, revenez sur la case n°0, sinon avancez de la valeur du dé
			this.cases[45] =new CaseTp(45,2,0);
		
			//Case n°15 – avancez de la valeur du dé si elle est paire sinon reculez de la valeur du dé
			this.cases[15] =new CasePair(15);
			//Case n°20 - avancez de la valeur du dé si elle est paire sinon reculez de la valeur du dé
			this.cases[20] =new CasePair(20);
		
			// Case n°12 - ne repartez que si vous faites 2 en avançant de la valeur du dé 
			this.cases[12] = new CaseAttente(12,2);
			// Case n°18 - ne repartez que si vous faites 5 en avançant de la valeur du dé 
			this.cases[18] = new CaseAttente(18,5);
			// Case n°24 - ne repartez que si vous faites 2 en avançant de la valeur du dé 
			this.cases[24] = new CaseAttente(24,2);
			// Case n°27 - ne repartez que si vous faites 5 en avançant de la valeur du dé 
			this.cases[27] = new CaseAttente(27,5);
			// Case n°33 - ne repartez que si vous faites 4 en avançant de la valeur du dé
			this.cases[33] = new CaseAttente(33,4);
		
			}
    
    public int calculDeplacement(int position, int valeur) {
		System.out.println("lancer du de : " + valeur);
		System.out.println(this.cases[position].toString());
		if (position + valeur < NB_CASES-1) {
			return this.cases[position].calculDeplacement(valeur);
		} else {
			return ((2*((NB_CASES-1) - position)) - this.cases[position].calculDeplacement(valeur));
		}
	}

}