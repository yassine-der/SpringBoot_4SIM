package tn.esprit.tpspringboot.service;

import java.util.List;

import tn.esprit.tpspringboot.entity.Facture;

public interface FactureService {

	public List<Facture> retrieveAllFactures();
	public void cancelFacture(Long id);
	public Facture retrieveFacture(Long id);
}
