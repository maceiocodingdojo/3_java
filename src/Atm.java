
public class Atm {

	public Withdraw withdraw(Double amount) throws InvalidAmountException {
		if (amount > 0)
			return new Withdraw(amount);
		throw new InvalidAmountException();
	}
}
