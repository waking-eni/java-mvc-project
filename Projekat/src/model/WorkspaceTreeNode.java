package model;



import java.io.File;

import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.tree.TreeNode;

import model.DiagramTreeNode;
import model.ProjectTreeNode;

public class WorkspaceTreeNode implements TreeNode {
	
	private String name = "Workspace";
	private ArrayList<ProjectTreeNode> projects = new ArrayList<ProjectTreeNode>();
	
	public WorkspaceTreeNode() {
		super();
	}
	
	public String toString(){
		return "Workspace";
	}
	
	public Enumeration<DiagramTreeNode> children() {
		return (Enumeration<DiagramTreeNode>) projects;
	}

	@Override
	public TreeNode getChildAt(int arg0) {
		return getProject(arg0);
	}

	@Override
	public int getChildCount() {
		return getProjectsCount();
	}

	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getIndex(TreeNode arg0) {
		return getProjectIndex((ProjectTreeNode) arg0);
	}

	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void addProject(ProjectTreeNode project){
		projects.add(project);
		project.setName("Project - Graficki editor "+projects.size());
	}
	
	public ProjectTreeNode getProject(int index) {
		return projects.get(index);
	}	
	
	public int getProjectIndex(ProjectTreeNode project) {
		return projects.indexOf(project);
	}
	public int getProjectsCount() {
		return projects.size();
	}

	
	

}
