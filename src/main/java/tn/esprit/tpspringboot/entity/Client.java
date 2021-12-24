package tn.esprit.tpspringboot.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table (name="Client")

public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public long getIdClient() {
		return idClient;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public String getNom() {
		return nom;
	}
	public Client() {
		super();
	}
	public Client(long idClient, String nom, String prenom, Date dateNaissence, String email, String password,
			Set<Facture> facture, Profession profession, CategorieClient categorieClient) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissence = dateNaissence;
		this.email = email;
		this.password = password;
		this.facture = facture;
		this.profession = profession;
		this.categorieClient = categorieClient;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissence() {
		return dateNaissence;
	}
	public void setDateNaissence(Date dateNaissence) {
		this.dateNaissence = dateNaissence;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Facture> getFacture() {
		return facture;
	}
	public void setFacture(Set<Facture> facture) {
		this.facture = facture;
	}
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	public CategorieClient getCategorieClient() {
		return categorieClient;
	}
	public void setCategorieClient(CategorieClient categorieClient) {
		this.categorieClient = categorieClient;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long idClient;
	private String nom;
	private String prenom;
	//@Temporal(TemporalType.DATE)
	private Date dateNaissence;
	private String email;
	private String password;
	@OneToMany(mappedBy="client")
	private Set<Facture> facture;
	@Enumerated(EnumType.STRING)
	private Profession profession;
	@Enumerated(EnumType.STRING)
	private CategorieClient categorieClient;

}
