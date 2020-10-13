import java.util.Arrays;

public class Telephone {

    private String[] caracteres = { "0 ", "1", "2abc", "3def", "4ghi", "5jkl", "6mno", "7pqrs", "8tuv", "9wxyz" };

    private Touche[] touches;
    
    @Override
    public String toString() {
        return "Téléphone [touches=" + Arrays.toString(touches) + "]";
    }

    public Telephone() {
        this.touches = new Touche[10];
        for (int i = 0 ; i < caracteres.length ; i ++) {
            this.touches[i] = new Touche(caracteres[i]);
        }
    } 
        
        public String decode(String msg) throws ListeVide {
        	        int i = 0;
        	        int j = 0;
        	        String temp = "";
        	        while (i < msg.length()) {    
        	            while (j < msg.length() && msg.charAt(i) == msg.charAt(j)) {
        	                    j++;
        	            }
        	            if (msg.charAt(i) != '.')
        	            	System.out.println(this.touches[Character.getNumericValue(msg.charAt(i))].getCaractere(j-i));
        	            	temp += this.touches[Character.getNumericValue(msg.charAt(i))].getCaractere(j-i);
        	            i = j;
        	        }
        	        return temp;
        	    }   
}