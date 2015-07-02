import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Withdraw {

	private Double amount;
	private List<BallotMoney> ballotsMoney;
	
	public Withdraw(Double amount) {
		this.ballotsMoney = new ArrayList<BallotMoney>();
		this.amount = amount;

		buildBallots();
	}
	
	public void buildBallots() {
		List<Integer> availableBallotTypes = Arrays.asList(100, 50, 20, 10);
		Double tempAmount = amount;
		for (Integer ballotType : availableBallotTypes) {
			if (tempAmount > 0 && tempAmount >= ballotType) {
				//get how many ballots of that type can be given
				Double q = Math.floor(tempAmount/ballotType);
				//get how much that ballot type can't cover
				tempAmount = tempAmount % ballotType;
				if (q > 0) {
					for (int i=1; i<=q; i++) {
						ballotsMoney.add(new BallotMoney(ballotType));
					}
				}
			}
		}
		if (tempAmount > 0)
			throw new InvalidAmountException();
	}
	
	public int ballotsTypeCount() {
		return ballotsMoney.size();
	}
	
	/**
	 * Returns the quantity of ballots with parameter value
	 * @param value
	 * @return count
	 */
	public int ballots(Integer value) {
		int count = 0;
		for (BallotMoney ballot : this.ballotsMoney) {
			if (ballot.ballot.equals(value.toString())) {
				count++;
			}
		}	
		return count;	
	}
}
