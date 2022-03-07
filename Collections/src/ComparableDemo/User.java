package ComparableDemo;

public class User implements Comparable<User> {
	private String username;
	private String bankname;
	
	public User(){
	}

	public User(String username, String bankname) {
		super();
		this.username = username;
		this.bankname = bankname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	//fill the code here
	@Override
	public String toString() {
		return username + " " + bankname; 
	}
	
	@Override
	public int hashCode() {
		return username.hashCode() + bankname.hashCode();
	}
	
	@Override
	public int compareTo(User u) {
		return hashCode() - u.hashCode();
		// 0 means equal
		// > 0 means comes after
		// < 0 means come before
	}
}

