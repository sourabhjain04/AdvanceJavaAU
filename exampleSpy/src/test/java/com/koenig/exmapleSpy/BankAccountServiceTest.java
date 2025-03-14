package com.koenig.exmapleSpy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class BankAccountServiceTest {

	@Spy
	private BankAccountService spyBankService = new BankAccountService();
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		
	}
	
	@Test
	void testWithdrawWithRealBalance() {
		// calls real method , so withdrawal should succeed
		boolean result = spyBankService.withdraw(500);
		
		assertTrue(result);
	}
	
	@Test
	void testWithdrawWithFackBalance() {
		// Override getbalance() to always return 200$ (modifying a step)
		
		doReturn(200.0).when(spyBankService).getBalance();
		
		
		boolean result = spyBankService.withdraw(500);
		
		
		assertFalse(result); // should fail due to modified balance
		
		verify(spyBankService).getBalance();
	}
}
