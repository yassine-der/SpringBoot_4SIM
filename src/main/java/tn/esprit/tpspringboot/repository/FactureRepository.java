package tn.esprit.tpspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tpspringboot.entity.Facture;

@Repository
public interface FactureRepository extends CrudRepository <Facture,Long> {

}
