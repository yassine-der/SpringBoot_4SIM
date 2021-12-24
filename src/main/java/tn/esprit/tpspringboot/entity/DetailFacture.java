package tn.esprit.tpspringboot.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table (name="DetailFacture")
public class DetailFacture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long idDetailFacture;
	public long getIdDetailFacture() {
		return idDetailFacture;
	}

	public DetailFacture(long idDetailFacture, int qte, Float prixTotale, int pourcentageRemise, int montantRemise,
			Produit produit, Facture facture) {
		super();
		this.idDetailFacture = idDetailFacture;
		this.qte = qte;
		this.prixTotale = prixTotale;
		this.pourcentageRemise = pourcentageRemise;
		this.montantRemise = montantRemise;
		this.produit = produit;
		this.facture = facture;
	}

	public DetailFacture() {
		super();
	}

	public void setIdDetailFacture(long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public Float getPrixTotale() {
		return prixTotale;
	}

	public void setPrixTotale(Float prixTotale) {
		this.prixTotale = prixTotale;
	}

	public int getPourcentageRemise() {
		return pourcentageRemise;
	}

	public void setPourcentageRemise(int pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}

	public int getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(int montantRemise) {
		this.montantRemise = montantRemise;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	private int qte;
	private Float prixTotale;
	private int pourcentageRemise;
	private int montantRemise;
	@ManyToOne
	private Produit produit;

	@ManyToOne
	private Facture facture;
}
