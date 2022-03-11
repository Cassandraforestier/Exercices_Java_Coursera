import java.util.Scanner;

public class Rebonds1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double G = 9.81;
		final double EPS = 0.9;
		double h1=0;
		
		System.out.println("Entrez la hauteur initiale de la balle :");
		double h0 = sc.nextDouble();
		System.out.println("Entrez le nombre de rebonds : ");
		double nbr = sc.nextDouble();
		double v0 = 0;
		
		for(int i=0; i<nbr; ++i) {
			if(i==0) {
				v0 = Math.sqrt(2*h0*G);
			}
			else{
				v0 = Math.sqrt(2*h1*G);
			}
			double v1 = EPS*v0;
			h1 = (v1*v1)/(2*G);
		}
		
		System.out.println(h1);
	}

}
