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
	 * Setter pour l'attribut balai. Je garde ce setter parce qu'on pourrait
	 * avoir besoin de changer le nombre de balais durant la durée de vie d'un
	 * objet de type Concierge.
	 * @param les_balais Le nombre de balai qui sera assigné à l'attribut balai.
	 */
	public void setBalai(int les_balais) {
		// On valide si le nombre de balais donné est bon.
		if (les_balais<0 || les_balais>50) {
			// On assume que les exigences spécifie que si on obtient une
			// valeur invalide, on fixe le nombre à zéro.
			this.balai = 0;
		}
		else {
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
	
	/**
	 * Constructeur de la classe Concierge. Donc la seule
	 * manière de créer un objet de type Concierge est de lui spécifier
	 * les trois informations suivantes.
	 * @param le_nom Le nom du Concierge.
	 * @param le_matricule Le matricule du Concierge.
	 * @param les_balais Le nombre de balais du Concierge.
	 */
	public Concierge(String le_nom, int le_matricule, int les_balais) {
		// Assignation de l'attribut nom.
		this.nom = le_nom;
		
		// Assignation de l'attribut matricule, avec validation de la valeur.
		if (le_matricule<100000 || le_matricule>999999) {
			this.matricule = 999999;
		}
		else {
			this.matricule = le_matricule;
		}
		
		// Assignation de l'attribut balai, avec validation de la valeur.
		if (balai<0 || balai>50) {
			this.balai = 0;
		}
		else {
			this.balai = les_balais;
		}		
	}
}
