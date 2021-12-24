package tn.esprit.tpspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tpspringboot.entity.Facture;
import tn.esprit.tpspringboot.repository.FactureRepository;
@Service
public class FactureServiceImpl implements FactureService{
@Autowired
FactureRepository factureRepository;
	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> facture = (List<Facture>) factureRepository.findAll();
		return facture;
	}

	@Override
	public void cancelFacture(Long id) {

			Facture f = factureRepository.findById(id).get();
			f.setActive(false);
			factureRepository.save(f);
			}

	@Override
	public Facture retrieveFacture(Long id) {
		// TODO Auto-generated method stub
		return factureRepository.findById(id).get();
	}

}
