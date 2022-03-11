package exerciceA;

import java.util.Scanner;

public class RosesBlanches {

	public static void main(String[] args) {
		final int CAFE = 2;
		final int FLASH_INFORMATIQUE = 4;
		final int BILLET_METRO = 3;
		int argentFleurs = 0;
		
		System.out.println("Combien avez-vous reçu d'argent ? (Frs)");
		Scanner sc = new Scanner(System.in);
		int argentRecu = sc.nextInt();
			
		
		int livresEtFournitures = (argentRecu *3)/4;
		int argentRestant = argentRecu - livresEtFournitures;
		int autre = argentRestant /3;
		argentFleurs += argentRestant %3;
		
		int cafeDisponible = argentRestant / CAFE;
		argentFleurs += argentRestant % CAFE;
		int flashInformatiqueDisponible = argentRestant / FLASH_INFORMATIQUE;
		argentFleurs += argentRestant % FLASH_INFORMATIQUE;
		int billetMetroDisponible = argentRestant / BILLET_METRO;
		argentFleurs += argentRestant % BILLET_METRO;
		
		System.out.println("Livres et Fournitures : " + livresEtFournitures);
		System.out.println("Vous pouvez ensuite acheter :");
		System.out.println(cafeDisponible + " cafés");
		System.out.println(flashInformatiqueDisponible + " numéros de Flash Informatique");
		System.out.println(billetMetroDisponible + " billets de métro");
		System.out.println("et il vous restera " + argentFleurs + " Frs pour les roses blanches.");
		
		
		
		
		
		
		
		
	}

}
