package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainMenu extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainMenu(){
		
		super();
		
		JMenu menuFile = new JMenu("File");
		menuFile.setMnemonic('F');
		
		JMenu menuEdit = new JMenu("Edit");
		menuEdit.setMnemonic('E');
		
		JMenu menuWindow = new JMenu("Window");
		menuWindow.setMnemonic('W');
		
		JMenu menuTools = new JMenu("Tools");
		menuTools.setMnemonic('T');
		
		JMenu menuHelp = new JMenu("Help");
		menuHelp.setMnemonic('H');
		
		this.add(menuFile);
		this.add(menuEdit);
		this.add(menuWindow);
		this.add(menuTools);
		this.add(menuHelp);
		
		menuFile.add(MainFrame.getInstance().getActionManager().getSwitchWorkspaceAction());
		menuFile.addSeparator();
		menuFile.add(MainFrame.getInstance().getActionManager().getSaveProjectAction());
		menuFile.add(MainFrame.getInstance().getActionManager().getNewProjectAction());
		menuFile.add(MainFrame.getInstance().getActionManager().getNewDiagramAction());
		menuFile.addSeparator();
		menuFile.add(MainFrame.getInstance().getActionManager().getExitAction());
		
		menuWindow.add(MainFrame.getInstance().getActionManager().getNextWindowAction());
		menuWindow.add(MainFrame.getInstance().getActionManager().getPreviousWindowAction());
		menuWindow.addSeparator();
		menuWindow.add(MainFrame.getInstance().getActionManager().getCascadeWindowsAction());
		menuWindow.add(MainFrame.getInstance().getActionManager().getTileHorizontallyAction());
		menuWindow.add(MainFrame.getInstance().getActionManager().getTileVerticallyAction());
		
		
		menuHelp.add(MainFrame.getInstance().getActionManager().getOpenAbout());
		
	}
	
}
