package tn.esprit.tpspringboot.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name="DetailsProduits")
public class DetailsProduit implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int idDetailsProduit;
	public DetailsProduit() {
		super();
	}
	private Date date_de_creation;
	public DetailsProduit(int idDetailsProduit, Date date_de_creation, Date dateDernierModification, Produit produit,
			CategorieProduit categorieProduit) {
		super();
		this.idDetailsProduit = idDetailsProduit;
		this.date_de_creation = date_de_creation;
		this.dateDernierModification = dateDernierModification;
		this.produit = produit;
		this.categorieProduit = categorieProduit;
	}
	public int getIdDetailsProduit() {
		return idDetailsProduit;
	}
	public void setIdDetailsProduit(int idDetailsProduit) {
		this.idDetailsProduit = idDetailsProduit;
	}
	public Date getDate_de_creation() {
		return date_de_creation;
	}
	public void setDate_de_creation(Date date_de_creation) {
		this.date_de_creation = date_de_creation;
	}
	public Date getDateDernierModification() {
		return dateDernierModification;
	}
	public void setDateDernierModification(Date dateDernierModification) {
		this.dateDernierModification = dateDernierModification;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public CategorieProduit getCategorieProduit() {
		return categorieProduit;
	}
	public void setCategorieProduit(CategorieProduit categorieProduit) {
		this.categorieProduit = categorieProduit;
	}
	private Date dateDernierModification;
	
	@OneToOne(mappedBy="detailsProduit")
	private Produit produit;
	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;


}
