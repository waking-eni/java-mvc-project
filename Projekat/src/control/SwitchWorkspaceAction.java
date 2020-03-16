package control;

import java.awt.event.ActionEvent;

import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class SwitchWorkspaceAction extends AbstractGAction {
	public SwitchWorkspaceAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("../images/Workstation-icon.png"));
		putValue(NAME, "Switch Workspace");
		putValue(SHORT_DESCRIPTION, "Switch Workspace");
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
