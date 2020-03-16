package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class PreviousWindowAction  extends AbstractGAction {

	public PreviousWindowAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
        KeyEvent.VK_Y, ActionEvent.ALT_MASK));
		putValue(SMALL_ICON, loadIcon("../images/dynamic_blue_left.png"));
		putValue(NAME, "Previous Window");
		putValue(SHORT_DESCRIPTION, "Previous Window");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}