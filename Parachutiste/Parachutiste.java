import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        final double g = 9.81;
        double v0 = 0; // v0 est la vitesse initiale de la chute
        double t0 = 0; // t0 est le temps initial de la chute
        double t = t0; // t est le temps en courant
        double hauteur = h0; 
        double vitesse = v0;
        double accel = g;
        double s0 = 2.0;
        boolean max = false; // vitesse max du parachutiste ( <0.5 m/s²)
        boolean depass = false; // dépassement de la vitesse du son ( 343m/s )
        boolean ouv = false; // ouverture du parachute
        double s = s0 / masse; // surface du parachutiste
        double q;
        
        while (hauteur > 0) {
        	q = Math.exp(-s * (t - t0));
            vitesse = (g / s) * (1 - q) + v0 * q;
            hauteur = h0 - (g / s) * (t - t0) - (v0 - (g / s)) / s * (1 - q);
            accel = g - s * vitesse;
            if (hauteur > 0) {
            	if ( vitesse > 343 && depass == false) {
            		System.out.println("## Felix depasse la vitesse du son");
                depass = true;
            	}
            	if (accel < 0.5 && max == false) {
            		System.out.println("## Felix a atteint sa vitesse maximale");
                    max = true;
            	}else
            if (hauteur < 2500 && ouv == false && t!=0) {
             	s0 = 25;
                 s = s0 / masse;
                 h0 = hauteur;
                 v0 = vitesse;
                 t0 = t;
                 System.out.println("## Felix ouvre son parachute");
                 ouv = true;
             }
        	
       	 System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
       	 t++;
            }
            
        }
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}