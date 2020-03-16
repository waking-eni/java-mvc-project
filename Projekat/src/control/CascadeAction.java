package control;

import gui.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

public class CascadeAction extends AbstractGAction {

	public CascadeAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_C, ActionEvent.ALT_MASK));
		putValue(SMALL_ICON, loadIcon("../images/Applications-Cascade-icon.png"));
		putValue(NAME, "Cascade");
		putValue(SHORT_DESCRIPTION, "Cascade");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {

		
if (MainFrame.getInstance().getDesktop().getAllFrames().length == 0)
	return;

int i;
JInternalFrame[] pom = new JInternalFrame[MainFrame.getInstance().getDesktop().getAllFrames().length];

for (i = 0; i < pom.length; i++) {
	pom[i] = MainFrame.getInstance().getDesktop().getAllFrames()[i];
}

for (i = pom.length - 1; i >= 0; i--) {
	pom[i].setLocation((pom.length - i - 1) * 30, (pom.length - i - 1) * 30);
	pom[i].setSize((int) MainFrame.getInstance().getDesktop().getSize().getWidth(), 400);

	try {
		pom[i].setSelected(true);
	} catch (PropertyVetoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
	}

}