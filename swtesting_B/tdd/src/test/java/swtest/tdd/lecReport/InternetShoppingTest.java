package swtest.tdd.lecReport;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
public class InternetShoppingTest {

	@Test
	public void testInternetShopping() {
		InternetShopping it = new InternetShopping();
		it.put("1001");
		it.put("1001");
		it.put("1002");
		it.put("1002");
		it.put("1002");
		it.put("1003");
		int totalNum1 = it.getTotalShoppingNumber("1001");
		assertEquals(2, totalNum1);
		int totalNum2 = it.getTotalShoppingNumber("1002");
		assertEquals(3, totalNum2);
		int totalNum3 = it.getTotalShoppingNumber("1003");
		assertEquals(1, totalNum3);
	}
	
	@Test
	public void testTotalCooperation() {
		InternetShopping ct = new InternetShopping();
		ct.put("1001");		
	}
	//2. Annotation 사용
	@Mock
	Cooperation cp;
	
	@Test
	public void testTotalCooperationWithMock() {
		InternetShopping ct = new InternetShopping();
		//1. mock 메서드 활용하여 Cooperation 객체 주입
		MockitoAnnotations.initMocks(this);
		
		when(cp.getCooperation("1001")).thenReturn(1000);
		when(cp.getCooperation("1003")).thenReturn(800);
		ct.setCooperation(cp);
		
		ct.put("1001");		
		int totalCooperation = ct.totalCooperation();
		assertEquals(1000,totalCooperation);
		
		ct.put("1003");
		totalCooperation = ct.totalCooperation();
		assertEquals(1800,totalCooperation);
	}
	
	@Test
	public void testTwoPlusOneMockito(){
		InternetShopping ct = new InternetShopping();
		//1. mock 메서드 활용하여 Cooperation 객체 주입
		MockitoAnnotations.initMocks(this);
		
		when(cp.getCooperation("1001")).thenReturn(1500);
		when(cp.getCooperation("1002")).thenReturn(3000);
		when(cp.getCooperation("1003")).thenReturn(500);		
		when(cp.isTwoPlusOne("1001")).thenReturn(false);
		when(cp.isTwoPlusOne("1002")).thenReturn(true);
		when(cp.isTwoPlusOne("1003")).thenReturn(false);		
		ct.setCooperation(cp);
		// 1개 1500원
		ct.put("1001");		
		int totalCooperation = ct.totalCooperation();
		assertEquals(1500,totalCooperation);
		// 1001=1500 + 1002=3000  하면 4500원이 된다.
		ct.put("1002");
		totalCooperation = ct.totalCooperation();
		assertEquals(4500,totalCooperation);
		// 3개여도 2 + 1 행사라서 가격은 6000원이 나옴
		ct.put("1003");
		ct.put("1003");
		ct.put("1003");
		totalCooperation = ct.totalCooperation();
		assertEquals(6000,totalCooperation);
	}
}
