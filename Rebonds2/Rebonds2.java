import java.util.Scanner;

public class Rebonds2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double G = 9.81;
		double EPS = 0;
		double h1=0;
		double h0=0;
		double h_fin =0;
		
		do {
			System.out.println("Entrez la hauteur initiale de la balle :");
			h0 = sc.nextDouble();
		}while(h0<0);
		
		do {
			System.out.println("Entrez la valeur du coefficient de rebonds :");
			EPS  = sc.nextDouble();
		}while((EPS>=0.0) && (EPS<1.0));
		
		do {
			System.out.println("Entrez la hauteur finale désirée :");
			h_fin = sc.nextDouble();
		}while((h_fin>0)&&(h_fin<h0));
		
		
		double nbr = 0;
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
