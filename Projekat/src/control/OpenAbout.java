package control;

import gui.About;

import gui.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;



public class OpenAbout extends AbstractGAction {
	
	public OpenAbout() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_A, ActionEvent.ALT_MASK));
		putValue(SMALL_ICON, loadIcon("../images/about.png"));
		putValue(NAME, "About");
		putValue(SHORT_DESCRIPTION, "About");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		About about = new About(MainFrame.getInstance());
		about.setVisible(true);
		
	}

}
