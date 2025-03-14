package com.koenig.exampleMokito2;



public class BillingService {

	private PaymentGateway paymentGateway;

	public BillingService(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	
	public boolean chargeCustomer(double amount) {
		return paymentGateway.processPayment(amount);
		
		
	}
}
