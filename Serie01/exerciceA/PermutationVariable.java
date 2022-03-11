package exerciceA;

import java.util.Scanner;

public class PermutationVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez entrer la valeur de x :");
		int x = sc.nextInt();
		System.out.println("veuillez entrer la valeur de y :");
		int y = sc.nextInt();
		
		System.out.println("Les valeurs avant permutation sont: x = " + x + " et y = " + y);
		
		int tmp;
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("Les valeurs après permutation sont: x = " + x + " et y = " + y);
	}

}
