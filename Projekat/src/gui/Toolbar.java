package gui;

import javax.swing.JToolBar;

public class Toolbar extends JToolBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Toolbar(){
		super();
		
		add(MainFrame.getInstance().getActionManager().getSwitchWorkspaceAction());	
		add(MainFrame.getInstance().getActionManager().getSaveProjectAction());
		addSeparator();
		add(MainFrame.getInstance().getActionManager().getNewDiagramAction());
		add(MainFrame.getInstance().getActionManager().getNewProjectAction());
		addSeparator();
		
		add(MainFrame.getInstance().getActionManager().getNextWindowAction());
		add(MainFrame.getInstance().getActionManager().getPreviousWindowAction());
		addSeparator();
		
		add(MainFrame.getInstance().getActionManager().getTileHorizontallyAction());
		add(MainFrame.getInstance().getActionManager().getTileVerticallyAction());
		add(MainFrame.getInstance().getActionManager().getCascadeWindowsAction());
		addSeparator();
		
		add(MainFrame.getInstance().getActionManager().getOpenAbout());
		addSeparator();
		
		add(MainFrame.getInstance().getActionManager().getExitAction());
		
		setFloatable(false);
	}
	

}
