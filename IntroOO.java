package intro_oo;

import java.util.ArrayList;
import java.util.Scanner;

public class IntroOO {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		ArrayList<Concierge> concierges = new ArrayList<Concierge>();
		ArrayList<Correctrice> correctrices = new ArrayList<Correctrice>();
		ArrayList<Secretaire> secretaires = new ArrayList<Secretaire>();
		
		// On obtient les infos de trois personnes.
		for (int i = 0; i < 3; i++) {
			// On demande quel type de personne il faut créer.
			int type = obtenirEntier(clavier, "(1=concierge, 2=correctrice, 3=secretaire) donc un entier ", 1, 3);
						
			// Lecture du nom de la personne.
			System.out.println("Entrez le nom de la personne : ");
			String nom = clavier.nextLine();

			// Lecture du matricule de la personne.
			int matricule = obtenirEntier(clavier, "matricule", 100000, 999999);

			switch(type) {
			case 1:
				// Concierge
				int balai = obtenirEntier(clavier, "nombre de balais", 0, 50);
				Concierge un_concierge = new Concierge(nom, matricule, balai);
				concierges.add(un_concierge);
				break;
			case 2:
				// Correctrice
				int heures_contrat = obtenirEntier(clavier, "heures du contrat", 0, 100);
				Correctrice une_correctrice = new Correctrice(nom, matricule, heures_contrat);
				correctrices.add(une_correctrice);
				break;
			case 3:
				// Secrétaire
				int taux_horaire = obtenirEntier(clavier, "taux horaire", 15, 200);
				Secretaire une_secretaire = new Secretaire(nom, matricule, taux_horaire);
				secretaires.add(une_secretaire);
				break;
			}
		}

		clavier.close();

		// Affichage des infos des concierges
		for(int i=0 ; i<concierges.size() ; i++) {
			Concierge notre_concierge = concierges.get(i);
			notre_concierge.afficherNomMatricule();
			System.out.println("Le salaire hebdomadaire de " + notre_concierge.getNom() + " est " + notre_concierge.calculerSalaireHebdomadaire() + " $");
		}
		
		// Affichage des infos des correctrices
		for(int i=0 ; i<correctrices.size() ; i++) {
			Correctrice notre_correctrice = correctrices.get(i);
			notre_correctrice.afficherNomMatricule();
			System.out.println("Le salaire hebdomadaire de " + notre_correctrice.getNom() + " est " + notre_correctrice.calculerSalaireHebdomadaire() + " $");
		}
		
		// Affichage des infos des secrétaires
		for(int i=0 ; i<secretaires.size() ; i++) {
			Secretaire notre_secretaire = secretaires.get(i);
			notre_secretaire.afficherNomMatricule();
			System.out.println("Le salaire hebdomadaire de " + notre_secretaire.getNom() + " est " + notre_secretaire.calculerSalaireHebdomadaire() + " $");
		}
	}

	/**
	 * Fonction permettant d'obtenir un entier dans une plage donnée.
	 * 
	 * @param lecteur      Un objet de type Scanner déjà préparé et prêt à être
	 *                     utilisé.
	 * @param nom_variable Le nom de l'entier qui sera affiché à la personne
	 *                     utilisatrice.
	 * @param minimum      La valeur minimale valide. Celle-ci doit être inférieure
	 *                     ou égale au maximum.
	 * @param maximum      La valeur maximale valide. Celle-ci doit être supérieure
	 *                     ou égale au minimum.
	 * @return Un entier entré par la personne utilisatrice et qui est >=minimum et
	 *         <=maximum
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
