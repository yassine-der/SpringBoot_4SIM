package tn.esprit.tpspringboot.service;

import java.util.List;

import tn.esprit.tpspringboot.entity.Stock;

public interface StockService {

	public List<Stock> retrieveAllStocks();
	public Long addStock(Stock s);
	public Long updateStock(Stock u);
	public Stock retrieveStock(Long id);
}
