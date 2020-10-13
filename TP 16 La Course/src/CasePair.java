public class CasePair extends Case {
    
	
	
    public CasePair(int numero) {
        super(numero);
    }
    
    public int calculDeplacement(int val) {
        if (val%2 == 0)
            return val;
        else
            return  (-val);
    }

	@Override
	public String toString() {
		return "CasePair [OUI]";
	}

}