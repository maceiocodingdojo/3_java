import org.junit.Test;

import static org.junit.Assert.*;

public class AtmTest {

	@Test
	public void errorWhenWithdrawZero() {
		Atm atm = new Atm();
		String actual 	= atm.withdraw(0.0);
		String expected = "Invalid amount";		
		assertEquals(expected, actual);
	}
	
	@Test(expected = InvalidAmountException.class)
	public void erroWhenWithdrawByInvalidCell(){
		Atm atm = new Atm();
		atm.withdraw(123.0);
		
	}
}
