package view;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controller.EmployeeController;

public class UpdateProfile extends JFrame{
	Container container;
	JLabel lEmpid,lRole,lPassword;
	JTextField tEmpid,tRole,tPassword;
	JButton bSubmit;
	EmployeeController empController=null;
	JFrame f;
	public UpdateProfile() throws ClassNotFoundException, SQLException {
		container=getContentPane();
		empController=new EmployeeController();
		
		lEmpid=new JLabel("Employee Id");
		lRole=new JLabel("Role");
		lPassword=new JLabel("Password");
		
		tEmpid=new JTextField();
		tRole=new JTextField();
		tPassword=new JTextField();
		
		bSubmit=new JButton("SUBMIT");
		//Event handling for Register button
		bSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1,s2;
				
				int id;
				s1=tRole.getText();
				s2=tPassword.getText();
				id=Integer.parseInt(tEmpid.getText());
				empController.updateEmployee(s1, s2, id);
				f=new JFrame();
				JOptionPane.showMessageDialog(f,"Profile Updated");
			}
			
		});
		
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		this.setTitle("Update Profile");
		this.setVisible(true);
		this.setBounds(10,10,500,300);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}


	private void setLayoutManager() {
		container.setLayout(null);
		
	}


	public void setLocationAndSize() {
		
		lEmpid.setBounds(30, 50, 100, 30);
		lRole.setBounds(30, 100, 100, 30);
		lPassword.setBounds(30, 150, 100, 30);
		
		tEmpid.setBounds(250, 50, 150, 30);
		tRole.setBounds(250,100,150,30);
		tPassword.setBounds(250, 150, 150, 30);
		
		bSubmit.setBounds(150, 200, 150, 30);
	}
	
	public void addComponentsToContainer() {
		
		container.add(bSubmit);
		container.add(lEmpid);
		container.add(tEmpid);
		container.add(lRole);
		container.add(tRole);
		container.add(lPassword);
		container.add(tPassword);
		
		
		
	}
}
	


