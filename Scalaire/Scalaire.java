import java.util.Scanner;

public class Scalaire {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	final int nMax = 10;
	int taille;
	int scalaire = 0;
		
		do {
			System.out.println("Entrez la taille des 2 vecteurs :");
			taille = sc.nextInt();
		}while(taille <1 || taille > nMax);
		int v2[] = new int[taille];
		int v1[] = new int[taille];

		for(int i=0; i<taille; ++i) {
			System.out.println("Entrez la valeur v" + i + " du vecteur 1");
			v1[i] = sc.nextInt();
			
		}
		for(int j=0; j<taille; ++j) {
			System.out.println("Entrez la valeur v" + j + " du vecteur 2");
			v2[j] = sc.nextInt();
			
		}
		for(int i=0; i<taille; ++i) {
				scalaire = scalaire + (v1[i]*v2[i]);
		}
		
		System.out.println("Le produit scalaire de v1 et v2 est : " + scalaire);
	}
}
