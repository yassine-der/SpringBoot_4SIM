package tn.esprit.tpspringboot.repository;

import tn.esprit.tpspringboot.entity.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<Stock,Long> {

}
