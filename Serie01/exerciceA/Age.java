package exerciceA;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quel est votre âge ?");
		Scanner keyb = new Scanner (System.in);
		int age = keyb.nextInt();
		System.out.println("Votre âge est : " + age);
		Calendar calendrier = Calendar.getInstance();
		int annee = calendrier.get(Calendar.YEAR);
		System.out.println("l'année en cours est :" + annee);
		
		int anneeNaissance = annee - age;
		System.out.println("votre année de naissance est " + anneeNaissance);
		
		
		
		
	}

}
