package swtest.tdd.lect13;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class ExIndirectOutputTest {
	@Mock
	Doc b;
	@InjectMocks //간접주입
	ExIndirectOut a;
	@Test
	public void testExMethod() {
		MockitoAnnotations.initMocks(this);
		//ExIndirectOut a = new ExIndirectOut();
		a.doIt("Hello");
		verify(b, times(1)).say("Hello World");
		
	}
}
