package intro_oo;

public class Concierge {
	/**
	 * Attribut contenant le nom du Concierge
	 */
	private String nom;
	
	/**
	 * Attribut contenant le matricule du Concierge
	 */
	private int matricule;
	
	/**
	 * Attribut contenant le nombre de balais du Concierge.
	 */
	private int balai;
	
	/**
	 * Setter pour l'attribut nom.
	 * @param le_nom Le nom qui sera assigné à l'attribut nom.
	 */
	public void setNom(String le_nom) {
		// Le "this." est optionnel ici, mais j'aime bien le mettre
		// parce que c'est plus facile de voir que c'est un attribut.
		// Ça permet aussi au compilateur de ne pas être mélangé dans
		// le cas où le paramètre s'appelerait aussi "nom". Notez qu'on
		// ne fait pas de validation ici : tous les noms sont valides.
		this.nom = le_nom;
	}
	
	public void setMatricule(int le_matricule) {
		// On valide si le matricule donné est bon.
		if (le_matricule<100000 || le_matricule>999999) {
			// Si le matricule donné n'est pas bon, on lui donne le 
			// matricule 999999. On peut supposer que dans les exigences,
			// si le matricule donné n'est pas bon, on le fixe à ce matricule
			// spécial.
			// Le "this." est optionnel ici, mais j'aime bien le mettre
			// parce que c'est plus facile de voir que c'est un attribut.
			this.matricule = 999999;
		}
		else {
			// Le "this." est optionnel ici, mais j'aime bien le mettre
			// parce que c'est plus facile de voir que c'est un attribut.
			this.matricule = le_matricule;
		}
	}
	
	/**
	 * Setter pour l'attribut balai.
	 * @param les_balais Le nombre de balai qui sera assigné à l'attribut balai.
	 */
	public void setBalai(int les_balais) {
		// On valide si le nombre de balais donné est bon.
		if (les_balais<0 || les_balais>50) {
			// On assume que les exigences spécifie que si on obtient une
			// valeur invalide, on fixe le nombre à zéro.
			// Le "this." est optionnel ici, mais j'aime bien le mettre
			// parce que c'est plus facile de voir que c'est un attribut.
			this.balai = 0;
		}
		else {
			// Le "this." est optionnel ici, mais j'aime bien le mettre
			// parce que c'est plus facile de voir que c'est un attribut.
			this.balai = les_balais;
		}
	}
	
	
	/**
	 * Getter pour l'attribut nom.
	 * @return Le nom du Concierge.
	 */
	public String getNom() {
		// Le "this." est optionnel ici, mais j'aime bien le mettre
		// parce que c'est plus facile de voir que c'est un attribut.
		return this.nom;
	}
	
	/**
	 * Getter pour l'attribut matricule.
	 * @return Le matricule du Concierge.
	 */
	public int getMatricule() {
		// Le "this." est optionnel ici, mais j'aime bien le mettre
		// parce que c'est plus facile de voir que c'est un attribut.
		return this.matricule;
	}
	
	/**
	 * Getter pour l'attribut balai.
	 * @return Le nombre de balais du concierge.
	 */
	public int getBalai() {
		// Le "this." est optionnel ici, mais j'aime bien le mettre
		// parce que c'est plus facile de voir que c'est un attribut.
		return this.balai;
	}
	
	
}
