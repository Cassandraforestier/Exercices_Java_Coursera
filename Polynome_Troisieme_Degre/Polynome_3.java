import java.util.Scanner;

public class Polynome_3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Entrez vos 3 nombres pour le polynome du 3ème degré :");
			
			System.out.println("a0 : ");
			double a0 = sc.nextDouble();
			System.out.println("a1 : ");
			double a1 = sc.nextDouble();
			System.out.println("a2 : ");
			double a2 = sc.nextDouble();
			
			System.out.println("Votre polynome ressemble à z^3 + " + a2 + "z^2 + " + a1 + "z + " + a0);
			
			double q = ((3 * a1) - (a2 * a2))/9;
			double r = ((9 * a2 * a1) - (27 * a0) - (2* a2 * a2 * a2))/54;
			double d = (q * q * q) + (r * r);
			
			System.out.println(q);
			System.out.println(r);
			System.out.println(d);
			
			if ( d < 0 ) {
				System.out.println("notre valeur D est inférieur à zéro, on a donc trois solutions réélles : ");
				double teta = Math.acos(r/(Math.sqrt((-q) * (-q) * (-q) )));
				
				double z1 = (2 * Math.sqrt(-q)) * (Math.acos(teta/3) - (a2 / 3));
				double z2 = (2 * Math.sqrt(-q)) * (Math.acos((teta + (2 * Math.PI))/3) - (a2 / 3));
				double z3 = (2 * Math.sqrt(-q)) * (Math.acos((teta + (4 * Math.PI))/3) - (a2 / 3));
				System.out.println(z1 + " , " + z2 + " , " + z3);
			}
			else {
				double t = 0 ;
				double s = Math.pow((r + Math.sqrt(d)), (1.0/3.0) );
				
				if(r - Math.sqrt(d) < 0) {
					double tTemp = Math.pow(-1 *(r - Math.sqrt(d)), (1.0/3.0) );
					t = - tTemp;
				}
				else {
					t = Math.pow((r - Math.sqrt(d)), (1.0/3.0) );
				}
				
				System.out.println(s + " , " + t);
				
				if(d==0 && (s+t !=0)) {
					
					double z1 = s + t - (a2/3);
					double z2 = (-(s + t)/2) - (a2/3);
					System.out.println(z1 + " , " + z2);
					
				}
				else {
					double z1 = s + t - (a2/3);
					
					System.out.println(z1);
				}
			}
			

	}

}
