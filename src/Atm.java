
public class Atm {

	public Withdraw withdraw(Double amount) throws InvalidAmountException {
//		if (amount == 10.0 || amount == 20d)
			return new Withdraw(amount);
		
//		throw new InvalidAmountException();
	}
}
