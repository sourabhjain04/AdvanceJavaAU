package com.koenig.exampleMokito2;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BillingServiceTest {

	@Mock
	private PaymentGateway mockPaymentGateway;
	
	private BillingService billingService;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		billingService = new BillingService(mockPaymentGateway);
		
	}
	
	@Test
	void testSuccessfulPayment() {
		when(mockPaymentGateway.processPayment(100.0)).thenReturn(true);
		
		boolean result = billingService.chargeCustomer(100.0);
		
		assertTrue(result);
		
		verify(mockPaymentGateway).processPayment(100.0);
		
		
	}
	
}
