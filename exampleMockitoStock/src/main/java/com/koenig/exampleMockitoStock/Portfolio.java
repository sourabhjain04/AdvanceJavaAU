package com.koenig.exampleMockitoStock;

import java.util.List;

public class Portfolio {
	
	private StockService stockService;
	
	private List<Stock> stocks;
	
	public StockService getStockService() {
		return stockService;
		
	}
	
	public void setStockService(StockService stockService) {
		this.stockService=stockService;
		
	}

	
	public List<Stock> getStocks(){
		return stocks;
	}
	
	
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	public double getMarketValue() {
		double marketvalue =0.0;
		for (Stock stock:stocks) {
			marketvalue += stockService.getPrice(stock) * stock.getQuantity();
		}
		return marketvalue;
	}
}
