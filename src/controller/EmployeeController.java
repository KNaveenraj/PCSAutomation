package controller;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import dao.IEmployeeDao;
import daoImpl.EmployeeDaoImpl;
import model.Employee;

public class EmployeeController extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static IEmployeeDao empDao=null;
	public EmployeeController() throws ClassNotFoundException, SQLException{
		empDao=new EmployeeDaoImpl();
	}
	public Employee checkLogin(String userId,String password) {
		Employee emp=empDao.checkLogin(userId, password);
		return emp;
	}
	public Employee checkUser(String userId) {
		Employee emp=empDao.checkUser(userId);
		return emp;
	}
	
	public void addEmployee(String s1, String s2, String s3, String s4,String s5, String s6)  {
		Employee emp=new Employee();
		//BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter First Name:");
		emp.setFirstName(s1);
		//System.out.println("Enter Last Name:");
		emp.setLastName(s2);
		//System.out.println("Enter UserId:");
		emp.setUserId(s3);
		//System.out.println("Enter Password:");
		emp.setPassword(s4);
		//System.out.println("Enter Gender:");
		emp.setGender(s5);
		//System.out.println("Enter Role:");
		String role=s6;
		emp.setRole(s6);
		if (role.equals("HRA") || role.equals("EMP") || role.equals("PME")) {
			emp.setActive("Active");
		}
		else {
			emp.setActive("Deactive");
		}
		//Calling dao method for insert record
		empDao.addEmployee(emp);
	
}

	
	public ArrayList<Employee> getAllEmployees() {
		
		ArrayList<Employee> allEmpList=empDao.getAllEmployees();
		return allEmpList;
	
	}
	
	public Employee getEmployeeById(String EmployeeId) {
		int id;
		id=Integer.parseInt(EmployeeId);
		Employee emp=empDao.getEmployeeById(id);
			return emp;
		
	
	}
	public void updateEmployee(String s1,String s2,int id) {
	
		Employee emp=new Employee();
		emp.setRole(s1);
		emp.setPassword(s2);
		emp.setEmployeeId(id);
				empDao.updateEmployee(emp);
			
	}
	public void deactiveEmployee(int id) {
		
			/*BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter EmployeeId whose record you want to deactivate:");
			id=Integer.parseInt(reader.readLine());*/
			
			empDao.deactivateEmployee(id);
		
	}
	public void deleteEmployee() {
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			int id;
			System.out.println("Enter EmployeeId whose record you want to delete:");
			id=Integer.parseInt(reader.readLine());
			empDao.deleteEmployee(id);
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void activateEmployee(int id) {
		empDao.activateEmployee(id);
		
	}

	
	
}