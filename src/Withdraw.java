import java.util.ArrayList;
import java.util.List;


public class Withdraw {

	private Double amount;
	private List<BallotMoney> ballotsMoney;
	
	public Withdraw(Double amount) {
		this.ballotsMoney = new ArrayList<BallotMoney>();
		this.ballotsMoney.add(new BallotMoney());
		this.amount = amount;
	}
	
	public List<BallotMoney> ballotsMoney() {
		ballotsMoney.add(new BallotMoney());
		return ballotsMoney;
	}
	
	public int ballotsTypeCount() {
		return ballotsMoney.size();
	}
	
	public int ballots(int value) {
		return 1;
	}

}
