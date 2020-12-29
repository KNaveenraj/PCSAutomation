package model;

public class Employee {
	private int EmployeeId;
	private String FirstName;
	private String LastName;
	private String UserId;
	private String Password;
	private String Gender;
	private String Role;
	private String Active;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, String userId, String password,String gender,String role) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.UserId = userId;
		this.Password = password;
		this.Gender = gender;
		this.Role = role;
		
		
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String s4) {
		Password = s4;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getActive() {
		return Active;
	}

	public void setActive(String active) {
		Active = active;
	}

	@Override
	public String toString() {
		return "EmployeeId=" + EmployeeId + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", UserId=" + UserId + ", Password=" + Password + ", Gender=" + Gender + ", Role=" + Role
				+ ", Status=" + Active + "";
	}

	
}
