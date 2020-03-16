package gui;

import control.ActionManager;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.WorkspaceModel;

public class MainFrame extends JFrame { 
	
	private static final long serialVersionUID = 1L;
	// singleton
	private static MainFrame instance = null;
	
	private JDesktopPane desktop = null;
	private WorkspaceModel workspaceModel;
	private WorkspaceTree workspaceTree;
	
	
	
	
	private ActionManager actionManager = new ActionManager();

	private MainFrame() {

	}

	

	

	public void initialise() {
		
		initialiseWorkspaceTree();
		
		ImageIcon icon = new ImageIcon("images/0002_Tree.png");
		this.setIconImage(icon.getImage());
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth-50, screenHeight-50);
        setTitle("Projekat");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        MainMenu menu = new MainMenu();
		setJMenuBar(menu);
		
		Toolbar toolbar = new Toolbar();
		add(toolbar, BorderLayout.NORTH);
		
        Toolbox toolbox = new Toolbox();
        add(toolbox, BorderLayout.EAST);
        
        StatusBar statusBar = new StatusBar();
        add(statusBar, BorderLayout.SOUTH);
        
       
        desktop= new JDesktopPane();
        JScrollPane scroll=new JScrollPane(workspaceTree);
        scroll.setMinimumSize(new Dimension(150,150));
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scroll, desktop);
        splitPane.setDividerLocation(170);
        splitPane.setOneTouchExpandable(true);
		add(splitPane, BorderLayout.CENTER);
        
//		 try {
//	            // Set cross-platform Java L&F (also called "Metal")
//	        UIManager.setLookAndFeel(
//	            UIManager.getCrossPlatformLookAndFeelClassName());
//	    } 
//	    catch (UnsupportedLookAndFeelException e) {
//	       // handle exception
//	    }
//	    catch (ClassNotFoundException e) {
//	       // handle exception
//	    }
//	    catch (InstantiationException e) {
//	       // handle exception
//	    }
//	    catch (IllegalAccessException e) {
//	       // handle exception
//	    }
//        
        
        
	}
	
	private void initialiseWorkspaceTree(){
		workspaceTree=new WorkspaceTree();
		
		workspaceModel = new WorkspaceModel();
		
		workspaceTree.setModel(workspaceModel);
		ToolTipManager.sharedInstance().registerComponent(workspaceTree);

	}
	public ActionManager getActionManager(){
		return actionManager;
	}
	
	
	
	
	public static MainFrame getInstance(){
		if (instance==null){
			instance=new MainFrame();
			instance.initialise();
		}
		return instance;
	}


	public JDesktopPane getDesktop() {
		return desktop;
	}


	public WorkspaceTree getWorkspaceTree() {
		return workspaceTree;
	}


	public WorkspaceModel getWorkspaceModel() {
		return workspaceModel;
	}

	
//  
//
//
//	
//
//	@Override
//	public void windowOpened(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
}