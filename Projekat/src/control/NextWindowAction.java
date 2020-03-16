package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class NextWindowAction extends AbstractGAction {

	public NextWindowAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_U, ActionEvent.ALT_MASK));
		putValue(SMALL_ICON, loadIcon("../images/dynamic_blue_right.png"));
		putValue(NAME, "Next Window");
		putValue(SHORT_DESCRIPTION, "Next Window");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
