package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import control.AbstractGAction;

public class RectangleToolAction extends AbstractGAction {
	public RectangleToolAction() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("../images/rectangle.png"));
		putValue(NAME, "Rectangle");
		putValue(SHORT_DESCRIPTION, "Rectangle");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
