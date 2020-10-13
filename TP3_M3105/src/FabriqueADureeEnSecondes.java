
public class FabriqueADureeEnSecondes implements FabriqueADuree {

	public Duree create(int heures, int minute, int seconde) {
		return new DureeEnSecondes(heures,minute,seconde);
	}

}
