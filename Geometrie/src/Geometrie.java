import java.util.Scanner;

public class Geometrie {

	public static void main(String[] args) {
		
		Point p = new Point();
		Triangle t = new Triangle();
		
		p.createPoint();
		
		double distanceP1_P2 = t.distanceEntre2Points(p.point1(), p.point2());
		double distanceP2_P3 = t.distanceEntre2Points(p.point2(), p.point3());
		double distanceP3_P1 = t.distanceEntre2Points(p.point3(), p.point1());
		
		t.perimetre(distanceP1_P2, distanceP2_P3, distanceP3_P1);
		t.estIsocele(distanceP1_P2, distanceP2_P3, distanceP3_P1);
	}
	
}

	class Triangle {
		
		public double distanceEntre2Points(double[] tab1, double[] tab2) {
			double distance = Math.sqrt( ((tab1[0]-tab2[0]) * (tab1[0]-tab2[0])) + ((tab1[1]-tab2[1]) * (tab1[1]-tab2[1])) );
			
			return distance ;
		}
		public double perimetre(double segment1, double segment2, double segment3) {
			
			double perimetre = segment1 + segment2 + segment3;
			System.out.println("Perimetre : " + perimetre);
			return perimetre;
		}
		
		public void estIsocele (double segment1, double segment2, double segment3) {
			if(segment1 == segment2) {
				System.out.println("Le triangle est isocèle");
			}
			else if(segment2 == segment3) {
				System.out.println("Le triangle est isocèle");
			}
			else if(segment3 == segment1) {
				System.out.println("Le triangle est isocèle");
			}
			else {
				System.out.println("Le triangle n'est pas isocèle");
			}
		}
	}

		
	
	class Point {
		
		private double[] tabPoint1= new double[2];
		private double[] tabPoint2= new double[2];
		private double[] tabPoint3= new double[2];
		
		public void createPoint() {
			
			final Scanner clavier = new Scanner(System.in);
			
			System.out.println("Construction d'un nouveau point ");
			for(int i =0 ; i<2 ; i++) {
				
				
				if(i==0) {
					System.out.print("Veuillez entrer x : ");
					this.tabPoint1[i] = clavier.nextDouble();
				}else {
					System.out.print("Veuillez entrer y : ");
					this.tabPoint1[i] = clavier.nextDouble();	
				}
				
						
			}
			System.out.println("Construction d'un nouveau point ");
			for(int j =0 ; j<2 ; j++) {
				
				if(j==0) {
					System.out.print("Veuillez entrer x : ");
					this.tabPoint2[j] = clavier.nextDouble();
				}else {
					System.out.print("Veuillez entrer y : ");
					this.tabPoint2[j] = clavier.nextDouble();	
				}
			}
			System.out.println("Construction d'un nouveau point ");
			for(int k =0 ; k<2 ; k++) {
				
				if(k==0) {
					System.out.print("Veuillez entrer x : ");
					this.tabPoint3[k] = clavier.nextDouble();
				}else {
					System.out.print("Veuillez entrer y : ");
					this.tabPoint3[k] = clavier.nextDouble();	
				}
			}
			
		
		
		}
		
		public double[] point1 () {
			return this.tabPoint1;
		}
		public double[] point2 () {
			return this.tabPoint2;
		}
		public double[] point3 () {
			return this.tabPoint3;
		}
	}

	
	