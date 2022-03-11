import java.util.ArrayList;
import java.util.Scanner;

class TrancheMax {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Entree de la matrice
        System.out.println("Saisie de la matrice :");
        String matrice = clavier.nextLine();
        System.out.format("Matrice saisie :\n%s\n", matrice);
        clavier.close();

        // Validation de la matrice
        if (!checkFormat(matrice)) {
            return;
        }

        // Trouver la liste des lignes avec le plus grand nombre de 1 consecutif
        // Ces numéros de lignes sont stockés dans un tableau dynamique
        ArrayList<Integer> maxConsecutifList = findConsecutiveList(matrice);

        if (maxConsecutifList.isEmpty()) {
            System.out.println("Pas de lignes avec des 1 !");
        } else {
            System.out.println("Ligne(s) avec le plus de 1 consecutifs :");
            for (Integer index : maxConsecutifList) {
                System.out.println(index);
            }
        }
    }
 
        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
    
    	public static boolean checkFormat(String matrice) {
    	
        // On vérifie que la matrice n'est pas vide
    	if(matrice == "0") {
    		return true;
    	}
        if(matrice.length()==0){
        	System.out.println("Matrice vide !");
        	return false;
        }
        else if(checkLineLength(matrice)== false) {
        	return false;
    	}
        else {
        // On vérifie que les lignes ne sont constituées que de 0, de 1, et d'espaces        
        for(int i=0; i<matrice.length(); ++i)
        {
        	if(matrice.charAt(i) != '0' && matrice.charAt(i) != '1' && matrice.charAt(i) != ' ')
        	{
        		System.out.println("Matrice invalide, seulement '1' , '0' et ' ' admis!");        		
        		return false;
        	}
        }
        
    	}
		return true;
    	}
    
 
       
        public static boolean checkLineLength ( String matrice ) {
			// On vérifie que les lignes sont de mêmes longueurs
        	boolean check = false;
        	String cleanMatrice = matrice.replaceAll("\\s+"," ");
        	String[] lignes = cleanMatrice.split(" {1,}");
         	for(int i=1; i<lignes.length; ++i)
         	{
         		if(lignes[i-1].length() != lignes[i].length())
         		{
         			
         			check = false;
         		}
         		else {
         			check = true;
         		}
         	}
         	if(check == false) {
         		System.out.println("Matrice invalide, lignes de longueurs differentes!");
         	}
         	return check;

        }

        public static int [][] consecutiveList(String matrix) {
            matrix = matrix.trim();
            String [] lines = matrix.split(" {1,}");
            int eachLine [][] = new int [lines.length][2];
            int compteur;
            for (int i = 0; i < lines.length; i++) {
                compteur = 0;
                for (int j = 0; j < lines[i].length(); j++) {
                    if (lines[i].charAt(j) == '1') {
                        compteur++;
                    } else {
                        if (compteur > eachLine[i][1]) {
                            eachLine[i][1] = compteur;
                        }
                        compteur = 0;
                    }
                }
                eachLine[i][0] = i;
                if ((compteur > eachLine[i][1]) ) {
                    eachLine[i][1] = compteur;
                }
            }
            return eachLine;
        }

       
        public static ArrayList<Integer> findConsecutiveList(String matrix) {
            ArrayList<Integer> maxList = new ArrayList<Integer>();
 
            int [][] eachLine = consecutiveList(matrix);

            for (int i = 0; i < eachLine.length; i++) {
                if ((maxList.isEmpty()) && (eachLine[i][1] > 0)) {
                maxList.add(i);
                i++;
            }
                 
                if (!maxList.isEmpty() && (eachLine[maxList.get(maxList.size()-1)][1] > 0)) {
                    if (eachLine[i][1] == eachLine[maxList.get(maxList.size()-1)][1]) {
                    maxList.add(i);
                } else {
                    if (eachLine[i][1] > eachLine[maxList.get(maxList.size()-1)][1]) {
                        maxList.clear();
                        maxList.add(i);
                    }
                }
            }
        }
            return maxList;
        }

        /*******************************************
         * Ne rien modifier apres cette ligne
         *******************************************/
 }