import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtmTest {
	Atm atm;
	
	@Before
	public void setup(){
	 atm = new Atm();
	}

	@Test(expected = InvalidAmountException.class)
	public void errorWhenWithdrawZero() throws InvalidAmountException {
		atm.withdraw(0.0);
	}
	
	@Test(expected = InvalidAmountException.class)
	public void errorWhenWithdrawByInvalidCell() throws InvalidAmountException{  
		atm.withdraw(123.0);
	}
	
	@Test
	public void withdraw10bucks() throws InvalidAmountException {
		Withdraw result = atm.withdraw(10.0);		
		assertEquals(1, result.ballotAmount());
		assertEquals(1, result.ballots(10));
	}
}
