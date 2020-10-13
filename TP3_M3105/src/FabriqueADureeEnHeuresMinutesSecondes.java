
public class FabriqueADureeEnHeuresMinutesSecondes implements FabriqueADuree{

	public Duree create(int heures, int minute, int seconde) {
		return new DureeEnHeuresMinutesSecondes(heures,minute,seconde);
	}

}
