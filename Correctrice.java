package intro_oo;

public class Correctrice {
	/**
	 * Attribut contenant le nom de Correctrice
	 */
	private String nom;
	
	/**
	 * Attribut contenant le matricule de Correctice
	 */
	private int matricule;
	
	/**
	 * Attribut contenant le nombre de balais de Correctrice.
	 */
	private int heurescontrat;
		
	/**
	 * Getter pour l'attribut nom.
	 * @return Le nom de Correctrice.
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Getter pour l'attribut matricule.
	 * @return Le matricule de Correctrice.
	 */
	public int getMatricule() {
		return this.matricule;
	}
	
	/**
	 * Getter pour l'attribut heurescontrats.
	 * @return Le nombre d'heures dans le contrat de Correctrice.
	 */
	public int getHeuresContrat() {
		return this.heurescontrat;
	}
	
	/**
	 * Constructeur de la classe Correctrice. Donc la seule
	 * manière de créer un objet de type Correctrice est de lui spécifier
	 * les trois informations suivantes.
	 * @param le_nom Le nom de Correctrice.
	 * @param le_matricule Le matricule de Correctrice.
	 * @param les_heures_du_contrat Le nombre d'heures dans le contrat de Correctrice.
	 */
	public Correctrice(String le_nom, int le_matricule, int les_heures_du_contrat) {
		// Assignation de l'attribut nom.
		this.nom = le_nom;
		
		// Assignation de l'attribut matricule, avec validation de la valeur.
		if (le_matricule<100000 || le_matricule>999999) {
			this.matricule = 999999;
		}
		else {
			this.matricule = le_matricule;
		}
		
		// Assignation de l'attribut heurescontrat, avec validation de la valeur.
		if (heurescontrat<0) {
			this.heurescontrat = 0;
		}
		else {
			this.heurescontrat = les_heures_du_contrat;
		}		
	}
	
	/**
	 * Cette procédure affiche le nom et le matricule de Correctrice.
	 */
	public void afficherNomMatricule() {
		System.out.println("Correctrice " + this.nom + " #" + this.matricule);
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
