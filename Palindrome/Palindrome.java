import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez un mot/ensemble de mots pour vérifer qu'il s'agit d'un palindrome :");
		String ensembleDeMots = sc.nextLine();
		
		ArrayList<Character> tab = new ArrayList<Character>();
		ArrayList<Character> tab2 = new ArrayList<Character>();
		String ensembleDeMotsLower = ensembleDeMots.toLowerCase();
	
		
		String pattern = "[^a-zA-Z]";
		String motFinal = ensembleDeMotsLower.replaceAll(pattern, "" );
		System.out.println(motFinal);
		
		for(int i=0; i< motFinal.length(); i++) {
			tab.add(motFinal.charAt(i));
		}
		System.out.println(tab.toString());
		for(int i= tab.size()-1; i>=0; i--) {
			tab2.add(motFinal.charAt(i));
		}
		System.out.println(tab2.toString());
		
		if(tab.equals(tab2)) {
			System.out.println("il s'agit d'un palindrome !");
		}else {
			System.out.println("Ce n'est pas un palindrome.");
		}
	}
}
	


