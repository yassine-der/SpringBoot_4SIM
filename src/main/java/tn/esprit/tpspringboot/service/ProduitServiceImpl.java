package tn.esprit.tpspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tpspringboot.entity.Produit;
import tn.esprit.tpspringboot.entity.Rayon;
import tn.esprit.tpspringboot.entity.Stock;
import tn.esprit.tpspringboot.repository.ProduitRepository;
import tn.esprit.tpspringboot.repository.RayonRepository;
import tn.esprit.tpspringboot.repository.StockRepository;

@Service
public class ProduitServiceImpl implements produitService {
	@Autowired 
	ProduitRepository produitRepository;
	@Autowired
	RayonRepository rayonRepository;
	@Autowired 
	StockRepository stockRepository;
	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits = (List<Produit>) produitRepository.findAll();
		return produits;
	}

	@Override
	public Long addProduit(Produit p, Long idRayon, Long idStock) {
		Rayon r = rayonRepository.findById(idRayon).get();
		Stock s = stockRepository.findById(idStock).get();
		p.setRayon(r);
		p.setStock(s);
		produitRepository.save(p);
		
		return  p.getIdProduit();
	}

	@Override
	public Produit retrieveProduit(Long id) {
		// TODO Auto-generated method stub
		return  produitRepository.findById(id).get();
	}

}
