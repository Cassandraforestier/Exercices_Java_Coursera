import java.util.Scanner;

public class Paques {
	private final static Scanner CLAVIER = new Scanner(System.in);

	public static int demandeAnnee() {
		int yearEaster=0;
		do {
		System.out.println("Entrez une annee (1583-4000) : ");
		 yearEaster = CLAVIER.nextInt();
		}while(yearEaster < 1583 || yearEaster > 4000);
		return yearEaster;
	}
	
	public static void afficheDate( int annee, int easterDay1) {
		if(easterDay1 >= 22 && easterDay1 <= 56) {
		if(easterDay1 <= 31) {
			System.out.print("Date de Paques en " + annee + " : " + datePaques(annee) + " mars");
		}
		else if(easterDay1 >= 32) {
			easterDay1 -= 31;
			System.out.print("Date de Paques en " + annee + " : " + datePaques(annee) + " avril");
		}
		}
	}
	
	public static int datePaques(int annee) {
		int day = 0;
		int siecle = annee / 100;
		int p = (13 + ( 8 * siecle)) / 25;
		int q = siecle / 4;
		int m = ( 15 - p + siecle -q ) % 30;
		int n = ( 4 + siecle - q) % 7;
		int d = (m + (19  * (annee % 19))) % 30;
		int e = (2 * (annee % 4) + 4 * (annee % 7) + 6 * d + n) % 7;
		
			if(e == 6 && ((d == 29 || (d == 28 && ((11*(m+1)%30) < 19))))){
				day = (e + d + 22 ) - 7;
			}
			else {
				day = (e + d + 22 );
			}
		return day;
	}

	public static void main(String[] args) {
		
		int annee = demandeAnnee();
		int easterDay= datePaques(annee);
		afficheDate(annee, easterDay);
		
	}
}
