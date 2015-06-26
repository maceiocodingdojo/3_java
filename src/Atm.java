
public class Atm {

	public Withdraw withdraw(Double amount) throws InvalidAmountException {
		if(amount == 10.0)
			return new Withdraw(10.0);
		throw new InvalidAmountException();
	}
}
