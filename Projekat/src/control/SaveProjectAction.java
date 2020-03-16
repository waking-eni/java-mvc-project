package control;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class SaveProjectAction extends AbstractGAction {
	public SaveProjectAction() {

		putValue(ACCELERATOR_KEY,
		KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("../images/save.png"));
		putValue(NAME, "Save Project");
		putValue(SHORT_DESCRIPTION, "Save Project");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}