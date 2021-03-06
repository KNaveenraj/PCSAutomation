package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controller.SkillController;

public class AddSkillFrame extends JFrame{
	Container container;
	JLabel lSkillname,lSkilldescrip;
	JTextField tSkillname,tSkilldescrip;
	JButton bSubmit;
	SkillController skillController=null;
	JFrame f;
	public AddSkillFrame() throws ClassNotFoundException, SQLException {
		container=getContentPane();
		skillController=new SkillController();
		lSkillname=new JLabel("Skill Name");
		lSkilldescrip=new JLabel("Skill Description");
		tSkillname=new JTextField();
		tSkilldescrip=new JTextField();
		
		bSubmit=new JButton("SUBMIT");
		//Event handling for Register button
		bSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s1,s2;
				s1=tSkillname.getText();
				s2=tSkilldescrip.getText();
				skillController.addSkill(s1, s2);
				f=new JFrame();
				JOptionPane.showMessageDialog(f,"Skill Added");
			}
			
		});
		
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		this.setTitle("Add Skill");
		this.setVisible(true);
		this.setBounds(10,10,500,500);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}


	private void setLayoutManager() {
		container.setLayout(null);
		
	}


	public void setLocationAndSize() {
		lSkillname.setBounds(50, 100, 100, 30);
		lSkilldescrip.setBounds(50, 200, 100, 30);
		
		tSkillname.setBounds(200, 100, 150, 30);
		tSkilldescrip.setBounds(200, 200, 150, 30);
		
		bSubmit.setBounds(125, 300, 150, 30);
	}
	
	public void addComponentsToContainer() {
		container.add(lSkillname);
		container.add(tSkillname);
		container.add(tSkilldescrip);
		container.add(lSkilldescrip);
		container.add(bSubmit,BorderLayout.CENTER);
		
	}
}
	
