package exerciceA;

import java.util.Scanner;

public class Fondue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Recette Vacherin fribourgeois");
		final int BASE = 4;
		System.out.println("Cette recette est prévu pour :" + BASE);
		
		double fromage = 800.0;
		double eau = 2.0;
		double ail = 2.0;
		double pain = 400.0;
		
		Scanner keyb = new Scanner(System.in);
		
		System.out.println("Indiquez le nombre de personnes conviées au repas : ");
		int nbConvives = keyb.nextInt();
		
		double nouvelleQuantiteFromage = (fromage * nbConvives) / BASE;
		double nouvelleQuantiteEau = ( eau * nbConvives ) / BASE;
		double nouvelleQuantiteAil= ( ail* nbConvives ) / BASE;
		double nouvelleQuantitePain= ( pain * nbConvives ) / BASE;
		
		System.out.println("les quantités sont : ");
		System.out.println(" - Eau : " + nouvelleQuantiteEau + " L");
		System.out.println(" - Ail : " + nouvelleQuantiteAil + " Gousses");
		System.out.println(" - Pain : " + nouvelleQuantitePain + " g");
		System.out.println(" - Fromage : " + nouvelleQuantiteFromage + " g");
		}

}
