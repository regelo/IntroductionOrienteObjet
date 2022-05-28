package intro_oo;

public class Secretaire {
	/**
	 * Attribut contenant le nom de Secretaire
	 */
	private String nom;
	
	/**
	 * Attribut contenant le matricule de Secretaire
	 */
	private int matricule;
	
	/**
	 * Attribut contenant le taux horaire de Secretaire.
	 */
	private int taux_horaire;
		
	/**
	 * Getter pour l'attribut nom.
	 * @return Le nom de Secretaire.
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Getter pour l'attribut matricule.
	 * @return Le matricule de Secretaire.
	 */
	public int getMatricule() {
		return this.matricule;
	}
	
	/**
	 * Getter pour l'attribut taux_horaire.
	 * @return Le taux horaire de Secretaire.
	 */
	public int getTauxHoraire() {
		return this.taux_horaire;
	}
	
	/**
	 * Constructeur de la classe Secretaire. Donc la seule
	 * manière de créer un objet de type Secretaire est de lui spécifier
	 * les trois informations suivantes.
	 * @param le_nom Le nom de Secretaire.
	 * @param le_matricule Le matricule de Secretaire.
	 * @param les_heures_du_contrat Le taux horaire de Secretaire.
	 */
	public Secretaire(String le_nom, int le_matricule, int le_taux_horaire) {
		// Assignation de l'attribut nom.
		this.nom = le_nom;
		
		// Assignation de l'attribut matricule, avec validation de la valeur.
		if (le_matricule<100000 || le_matricule>999999) {
			this.matricule = 999999;
		}
		else {
			this.matricule = le_matricule;
		}
		
		// Assignation de l'attribut taux_horaire, avec validation de la valeur.
		if (le_taux_horaire<15) {
			this.taux_horaire = 15;
		}
		else {
			this.taux_horaire = le_taux_horaire;
		}		
	}
	
	/**
	 * Cette procédure affiche le nom et le matricule de Secretaire.
	 */
	public void afficherNomMatricule() {
		System.out.println("Secrétaire " + this.nom + " #" + this.matricule);
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
