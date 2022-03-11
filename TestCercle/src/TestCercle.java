import java.util.Scanner;

public class TestCercle {

	public static void main(String[] args) {
		
		//instanciation of cercles
		Cercle c1 = new Cercle();
		Cercle c2 = new Cercle();
		Cercle c3 = new Cercle();
		
		//radius affectation
		c1.setRadius(3.0);
		c2.setRadius(1.5);
		c3.setRadius(17.0);
	
		//center's cercle affectation
		c1.setCenter(3, 6);
		c2.setCenter(-1, 2);
		c3.setCenter(6, 15);
		
		System.out.println("c1 = " + c1.surface());
		System.out.println("c2 = " + c2.surface());
		System.out.println("c3 = " + c3.surface());
		
		double pointX= 0;
		double pointY= 2;
		
		System.out.println("c1 = " + c1.isIntern(pointX, pointY));
		System.out.println("c2 = " + c2.isIntern(pointX, pointY));
		System.out.println("c3 = " + c3.isIntern(pointX, pointY));
		
	}
	
	public static class Cercle {
		// Attributes from the class
		private double radius;
		private double x ; 
		private double y ;
		
		// part of methods for this class
		// setters
		public void setCenter ( double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public void setRadius(double r) {
			this.radius = r;
		}
		
		// methods 
		public double surface () {
			double surface = Math.PI*((radius*radius));
			
			return surface;
		}
		
		public boolean isIntern ( double x , double y) {
			if( (radius*radius) >= (x - this.x)*(x - this.x) + (y - this.y)*(y - this.y)){
				return true;
			}
			else {
				return false;
			}
		}
	}

}
