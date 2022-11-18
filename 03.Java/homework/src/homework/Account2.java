package homework;
public class Account2 {

	private String acc ;
	private String name ;
	private int deposit ;
	
	  Account2(String acc, String name ,int deposit ) {
		this.setAcc(acc); 
		this.setName(name);
		this.setDeposit(deposit);
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
}

