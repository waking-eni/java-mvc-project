package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import control.AbstractGAction;
import gui.MainFrame;

public class CircleToolAction extends AbstractGAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CircleToolAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_A, ActionEvent.ALT_MASK));
		putValue(SMALL_ICON, loadIcon("../images/circle-icon.png"));
		putValue(NAME, "Circle");
		putValue(SHORT_DESCRIPTION, "Circle");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}