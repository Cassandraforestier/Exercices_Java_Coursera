import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();
        
        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        boolean isStartRange1FMatin = (debut > 0 && debut < 7 ); 
        boolean isEndRange1FMatin = (fin > 0 && fin < 7);
        
        boolean isStartRange1FSoir = (debut > 17 && debut < 24 );
        boolean isEndRange1FSoir = (fin > 17 && fin < 24);
        
        boolean isStartRange2F = (debut >= 7 && debut <= 17 );
        boolean isEndRange2F = (fin >= 7 && fin <= 17);
        
        int dureeLocation = fin - debut;
        int dureeMatin = 0;
        int dureeSoir = 0;
        int dureeApresMidi = 0;
        float cout =0;
        
        if(debut < 0 || fin > 24) {
        	System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }
        else if( debut == fin) {
        	System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        }
        else if( debut > fin) {
        	System.out.println("Bizarre, le début de la location est après la fin ...");
        }
        else if(isStartRange1FMatin && isEndRange1FMatin )
        {
        	cout = dureeLocation * 1;
        	System.out.println("Vous avez loué votre vélo pendant");
        	System.out.print( dureeLocation + " heure(s) au tarif horaire de 1.0 franc(s)\n");
        }
        else if(isStartRange1FSoir && isEndRange1FSoir) {
        	cout = dureeLocation * 1;
        	System.out.println("Vous avez loué votre vélo pendant");
        	System.out.print( dureeLocation + " heure(s) au tarif horaire de 1.0 franc(s)\n");
        }
        else if(isStartRange2F && isEndRange2F) {
        	cout = dureeLocation * 2;
        	System.out.println("Vous avez loué votre vélo pendant");
        	System.out.print( dureeLocation + " heure(s) au tarif horaire de 2.0 franc(s)\n");
        }
        else {
        	if(isStartRange1FMatin) {
        	dureeMatin = 7 - debut;
        	
        	}
        	if(isEndRange1FSoir) {
        	dureeSoir = fin -17;
        	}
        	dureeApresMidi = dureeLocation - dureeSoir - dureeMatin;
        	cout = (dureeMatin * 1) + (dureeSoir *1) + (dureeApresMidi *2);
        	System.out.println("Vous avez loué votre vélo pendant");
        	System.out.print((dureeMatin + dureeSoir)+ " heure(s) au tarif horaire de 1.0 franc(s)\n");
        	System.out.print(dureeApresMidi+ " heure(s) au tarif horaire de 2.0 franc(s)\n");
        }
       
        if(cout > 0) {
        System.out.print("Le montant total à  payer est de " + cout);
        System.out.println(" franc(s).");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}