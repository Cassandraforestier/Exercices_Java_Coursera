import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        for(int i=debut; i<=fin;++i) {
        	
        	int nbr1 = i;
        	int incrementation=0;
        	
        	while(nbr1 != 0) {
           		if(nbr1%3==0) {
        			nbr1 = nbr1 + 4;
        		}else if(nbr1%4==0) {
        			nbr1 = nbr1 / 2;
        		}else {
        			nbr1 = nbr1 -1;
        		}
				incrementation++;
        	}
        	System.out.println(i + " -> " + incrementation);
        }
 
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}