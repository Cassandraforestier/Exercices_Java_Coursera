import java.util.Scanner;

public class MulMat {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisie de la première matrice : ");
		System.out.println("Nombre de lignes : ");
		int lignesMat1 = sc.nextInt();
		System.out.println("Nombre de colonnes : ");
		int colonnesMat1 = sc.nextInt();
		
		double mat1[][]= new double[lignesMat1][colonnesMat1];
		
		for(int i = 0 ; i < lignesMat1 ; ++i) {
			for(int j = 0 ; j < colonnesMat1 ; ++j) {
				System.out.println("M["+i+","+j+"] =");
				mat1[i][j]= sc.nextDouble();
			}
		}
		
		System.out.println("Saisie de la seconde matrice : ");
		System.out.println("Nombre de lignes : ");
		int lignesMat2 = sc.nextInt();
		System.out.println("Nombre de colonnes : ");
		int colonnesMat2 = sc.nextInt();
		
		double mat2[][]= new double[lignesMat2][colonnesMat2];
		
		for(int i = 0 ; i < lignesMat2 ; ++i) {
			for(int j = 0 ; j < colonnesMat2 ; ++j) {
				System.out.println("M["+i+","+j+"] =");
				mat2[i][j]= sc.nextDouble();
			}
		}
		double[][] prod = new double[mat1.length][mat2[0].length];
		if(lignesMat2 == colonnesMat1) {
			for (int lignes = 0; lignes < mat1.length; lignes++) {
				for (int colonnes = 0; colonnes < mat2[0].length; colonnes++) {
					prod[lignes][colonnes] = 0.0;
					for (int i = 0; i < mat2.length; i++) {
						prod[lignes][colonnes] += mat1[lignes][i] * mat2[i][colonnes];
					}
				}
			}
		}
		else {
			System.out.println("Multiplication de matrices impossible !");
		} 
		
		
		System.out.println("Résultat : ");
		
		for(int i = 0 ; i< prod.length ; ++i) {
			for( int j = 0; j< prod[i].length ; ++j) {
					System.out.print(prod[i][j]+ " ");
				}	
			System.out.println("");
		}
		
		
		
		
	}

}

