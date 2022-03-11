class Souris {

    public static final int ESPERANCE_VIE_DEFAUT = 36;

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie = ESPERANCE_VIE_DEFAUT;
    private boolean clonee;
    
    public Souris (int weight, String color, int a, int exp){
    	poids = weight;
    	couleur = color;
    	age = a;
    	esperanceVie = exp;
    	
    	System.out.println("Une nouvelle souris !");
    }
    public Souris(int poids, String couleur, int age) {
    	this.poids = poids;
    	this.couleur = couleur;
    	this.age = age;
    	
    	System.out.println("Une nouvelle souris !");
    }
    
    public Souris( int poids, String couleur) {
    	this.poids = poids;
    	this.couleur = couleur;
    	this.age = 0;
    	
    	System.out.println("Une nouvelle souris !");
    }

    public Souris(Souris uneSouris) {
    	this.poids = uneSouris.poids;
    	this.age = uneSouris.age;
    	this.couleur = uneSouris.couleur;
    	this.esperanceVie = (int) ((0.8)*uneSouris.esperanceVie); 
    	this.clonee = true;
    			
    	System.out.println("Clonage d'une souris  !");
    }
    
    public String toString() {
    	String isClone;
    	if(this.clonee == true) {
    		isClone = ", clonee,";
    	}
    	else {
    		isClone ="";
    	}
    	 return "Une souris " + this.couleur + isClone + " de " + this.age + " mois et pesant " + this.poids +"\n " + "grammes";
    }
    
    public void vieillir() {
    	this.age++;
    	if(this.clonee && this.age >= this.esperanceVie/2) {
    		this.couleur = "verte";
    	}
    }
    
    public void evolue() {
    	while( this.age < this.esperanceVie) {
    		 vieillir();
    	}
    }
    
    }

/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/

public class Labo {

    public static void main(String[] args) {
        Souris s1 = new Souris(50, "blanche", 2);
        Souris s2 = new Souris(45, "grise");
        Souris s3 = new Souris(s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1.evolue();
        s2.evolue();
        s3.evolue();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}