package intro_oo;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroOO {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		ArrayList<Concierge> concierges = new ArrayList<Concierge>();
		
		// On obtient les infos de trois concierges.
		for (int i = 0; i < 3; i++) {
			// Lecture du nom du concierge.
			System.out.println("Entrez le nom du concierge : ");
			String nom = clavier.nextLine();

			// Lecture du matricule du concierge.
			int matricule = obtenirEntier(clavier, "matricule", 100000, 999999);

			// Lecture du nombre de balais du concierge.
			int balai = obtenirEntier(clavier, "nombre de balais", 0, 50);

			Concierge un_concierge = new Concierge();
			un_concierge.nom = nom;
			un_concierge.matricule = matricule;
			un_concierge.balai = balai;
			
			concierges.add(un_concierge);
		}

		clavier.close();

		// Affichage des infos des trois concierges
		for(int i=0 ; i<3 ; i++) {
			Concierge notre_concierge = concierges.get(i);
			System.out.print("Concierge " + notre_concierge.nom);
			System.out.print(" dont le matricule est " + notre_concierge.matricule);
			System.out.println(" possède " + notre_concierge.balai + " balais.");
		}
	}

	/**
	 * Fonction permettant d'obtenir un entier dans une plage donnée.
	 * @param lecteur Un objet de type Scanner déjà préparé et prêt à être utilisé.
	 * @param nom_variable Le nom de l'entier qui sera affiché à la personne utilisatrice.
	 * @param minimum La valeur minimale valide. Celle-ci doit être inférieure ou égale au maximum.
	 * @param maximum La valeur maximale valide. Celle-ci doit être supérieure ou égale au minimum.
	 * @return Un entier entré par la personne utilisatrice et qui est >=minimum et <=maximum
	 */
	public static int obtenirEntier(Scanner lecteur, String nom_variable, int minimum, int maximum) {
		boolean entree_valide = false;
		int valeur_lue = 0;
		do {
			System.out.println("Entrez un " + nom_variable + " >=" + minimum + " et <=" + maximum);
			if (lecteur.hasNextInt()) {
				valeur_lue = lecteur.nextInt();
				if (valeur_lue >= minimum && valeur_lue <= maximum) {
					entree_valide = true;
				}
			}

			// Vider le tampon du '\n' qui traîne si lecture
			// Vider le tampon des caractères incorrects si pas de lecture
			lecteur.nextLine();

		} while (!entree_valide);

		return valeur_lue;
	}

}
