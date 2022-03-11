
public class Tables {

	public static void main(String[] args) {
		
		for(int i=2; i<=10 ; i++) {
			System.out.println("Table de " + i + " :");
			for(int j=1; j<11 ; j++) {
				System.out.println(j + " * " + i + " = " + (i*j));
			}
		}
		
	}

}
