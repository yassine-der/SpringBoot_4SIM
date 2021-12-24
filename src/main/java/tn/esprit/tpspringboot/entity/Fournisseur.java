package tn.esprit.tpspringboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Fournisseur")
public class Fournisseur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long idFornisseur;
	
	public String getCodeFournisseur() {
		return codeFournisseur;
	}
	public void setCodeFournisseur(String codeFournisseur) {
		this.codeFournisseur = codeFournisseur;
	}
	public String getLibelleFourinsseur() {
		return libelleFourinsseur;
	}
	public void setLibelleFourinsseur(String libelleFourinsseur) {
		this.libelleFourinsseur = libelleFourinsseur;
	}
	private String codeFournisseur;
	private String libelleFourinsseur;
	public Fournisseur() {
		super();
	}
	public Fournisseur(long idFornisseur, String codeFournisseur, String libelleFourinsseur) {
		super();
		this.idFornisseur = idFornisseur;
		this.codeFournisseur = codeFournisseur;
		this.libelleFourinsseur = libelleFourinsseur;
	}
	public long getIdFornisseur() {
		return idFornisseur;
	}
	public void setIdFornisseur(long idFornisseur) {
		this.idFornisseur = idFornisseur;
	}
	
}
