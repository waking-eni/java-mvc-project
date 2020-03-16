package control;

import gui.DiagramView;
import gui.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.KeyStroke;


import model.DiagramTreeNode;

import model.ProjectTreeNode;


public class NewProjectAction extends AbstractGAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewProjectAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.ALT_MASK));
		putValue(SMALL_ICON, loadIcon("../images/Blue-New-icon.png"));
		putValue(NAME, "New project");
		putValue(SHORT_DESCRIPTION, "New project");
		}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		ProjectTreeNode p=new ProjectTreeNode(" ");
		MainFrame.getInstance().getWorkspaceTree().addProject(p);
		DiagramTreeNode d=new DiagramTreeNode(" ");
		p.addDiagram(d);
		
		
		
		DiagramView view=new DiagramView();
		view.setDiagram(d);
		MainFrame.getInstance().getDesktop().add(view);
	
		try {
			view.setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
		
		
		
	}
	