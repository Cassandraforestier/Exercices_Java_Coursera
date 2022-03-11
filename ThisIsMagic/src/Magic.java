import java.util.Scanner;


public class Magic {

	public static void main(String[] args) {
		
		Spectateur S = new Spectateur();
		Magicien M = new Magicien();
		Assistant A = new Assistant();
		Papier paper = new Papier();
		
		S.giveData();
		M.thisIsMagic();
		S.ecrire(paper);
		A.lire(paper);
		int total = A.magicTrick();
		M.jeVousAiBerne(total);
		
	}
}
	
	class Magicien{
		
		public void thisIsMagic() {
			System.out.println("[Magicien] Un petit tour de magie...");
			
		}
		
		public void jeVousAiBerne(int total) {
			total += 115;
			String s = String.valueOf(total);
			
			System.out.println("[Magicien] - hum... je vois que vous êtes agé de " + s.substring(0, 2) 
					+ "et que vous avez " + s.substring(2, 4) + " francs suisses en poche !");
		}
	}
	
	class Assistant{
		private int age;
		private int argent;
	

		public void lire(Papier paper) {
			System.out.println("(Je lis le papier)");
			this.age= paper.lireAge();
			this.argent = paper.lireArgent();
		}
		
		public int magicTrick() {
			System.out.println("(Je calcule mentalement)");
			int annonce = (((this.age)*2 +5)*50 + this.argent) - 365 ;
			System.out.print("J'annonce : " + annonce);
			return annonce;
		}
		
	}
	
	class Papier{
	
		private int age;
		private int argent;
	

		public void ecrire(int age, int argent) {
			this.age = age;
			this.argent = argent;
		}
		
		public int lireAge() {
			return this.age;
		}
		public int lireArgent() {
			return this.argent;
		}
		
		
		
	}
	
	class Spectateur{
		private final Scanner clavier = new Scanner(System.in);
		private int age;
		private int argent;

		public void ecrire(Papier paper) {
			paper.ecrire(this.age, this.argent);
			System.out.println("(j'écris sur le papier)");
		}
	
		// methods
		public void giveData() {
			System.out.println("[Spectateur] (j'entre en scène)");
			System.out.print("Quel âge ai-je ? ");
			int a = clavier.nextInt();
			this.age = a;
			do {
				System.out.print("Combien d'argent ai-je en poche (<100) ? ");
				int argent = clavier.nextInt();
				if(argent > 0 && argent <= 99 ) 
				{
					this.argent = argent;
				}
			} while(this.argent <= 0 || this.argent > 99);
			System.out.println("[Spectateur] (J'ai un montant qui convient)");
			
			
		}
	}

