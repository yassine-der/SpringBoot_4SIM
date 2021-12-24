package tn.esprit.tpspringboot.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="Produits")
public class Produit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long idProduit;
	private String codeProduit;
	private String libelleProduit;
	private int prixUnitaire;
	@OneToOne
	private DetailsProduit detailsProduit;
	@ManyToOne
	 Rayon rayon;
	@ManyToOne
	 Stock stock;
	@OneToMany(mappedBy="produit")
	private Set<DetailFacture> detailFacture;
	@ManyToMany 
	private Set<Fournisseur> fournisseurs;
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public Produit(Long idProduit, String codeProduit, String libelleProduit, int prixUnitaire,
			DetailsProduit detailsProduit, Rayon rayon, Stock stock, Set<DetailFacture> detailFacture,
			Set<Fournisseur> fournisseurs) {
		super();
		this.idProduit = idProduit;
		this.codeProduit = codeProduit;
		this.libelleProduit = libelleProduit;
		this.prixUnitaire = prixUnitaire;
		this.detailsProduit = detailsProduit;
		this.rayon = rayon;
		this.stock = stock;
		this.detailFacture = detailFacture;
		this.fournisseurs = fournisseurs;
	}
	
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getLibelleProduit() {
		return libelleProduit;
	}
	public Produit() {
		super();
	}
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	public int getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public DetailsProduit getDetailsProduit() {
		return detailsProduit;
	}
	public void setDetailsProduit(DetailsProduit detailsProduit) {
		this.detailsProduit = detailsProduit;
	}
	public Rayon getRayon() {
		return rayon;
	}
	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public Set<DetailFacture> getDetailFacture() {
		return detailFacture;
	}
	public void setDetailFacture(Set<DetailFacture> detailFacture) {
		this.detailFacture = detailFacture;
	}
	public Set<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}
	public void setFournisseurs(Set<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}
	
}
