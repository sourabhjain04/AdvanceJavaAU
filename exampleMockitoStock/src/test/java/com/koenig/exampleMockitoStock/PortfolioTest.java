package com.koenig.exampleMockitoStock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class PortfolioTest {

	@Mock
	private StockService stockService;
	
	@InjectMocks
	private Portfolio portfolio;
	
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testGetMarketValue() {
		// Create Some mock stocks
		
		Stock stock1 = new Stock("1","AAPL",10);
		
		Stock stock2 = new Stock("2","GOOG",5);
		System.out.println("one");
		// set up the mock behavior
		
		when(stockService.getPrice(stock1)).thenReturn(150.0);
		
		when(stockService.getPrice(stock2)).thenReturn(2800.0);
		System.out.println("two");

		//Add Stocks to portfolio
		
		portfolio.setStocks(Arrays.asList(stock1, stock2));
		
		//Calculate Market Value
		
		double marketValue = portfolio.getMarketValue();
		
		assertEquals(15500.0, marketValue,0.01);
		// Verify
		
		verify(stockService).getPrice(stock1);
		verify(stockService).getPrice(stock2);
		
		System.out.println("three");

		
		
	}
}
