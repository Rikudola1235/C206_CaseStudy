
public class UserAccount {
	private int id;
	private String username;
	private String password;
	private String type;
	
	public UserAccount(int id, String username,String password, String type) {
		//super(assetTag, description);
		this.id = id;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public int userid() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}
}
