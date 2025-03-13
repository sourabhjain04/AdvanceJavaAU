package com.koenig.mavenExample;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

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
        // Create some mock stocks
        Stock stock1 = new Stock("1", "AAPL", 10);
        Stock stock2 = new Stock("2", "GOOG", 5);
        
        // Set up the mock behavior
        when(stockService.getPrice(stock1)).thenReturn(150.0);
        when(stockService.getPrice(stock2)).thenReturn(2800.0);
        
        // Add stocks to portfolio
        portfolio.setStocks(Arrays.asList(stock1, stock2));
        
        // Calculate market value
        double marketValue = portfolio.getMarketValue();
        
        // Expected market value: (10 * 150) + (5 * 2800) = 1500 + 14000 = 15500
        assertEquals(15500.0, marketValue, 0.01);
        
        // Verify that stockService.getPrice() was called for each stock
        verify(stockService).getPrice(stock1);
        verify(stockService).getPrice(stock2);
    }
}
