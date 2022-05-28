package intro_oo;

public abstract class Employee {
	/**
	 * Attribut contenant le nom de Secretaire
	 */
	protected String nom;

	/**
	 * Attribut contenant le matricule de Secretaire
	 */
	protected int matricule;

	/**
	 * Getter pour l'attribut nom.
	 * 
	 * @return Le nom de Secretaire.
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Getter pour l'attribut matricule.
	 * 
	 * @return Le matricule de Secretaire.
	 */
	public int getMatricule() {
		return this.matricule;
	}

	public Employee(String le_nom, int le_matricule) {
		// Assignation de l'attribut nom.
		this.nom = le_nom;

		// Assignation de l'attribut matricule, avec validation de la valeur.
		if (le_matricule < 100000 || le_matricule > 999999) {
			this.matricule = 999999;
		} else {
			this.matricule = le_matricule;
		}
	}

	/**
	 * Cette procédure affiche le nom et le matricule de l'Employee.
	 */
	public void afficherNomMatricule() {
		System.out.println("EmployéE " + this.nom + " #" + this.matricule);
	}
	
	/**
	 * Cette méthode doit être redéfinie dans les classes-filles sinon les
	 * classes-filles seront aussi abstraites. Il n'est pas possible de créer
	 * des objets d'une classe abstraite. 
	 * La redéfinition dans les classes-filles doit calculer le salaire 
	 * hebdomadaire et retourner le salaire calculé.
	 * @return Le salaire hebdomadaire calculé.
	 */
	abstract int calculerSalaireHebdomadaire();
}
