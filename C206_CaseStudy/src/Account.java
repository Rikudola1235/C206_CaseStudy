/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20047095, 11 Aug 2021 11:06:47 pm
 */

/**
 * @author 20047095
 *
 */
public class Account {
	private String role;
	private String username;
	private String password;
	private int studentId;
	private int contactNumber;
	public Account(String role, String username, String password, int studentId, int contactNumber) {
		this.role = role;
		this.username = username;
		this.password = password;
		this.studentId = studentId;
		this.contactNumber = contactNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
