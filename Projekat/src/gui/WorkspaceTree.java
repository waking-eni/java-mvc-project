package gui;


import javax.swing.JTree;

import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeCellRenderer;
import model.ProjectTreeNode;
import model.WorkspaceModel;
import control.WorkspaceTreeControl;

public class WorkspaceTree extends JTree {
public WorkspaceTree() {
		
		addTreeSelectionListener(new WorkspaceTreeControl());
	    setCellEditor(new WorkspaceTreeEditor(this,new DefaultTreeCellRenderer()));
	    setCellRenderer(new WorkspaceTreeCellRendered());
	    setEditable(true);
	}

	
	
	public void addProject(ProjectTreeNode project){
		((WorkspaceModel)getModel()).addProject(project);
		SwingUtilities.updateComponentTreeUI(this);
	}


	
}
