package TrianglePascal;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle_Pascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez rentrer la taille du triangle de Pascal voulu : ");
		int taille= sc.nextInt();
		
		int tableau[][] = new int[taille][];
		
		for (int j=0 ; j < taille ; j++) {
			tableau[j] = new int[j+1];
		}
		
		for(int i =0 ; i < taille; i++) {
			tableau[i][i] = 1;
			tableau[i][0] = 1 ;
			
			for(int k = 1 ; k < i ; k++) {
				tableau[k][i-1] = tableau[k-1][i-1] + tableau[k-1][i] ;
			}
		}
		
		

		
	System.out.println(Arrays.deepToString(tableau));
	}

}
