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
		assertEquals(1, result.ballotsTypeCount());
		assertEquals(1, result.ballots(10));
	}
	
	@Test
	public void withdraw30bucks() throws InvalidAmountException {
		Withdraw result = atm.withdraw(30d);
		assertEquals(2, result.ballotsTypeCount());
		assertEquals(1, result.ballots(10));
		assertEquals(1, result.ballots(20));
	}
	
	@Test
	public void shouldWithdraw70bucks() throws InvalidAmountException {
		Withdraw result = atm.withdraw(70d);
		assertEquals(1,result.ballots(50));
		assertEquals(1,result.ballots(20));
	}
	
	@Test
	public void shouldWithdraw90bucks()throws InvalidAmountException {
		Withdraw result = atm.withdraw(90d);
		assertEquals(1,result.ballots(50));
		assertEquals(2,result.ballots(20));	
	}
	
	/**
	 */
	@Test
	public void shouldWithdraw650bucks()throws InvalidAmountException {
		Withdraw result = atm.withdraw(650d);
		assertEquals(6,result.ballots(100));
		assertEquals(1,result.ballots(50));	
	}
}
