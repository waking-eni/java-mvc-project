package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import control.AbstractGAction;

public class DiagramToolAction extends AbstractGAction {
	public DiagramToolAction(){
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("../images/diagram.png"));
		putValue(NAME, "Diagram");
		putValue(SHORT_DESCRIPTION, "Diagram");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
