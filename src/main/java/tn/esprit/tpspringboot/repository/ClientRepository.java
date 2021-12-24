package tn.esprit.tpspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.tpspringboot.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {

}
