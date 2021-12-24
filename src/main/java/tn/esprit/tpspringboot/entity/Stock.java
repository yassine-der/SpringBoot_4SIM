package tn.esprit.tpspringboot.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name="Stock")

public class Stock implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Stock() {
		super();
	}
	public Stock(long idStock, int qteStock, int qteMin, String libelle, Set<Produit> produit) {
		super();
		this.idStock = idStock;
		this.qteStock = qteStock;
		this.qteMin = qteMin;
		this.libelle = libelle;
		this.produit = produit;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long idStock;
	private int qteStock;
	private int qteMin;
	
	public long getIdStock() {
		return idStock;
	}
	public void setIdStock(long idStock) {
		this.idStock = idStock;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	public int getQteMin() {
		return qteMin;
	}
	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Set<Produit> getProduit() {
		return produit;
	}
	public void setProduit(Set<Produit> produit) {
		this.produit = produit;
	}
	private String libelle;
@OneToMany(mappedBy="stock")
private Set<Produit> produit;
}
