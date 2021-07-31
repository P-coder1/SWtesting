package swtest.tdd.lect13;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
public class CartTest {



	@Test
	public void testCart() {
		Cart ct = new Cart();
		ct.put("1234");
		ct.put("1234");
		ct.put("3456");
		ct.put("3456");
		ct.put("3456");
		ct.put("7891");
		int totalNum1 = ct.getTotalNumberOfItemsInCart("1234");
		assertEquals(2, totalNum1);
		int totalNum2 = ct.getTotalNumberOfItemsInCart("3456");
		assertEquals(3, totalNum2);
		int totalNum3 = ct.getTotalNumberOfItemsInCart("7891");
		assertEquals(1, totalNum3);
	}
	
	@Test
	public void testTotalPrice() {
		Cart ct = new Cart();
		ct.put("1234");		
		/*
		int totalPrice = ct.totalPrice();
		assertEquals(1000,totalPrice);
		
		ct.put("7891");
		totalPrice = ct.totalPrice();
		assertEquals(1800,totalPrice);
		*/
	}
	//2. Annotation 사용
	@Mock
	PriceManager pm;
	
	@Test
	public void testTotalPriceWithMock() {
		Cart ct = new Cart();
		//1. mock 메서드 활용하여 PriceManager 객체 주입
		//PriceManager pm = mock(PriceManager.class);
		MockitoAnnotations.initMocks(this);
		
		when(pm.getPrice("1234")).thenReturn(1000);
		when(pm.getPrice("7891")).thenReturn(800);
		ct.setPriceManager(pm);
		
		ct.put("1234");		
		int totalPrice = ct.totalPrice();
		assertEquals(1000,totalPrice);
		
		ct.put("7891");
		totalPrice = ct.totalPrice();
		assertEquals(1800,totalPrice);
	}
	
	@Test
	public void testTotalPriceOnePlusOneWithMock(){
		Cart ct = new Cart();
		//1. mock 메서드 활용하여 PriceManager 객체 주입
		//PriceManager pm = mock(PriceManager.class);
		MockitoAnnotations.initMocks(this);
		
		when(pm.getPrice("1234")).thenReturn(1000);
		when(pm.getPrice("3456")).thenReturn(2500);
		when(pm.getPrice("7891")).thenReturn(800);		
		when(pm.isOnePlusOneApplicable("1234")).thenReturn(false);
		when(pm.isOnePlusOneApplicable("3456")).thenReturn(true);
		when(pm.isOnePlusOneApplicable("7891")).thenReturn(false);		
		ct.setPriceManager(pm);
		
		ct.put("1234");		
		int totalPrice = ct.totalPrice();
		assertEquals(1000,totalPrice);
		
		ct.put("7891");
		totalPrice = ct.totalPrice();
		assertEquals(1800,totalPrice);
		// 1 + 1 행사가격 반영
		ct.put("3456");
		ct.put("3456");
		totalPrice = ct.totalPrice();
		assertEquals(4300,totalPrice);
	}
}
