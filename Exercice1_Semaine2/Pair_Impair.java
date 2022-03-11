import java.util.Scanner;

public class Pair_Impair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un nombre : ");
		double nb = sc.nextDouble();
		boolean isEven = (nb % 2 ==0);
		boolean equalZero = (nb==0);
		boolean isNegative = (nb<0);
		
		if(equalZero) {
			System.out.println("Le nombre est zéro et donc pair.");
		}
		else if(isNegative) {
			if(isEven) {
				System.out.println("Le nombre "+ nb + " est négatif et pair.");
			}
			else {
				System.out.println("Le nombre " + nb + " est négatif et impair.");
			}
		}
		else {
			if(isEven) {
				System.out.println("Le nombre "+ nb + " est positif et pair.");
			}
			else {
				System.out.println("Le nombre " + nb + " est positif et impair.");
			}
		}
	}

}
