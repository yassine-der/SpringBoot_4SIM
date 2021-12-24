package tn.esprit.tpspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.tpspringboot.entity.Stock;
import tn.esprit.tpspringboot.repository.StockRepository;
@Service
public class StockServiceImpl implements StockService {
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		// TODO Auto-generated method stub
		List<Stock> stock = (List<Stock>) stockRepository.findAll();
		return stock;
	}

	@Override
	public Long addStock(Stock s) {
		stockRepository.save(s);
		return s.getIdStock();
	}

	@Override
	public Long updateStock(Stock u) {
		stockRepository.save(u);
		return u.getIdStock();
	}

	@Override
	public Stock retrieveStock(Long id) {
		// TODO Auto-generated method stub
		return stockRepository.findById(id).get();
	}

}
