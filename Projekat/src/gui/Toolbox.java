package gui;

import gui.MainFrame;



import javax.swing.BoxLayout;
import javax.swing.JToolBar;

public class Toolbox extends JToolBar {
	
	public Toolbox() {
		super(JToolBar.VERTICAL);
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(MainFrame.getInstance().getActionManager().getCircleToolAction());
		addSeparator();
		add(MainFrame.getInstance().getActionManager().getRectangleToolAction());
		addSeparator();
		add(MainFrame.getInstance().getActionManager().getDiagramToolAction());
		addSeparator();
		
		
	}
	
	
}