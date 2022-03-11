import java.util.ArrayList;

class Auteur {

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
	// Completer la classe Auteur ici
	private String nom;
	private boolean prix;
	
	public Auteur(String nomAuteur, boolean prixOuNon){
		this.nom = nomAuteur;
		this.prix = prixOuNon; 
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public boolean getPrix() {
		return this.prix;
	}
}

class Oeuvre
{
 	// Completer la classe Oeuvre ici
	private String titre;
	private String langue;
	private Auteur auteur;
	
	
	public Oeuvre(String titre, Auteur auteur, String langue) {
		this.titre = titre;
		this.auteur = auteur;
		this.langue = langue;
	}
	public Oeuvre(String titre, Auteur auteur) {
		this.titre = titre;
		this.auteur = auteur;
		this.langue = "francais";
	}

		
	
	public String getTitre() {
		return this.titre;
	}
	
	public Auteur getAuteur() {
		return this.auteur;
	}
	
	public String getLangue() {
		return this.langue;
	}
	
	public void afficher() {
		System.out.println(this.titre +  ", " + this.auteur.getNom() + ", en " + this.langue);
	}
}

class Exemplaire {
	public Oeuvre oeuvre;
	Auteur auteur;
	
	public Exemplaire(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
		this.auteur = oeuvre.getAuteur();
		System.out.println("Nouvel exemplaire -> " + oeuvre.getTitre() +", " + auteur.getNom() + ",  en " + oeuvre.getLangue());
	}
	
	// constructeur de copie
	public Exemplaire(Exemplaire exemplaires) {
		oeuvre = exemplaires.oeuvre;
		auteur = exemplaires.auteur;
		
		System.out.println("Copie d’un exemplaire de -> " + oeuvre.getTitre() + ", " + auteur.getNom() + ", en " + oeuvre.getLangue());
	}
	
	public Oeuvre getOeuvre() {
		return oeuvre;
	}
	
	public void afficher() {
		System.out.println("Un exemplaire de " + oeuvre.getTitre() + ", " + auteur.getNom() + ",  en " + oeuvre.getLangue());
	}
	
}

class Bibliotheque {
	private String nom;
	ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
	
	public Bibliotheque(String nom) {
		this.nom = nom;
		System.out.println("La bibliothèque "+ this.nom +" est ouverte !");
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNbExemplaires () {
		return this.exemplaires.size();
	}
	
	public void stocker(Oeuvre oeuvre, int n) {		
		for(int i=0 ; i<n ; ++i) {
			Exemplaire ex2 = new Exemplaire(oeuvre);
			this.exemplaires.add(ex2);
		}
	}
	
	public void stocker(Oeuvre oeuvre) {
		Exemplaire ex2 = new Exemplaire(oeuvre);
		this.exemplaires.add(ex2);
	}
	
	public ArrayList<Exemplaire> listerExemplaires(String langue){
		
		ArrayList<Exemplaire> exemplairesFiltres = new ArrayList<Exemplaire>();

		for(int i=0 ; i<this.exemplaires.size(); ++i) {
			if(this.exemplaires.get(i).getOeuvre().getLangue() == langue) {
				exemplairesFiltres.add(this.exemplaires.get(i));
			}
		}
		return exemplairesFiltres;
	}
	
	public ArrayList<Exemplaire> listerExemplaires(){
		return this.exemplaires;
	}
	
	public int compterExemplaires (Oeuvre oeuvre) {
		int nombreExemplaire = 0;
		for(int i = 0 ; i < this.exemplaires.size() ; ++i) {
			Exemplaire exemplaire = this.exemplaires.get(i);
			if(exemplaire.getOeuvre().equals(oeuvre)) {
				nombreExemplaire++;
			}
		}
		return nombreExemplaire;	
	}
	
	public void afficherAuteur(boolean aUnPrix) {	
		for(int i = 0 ; i < this.exemplaires.size() ; ++i) {
			if(aUnPrix == true && this.exemplaires.get(i).auteur.getPrix()) {
				System.out.println(this.exemplaires.get(i).auteur.getNom());
			}
			else if(aUnPrix == false && this.exemplaires.get(i).auteur.getPrix() == false) {
				System.out.println(this.exemplaires.get(i).auteur.getNom());
			}
		}
	}
	
	public void afficherAuteur() {
		for(int i = 0 ; i < this.exemplaires.size() ; ++i) {
			if(this.exemplaires.get(i).auteur.getPrix()) {
				System.out.println(this.exemplaires.get(i).auteur.getNom());
			}
		}
	}
	
}


// completer les autres classes ici


/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/
/*******************************************
 * Ce qui suit est propose' pour vous aider
 * dans vos tests, mais votre programme sera
 * teste' avec d'autres donnees.
 *******************************************/

public class Biblio {

    public static void afficherExemplaires(ArrayList<Exemplaire> exemplaires) {
        for (Exemplaire exemplaire : exemplaires) {
            System.out.print("\t");
            exemplaire.afficher();
        }
    }

    public static void main(String[] args) {
        // create and store all the exemplaries
        Auteur a1 = new Auteur("Victor Hugo", false);
        Auteur a2 = new Auteur("Alexandre Dumas", false);
        Auteur a3 = new Auteur("Raymond Queneau", true);

        Oeuvre o1 = new Oeuvre("Les Miserables", a1, "francais");
        Oeuvre o2 = new Oeuvre("L\'Homme qui rit", a1, "francais");
        Oeuvre o3 = new Oeuvre("Le Comte de Monte-Cristo", a2, "francais");
        Oeuvre o4 = new Oeuvre("Zazie dans le metro", a3, "francais");
        Oeuvre o5 = new Oeuvre("The count of Monte-Cristo", a2, "anglais");

        Bibliotheque biblio = new Bibliotheque("municipale");
        biblio.stocker(o1, 2);
        biblio.stocker(o2);
        biblio.stocker(o3, 3);
        biblio.stocker(o4);
        biblio.stocker(o5);

        // ...
        System.out.println("La bibliotheque " + biblio.getNom() + " offre ");
        afficherExemplaires(biblio.listerExemplaires());
        String langue = "anglais";
        System.out.println("Les exemplaires en " + langue + " sont  ");
        afficherExemplaires(biblio.listerExemplaires(langue));
        System.out.println("Les auteurs a succes sont  ");
        biblio.afficherAuteur();
        System.out.print("Il y a " + biblio.compterExemplaires(o3) + " exemplaires");
        System.out.println(" de  " + o3.getTitre());
    }
}