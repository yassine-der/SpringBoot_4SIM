package tn.esprit.tpspringboot.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table (name="Facture")

public class Facture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Facture() {
		super();
	}
	public Facture(long idFacture, Float montantRemise, Float montantFacture, Date dateFacture, boolean active,
			Set<DetailFacture> detailfacture, Client client) {
		super();
		this.idFacture = idFacture;
		this.montantRemise = montantRemise;
		this.montantFacture = montantFacture;
		this.dateFacture = dateFacture;
		this.active = active;
		this.detailfacture = detailfacture;
		this.client = client;
	}
	public long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(long idFacture) {
		this.idFacture = idFacture;
	}
	public Float getMontantRemise() {
		return montantRemise;
	}
	public void setMontantRemise(Float montantRemise) {
		this.montantRemise = montantRemise;
	}
	public Float getMontantFacture() {
		return montantFacture;
	}
	public void setMontantFacture(Float montantFacture) {
		this.montantFacture = montantFacture;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Set<DetailFacture> getDetailfacture() {
		return detailfacture;
	}
	public void setDetailfacture(Set<DetailFacture> detailfacture) {
		this.detailfacture = detailfacture;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long idFacture;
	private Float montantRemise;
	private Float montantFacture;
	//@Temporal(TemporalType.DATE)
	private Date dateFacture;
	private boolean active;
	@OneToMany(mappedBy="facture")
	private Set<DetailFacture> detailfacture; 
	private Client client;
}
