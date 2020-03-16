package model;


import javax.swing.tree.DefaultTreeModel;

public class WorkspaceModel extends DefaultTreeModel {

	public WorkspaceModel() {
		super(new WorkspaceTreeNode());

	}

	public void addProject(ProjectTreeNode project) {
		((WorkspaceTreeNode)getRoot()).addProject(project);
	}

}
