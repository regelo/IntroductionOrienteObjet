package intro_oo;

public class Correctrice extends Employee {
	/**
	 * Attribut contenant le nombre de balais de Correctrice.
	 */
	private int heurescontrat;
			
	/**
	 * Constructeur de la classe Correctrice. Donc la seule
	 * manière de créer un objet de type Correctrice est de lui spécifier
	 * les trois informations suivantes.
	 * @param le_nom Le nom de Correctrice.
	 * @param le_matricule Le matricule de Correctrice.
	 * @param les_heures_du_contrat Le nombre d'heures dans le contrat de Correctrice.
	 */
	public Correctrice(String le_nom, int le_matricule, int les_heures_du_contrat) {
		super(le_nom, le_matricule);
		
		// Assignation de l'attribut heurescontrat, avec validation de la valeur.
		if (heurescontrat<0) {
			this.heurescontrat = 0;
		}
		else {
			this.heurescontrat = les_heures_du_contrat;
		}		
	}
	
	/**
	 * Cette fonction calcule et retourne le salaire hebdomadaire de Correctrice,
	 * tel que défini dans les exigences.
	 * @return Le salaire hebdomadaire de Correctrice.
	 */
	public int calculerSalaireHebdomadaire() {
		// Supposons que selon les exigences, son salaire hebdomadaire est
		// le nombre d'heures du contrat multiplié par 20.
		return 20 * this.heurescontrat;
	}
}
