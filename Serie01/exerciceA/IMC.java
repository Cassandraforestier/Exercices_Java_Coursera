package exerciceA;

import java.util.Locale;
import java.util.Scanner;

public class IMC {
	public static void main (String[] args) {
		Scanner keyb = new Scanner(System.in);
		keyb.useLocale(Locale.US);
		System.out.println("Veuillez entrer votre poids : (en kg)");
		double poids = keyb.nextDouble();
		System.out.println("Veuillez entre votre taille : (en mètres)");
		double taille = keyb.nextDouble();
		
		double indiceMasseCorporelle = poids / (taille*taille);
		System.out.println("Votres IMC est de " + indiceMasseCorporelle);
		
		
	}
}
