import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        String tableauAlphabet[] = new String[ALPHABET.length()];
        String tableauDecale[] = new String[ALPHABET.length()];
        for(int i = 0; i< ALPHABET.length() ; i++) {
        	tableauAlphabet[i] = ALPHABET.substring(i, i+1); 
        }
        for(int j=0; j< tableauAlphabet.length ; j++) {
        		tableauDecale[j]= tableauAlphabet[(j+4) % ALPHABET.length()];
        	}
        aCoder = s.replaceAll("[^a-z ]", "");
        
        for(int k =0 ; k< aCoder.length() ; k++) {
        	String caract = aCoder.substring(k,k+1);
        	if(caract.isBlank()) {
        		chaineCodee += caract;
        	}else {
        	for(int i = 0; i< tableauAlphabet.length ; i++) {
        		if(caract.equals(tableauAlphabet[i])) {
        			
        			chaineCodee += tableauDecale[i];        		}
        	}
        	}
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}