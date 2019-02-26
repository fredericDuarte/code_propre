package ex1;

import java.util.Date;

/**
 * Définition d'une classe Entreprise
 * 
 * @author Diginamic
 *
 */
public class Entreprise {

	private int siret;
	private String nom;
	private String adresse;
	private Date date_Creation;

	public static final int CAPITAL_MAX = 3000000;

	public void Afficher_statut() {
       system.out.println("Statut actuel")
	}

	/**
	 * Getter & Seter
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	public int getSiret() {
		return siret;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setDate-Creation(Date date-Creation) {
		this.date-Creation = date-Creation;
	}

	public String getDate-Creation() {
		return this.date-Creation;
	}

}
