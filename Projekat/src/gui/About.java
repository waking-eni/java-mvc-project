package gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class About extends JDialog {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public About(Frame owner) {
		
	    super(owner, "About", true);
	    JLabel lbl = new JLabel();
		URL imageURL = getClass().getResource("../images/DSC_0557.jpg");
		ImageIcon img = new ImageIcon(imageURL);
		lbl.setIcon(img);
		
		JPanel p = new JPanel();
	    

	    p.add(lbl);
	    getContentPane().add(p, BorderLayout.CENTER);
	    
	    
	    JLabel ime = new JLabel("Todorovic Nevena");
	    JLabel indeks = new JLabel("RA170-2012");
	    JLabel email = new JLabel("trytocountelectricsheep@gmail.com");
	    
	    JPanel panel = new JPanel();
	    
	    panel.setLayout(new GridLayout(3,1));
	    
	    panel.add(ime);
	    panel.add(indeks);
	    panel.add(email);
	    
	    getContentPane().add(panel, BorderLayout.SOUTH);
	    
	    setSize(300, 300);
		setResizable(false);
		setLocationRelativeTo(owner);
	    
	    
}
}