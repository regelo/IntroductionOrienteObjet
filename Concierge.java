package intro_oo;

public class Concierge extends Employee {
	/**
	 * Attribut contenant le nombre de balais du Concierge.
	 */
	private int balai;
	
	/**
	 * Constructeur de la classe Concierge. Donc la seule
	 * manière de créer un objet de type Concierge est de lui spécifier
	 * les trois informations suivantes.
	 * @param le_nom Le nom du Concierge.
	 * @param le_matricule Le matricule du Concierge.
	 * @param les_balais Le nombre de balais du Concierge.
	 */
	public Concierge(String le_nom, int le_matricule, int les_balais) {
		super(le_nom, le_matricule);
		
		// Assignation de l'attribut balai, avec validation de la valeur.
		if (balai<0 || balai>50) {
			this.balai = 0;
		}
		else {
			this.balai = les_balais;
		}		
	}
	
	/**
	 * Cette fonction calcule et retourne le salaire hebdomadaire du Concierge,
	 * tel que défini dans les exigences.
	 * @return Le salaire hebdomadaire du concierge.
	 */
	public int calculerSalaireHebdomadaire() {
		// Supposons que selon les exigences, son salaire hebdomadaire est
		// 900$ plus son nombre de balais.
		return 900 + this.balai;
	}
}
