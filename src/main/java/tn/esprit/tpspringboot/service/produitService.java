package tn.esprit.tpspringboot.service;

import java.util.List;

import tn.esprit.tpspringboot.entity.Produit;


public interface produitService {
	public List<Produit> retrieveAllProduits();

	public Produit addProduit(Produit p, Long idRayon, Long idStock);

	public Produit retrieveProduit(Long id);
}
