package org.Arcana;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTesting {
	
	@Mock
	PaymentGateway paymentGatewayMock;
	
	@InjectMocks
	OrderService orderService;
	
	
	@Test
	@DisplayName("Test Order Confirmed")
	void testProcessPayment_Success() {
		when(paymentGatewayMock.processPayment(2000)).thenReturn(true);
		
		String res = orderService.placeOrder(2000);
		assertEquals(res, "Order Confirmed");
		
		verify(paymentGatewayMock).processPayment(2000);
	}
	
	@Test
	@DisplayName("Test Order Failed")
	void testProcessPayment_Fail() {
		when(paymentGatewayMock.processPayment(1500)).thenReturn(false);
		
		assertThrows(RuntimeException.class, ()->{
			orderService.placeOrder(1500);
		});
		
		verify(paymentGatewayMock).processPayment(1500);
	}
	
	@Test
	@DisplayName("Test Invalid Order Amount")
	void testInvalidOrderAmount() {
		
		assertThrows(IllegalArgumentException.class, () -> {
	        orderService.placeOrder(0);
	    });		
		
	}
}
