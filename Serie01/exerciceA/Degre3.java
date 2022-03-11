package exerciceA;

import java.util.Scanner;
import java.util.Locale;

public class Degre3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Entrez les valeurs pour calculer votre polynome de 3ème degré :");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double x = sc.nextDouble();
		
		double resultat = ((a+b)/2)*x*x*x + (a+b)*(a+b)*x*x + a + b + c;
		System.out.println("La valeur du polynome est : " + resultat);
		
	}

}
