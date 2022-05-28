package intro_oo;

public class Secretaire extends Employee {
	
	/**
	 * Attribut contenant le taux horaire de Secretaire.
	 */
	private int taux_horaire;
		
	
	/**
	 * Constructeur de la classe Secretaire. Donc la seule
	 * manière de créer un objet de type Secretaire est de lui spécifier
	 * les trois informations suivantes.
	 * @param le_nom Le nom de Secretaire.
	 * @param le_matricule Le matricule de Secretaire.
	 * @param les_heures_du_contrat Le taux horaire de Secretaire.
	 */
	public Secretaire(String le_nom, int le_matricule, int le_taux_horaire) {
		super(le_nom, le_matricule);
		
		// Assignation de l'attribut taux_horaire, avec validation de la valeur.
		if (le_taux_horaire<15) {
			this.taux_horaire = 15;
		}
		else {
			this.taux_horaire = le_taux_horaire;
		}		
	}
	
	/**
	 * Cette fonction calcule et retourne le salaire hebdomadaire de Secretaire,
	 * tel que défini dans les exigences.
	 * @return Le salaire hebdomadaire de Secretaire.
	 */
	public int calculerSalaireHebdomadaire() {
		// Supposons que selon les exigences, son salaire hebdomadaire est
		// le taux horaire multiplié par 40.
		return this.taux_horaire * 40;
	}
}
