package tn.esprit.tpspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tpspringboot.entity.Rayon;
@Repository
public interface RayonRepository extends CrudRepository<Rayon,Long> {

}
