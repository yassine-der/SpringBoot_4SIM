package tn.esprit.tpspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tpspringboot.entity.Produit;
@Repository
public interface ProduitRepository extends CrudRepository<Produit,Long> {

}
