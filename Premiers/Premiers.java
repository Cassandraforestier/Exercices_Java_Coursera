import java.util.ArrayList;

public class Premiers {

	public static void main(String[] args) {
		ArrayList<Integer> tableauNbPremiers = new ArrayList<Integer>();
		
		System.out.println("Les nombres premiers compris entre 2 et 100 sont les suivants :");
		
		for(int i=2; i< 100; ++i) {
			if(i == 2) {
				tableauNbPremiers.add(i);
			}
			if(i % 2 == 0) {
						
			}else {
				boolean isFirst = (i % (tableauNbPremiers.get(tableauNbPremiers.size()-1)) != 0);
				if(i <= Math.sqrt(i) && isFirst) {
					tableauNbPremiers.add(i);
					System.out.println(tableauNbPremiers.toString());
				}
				
			}
		}
	}

}
