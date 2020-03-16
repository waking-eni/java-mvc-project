package gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class StatusBar extends JPanel {

	GridLayout gridLayout = new GridLayout(1,5);
	
	private JLabel label1=new JLabel("Label1");
	private JLabel label2=new JLabel("Label2");
	private JLabel label3=new JLabel("Label3");
	private JLabel label4=new JLabel("Label4");
	private JLabel label5=new JLabel("Label5");
	
	
	public StatusBar() {
	
		this.setLayout(gridLayout);
		
		label1.setBorder(new BevelBorder(BevelBorder.LOWERED));
		label2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		label3.setBorder(new BevelBorder(BevelBorder.LOWERED));
		label4.setBorder(new BevelBorder(BevelBorder.LOWERED));
		label5.setBorder(new BevelBorder(BevelBorder.LOWERED));
		
		add(label1);
		add(label2);
		add(label3);
		add(label4);
		add(label5);
		
		
		
		
	}

}

