public class Banque {

    public void virer(CompteBancaire c1, CompteBancaire c2, Double montant) throws ParametreInvalide {
        if (montant <= 0) 
            throw new ParametreInvalide("montant<=0", "Erreur, le montant est inférieur ou égal à 0");
        if (c1.getSolde() < montant) 
            throw new ParametreInvalide("Solde < montant", "Erreur, le solde est inférieur au montant du virement");
        
        c1.setSolde(c1.getSolde()-montant);
        Couple<Devise,Double> c = OutilsFinanciers.convertir(new Couple<>(c1.getDevise(),montant), c2.getDevise());
        c2.setSolde(c2.getSolde()+c.getV2());
    }
}