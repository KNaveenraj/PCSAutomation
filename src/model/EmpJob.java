package model;

public class EmpJob {
	private int EJId;
	private int EmployeeId;
	private int JobId;
	private String Recurited;
	public EmpJob() {
		
	}
	
	
	public EmpJob(int eJId, int employeeId, int jobId, String recurited) {
		super();
		this.EJId = eJId;
		this.EmployeeId = employeeId;
		this.JobId = jobId;
		this.Recurited = recurited;
	}

	public int getEJId() {
		return EJId;
	}
	public void setEJId(int eJId) {
		EJId = eJId;
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int jobId) {
		JobId = jobId;
	}
	public String getRecurited() {
		return Recurited;
	}
	public void setRecurited(String recurited) {
		Recurited = recurited;
	}
	@Override
	public String toString() {
		return "EmpJob [EJId=" + EJId + ", EmployeeId=" + EmployeeId + ", JobId=" + JobId + ", Recurited=" + Recurited
				+ "]";
	}
	
}
