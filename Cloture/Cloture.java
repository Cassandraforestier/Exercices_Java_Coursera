import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
       int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme Ã  partir d'ici.
         *******************************************/
 //   	int[][] carte = {
//    			{0, 0, 0, 0, 1, 1, 1, 0}, 
//    			{0, 0, 0, 0, 1, 0, 0, 0}, 
//    			{0, 0, 0, 1, 1, 1, 1, 0}, 
//    			{0, 0, 0, 0, 0, 1, 0, 0}, 
//    			{0, 0, 0, 1, 1, 1, 1, 1}}; 
//    	{1, 1, 1}, 
//    	{0, 0, 1}, 
//    	{1, 1, 1}}; 
//		{0, 0, 0, 1, 1, 1, 0, 0 },
//		{0, 0, 0, 0, 0, 1, 0, 0}, 
//		{0, 0, 0, 0, 1, 1, 0, 0}, 
//		{0, 0, 1, 1, 1, 1, 0, 0 },
//		{1, 1, 1, 1, 1, 1, 1, 1 },
//		{0, 1, 1, 1, 1, 1, 1, 0 },
//		{0, 1, 1, 1, 1, 1, 1, 1}, 
//		{0 ,0, 1, 1, 1, 1 ,1, 1 }
//		};
        for (int i=0; i<carte.length; i++) {
        	for ( int j=0; j<carte[i].length; j++) {
        		if(carte[i][j] != 0 && carte[i][j] != 1) {
        			System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
        			System.out.print(carte[i][j] +"' trouvée en position [" + i );
        			System.out.print("][" + j);
        			System.out.println("]");
        			return;
        		}
        	}
        }
        int nombreDeCloture = 0;
        if(carte.length == 1 && carte[0][0] == 1) {
        	nombreDeCloture = 4;
        }
        for(int k=0; k<carte.length; k++) {
        	int previousValue = -1;
        	int startLeft = 0 ;
        	int endRight = 0 ;
        	// recherche du début et fin de lac
        	for(int l=0 ; l<carte[k].length; l++) {
        		if(previousValue == 1 && carte[k][l] == 0) {
        			startLeft = l;
        		}
        		if(previousValue == 0 && carte[k][l] == 1 && startLeft != 0) {
        			endRight = l;
        		}
        		previousValue = carte[k][l];
        		// couvrir les lacs par des 1
        		if(endRight>startLeft) {
        			for(int cpt=startLeft ; cpt<=endRight; cpt++) {
            		carte[k][cpt] = 1;
        			}
        		}
        	}
        	
        }
        //affichage carte
//        for(int i=0; i<carte.length; i++) {
//        	for(int j=0; j<carte[i].length; j++) {
//        		System.out.print(carte[i][j]);
//        	}
//        	System.out.println("");
//        }
               
        
     
     
        for(int i=0; i<carte.length; i++) {
        
        	for(int j=0; j<carte[i].length; j++) {
        		boolean isBorder = false;
        		// chercher les bordures du terrain
        		if(i == 0 || j ==0) {
        			isBorder = true;
        		}
        		if(i == carte.length-1 || j == carte[i].length-1) {
        			isBorder = true;
        		}
        		if(isBorder == true && carte[i][j] == 1) {
        			nombreDeCloture += 1;
        			if((j ==0 && i ==0) || (i == 0 && j == carte[i].length-1) || (j==0 && i == carte.length-1) || (i == carte.length-1 && j == carte[i].length-1)) {
        				nombreDeCloture +=1;
        			}
        			
        			if(j==0 && i==0) {
        				if(carte[i+1][j] == 0) {
       					nombreDeCloture +=1;
        				}
        				if(carte[i][j+1] == 0) {
        					nombreDeCloture +=1;
        				}
        			}
        			else if(j == carte[i].length-1 && i == carte.length-1) {
        				if(carte[i-1][j] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(carte[i][j-1] == 0) {
            					nombreDeCloture +=1;
           				}
        			}
        			else if(j ==0 && i == carte.length-1) {
        				if(carte[i-1][j] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(carte[i][j+1] == 0) {
            				nombreDeCloture +=1;
            			}
        			}
        			else if(i ==0 && j == carte[i].length-1) {
        				if(carte[i+1][j] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(carte[i][j-1] == 0) {
        					nombreDeCloture +=1;
        				}
        			}
        			else if(carte[i][j]==1 && isBorder == true ) {
//        				nombreDeCloture += 1;
        				if(i>0 && carte[i-1][j] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(i<carte.length-1 && carte[i+1][j] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(j>0 && carte[i][j-1] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(j< carte[i].length-1 && carte[i][j+1] == 0) {
        					nombreDeCloture +=1;
        				}
        			}
//        			else if(j ==0 || j == carte[i].length-1) {
//        				if(carte[i-1][j] == 0) {
//        					nombreDeCloture +=1;
//        				}
//        				if(carte[i+1][j] == 0) {
//        					nombreDeCloture +=1;
//        				}
//        			}
//        			else if(i ==0 || i == carte.length-1) {
//        				if(carte[i][j-1] == 0) {
//        					nombreDeCloture +=1;
//        				}
//        				if(carte[i][j+1] == 0) {
//        					nombreDeCloture +=1;
//        				}
//        			}
        		}
        		
        		
        		// etablir le metrage de cloture necessaire
        		if(carte[i][j] == 1) {
        			if(isBorder == false) {
//        				if(carte[i][j-1] == 0 && carte[i][j+1] == 0 ) {
//        					nombreDeCloture +=2;
//        				}
        				if(carte[i-1][j] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(carte[i+1][j] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(carte[i][j-1] == 0) {
        					nombreDeCloture +=1;
        				}
        				if(carte[i][j+1] == 0) {
        					nombreDeCloture +=1;
        				}
        			}
        		}
        		//System.out.println("position [" + i +" ; " + j + "] --> " + "valeur : " + carte[i][j] +" ; " + nombreDeCloture + " ( " + isBorder + " )");
        	}
        }
        float resultat = (float) (nombreDeCloture * 2.50);
        
     
        
       
        

        //System.out.println("Votre carte du terrain n'a pas le bon format :");
        //System.out.print("bord extérieur entrant trouvé en position [");
       // System.out.print("][");
        //System.out.println("]");

        System.out.print("Il vous faut ");
        System.out.print(resultat);
        System.out.println(" mètres de clôture pour votre terrain.");

        /*******************************************
         * Ne rien modifier aprÃ¨s cette ligne.
         *******************************************/
    }
}