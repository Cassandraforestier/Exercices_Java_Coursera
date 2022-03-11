import java.util.Scanner;

public class Moyenne {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
			// Demande le nombre d'étudiants à l'utilisateur
		int nombreEtudiants;
		System.out.print("Donnez le nombre d'etudiants : ");
		nombreEtudiants = scanner.nextInt();
			// Initialise un tableau pouvant contenir autant
			// de notes que d'étudiants
		double [] notes = new double[nombreEtudiants];
		double somme = 0;
		double moyenne = 0;
		for(int i=0; i<nombreEtudiants; ++i) {
			System.out.println("Entrez les notes de l'étudiant " + i +" :");
			notes[i] = scanner.nextInt();
			somme = somme + notes[i];
		}
		moyenne = somme / nombreEtudiants;
		System.out.println("Moyenne de classe : " + moyenne);
		System.out.println(" Etudiant : note (ecart a la moyenne)");
		for (int i = 0; i < nombreEtudiants; i++) {
		System.out.println( " " + i + " : " + notes[i] + " ("
		+ (notes[i] - moyenne) + ")");
		}
	}
}
