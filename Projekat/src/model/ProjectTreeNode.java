package model;



import java.util.ArrayList;

import java.util.Enumeration;

import javax.swing.tree.TreeNode;





public class ProjectTreeNode implements TreeNode {
	
	private ArrayList<DiagramTreeNode> diagrams = new ArrayList<DiagramTreeNode>();
	private String name;
	
	public ProjectTreeNode(){}
	
	public ProjectTreeNode(String projectName) {
		this.name=projectName;
	}
	
	public void addDiagram(DiagramTreeNode diagram){
		diagrams.add(diagram);
		diagram.setName(this.name + " Diagram "+String.valueOf(diagrams.size()));
	}
	
	public String toString(){
		return name;
	}	
	public DiagramTreeNode getDiagram(int index) {
		return diagrams.get(index);
	}
	
	public int getDiagramIndex(DiagramTreeNode diagram) {
		return diagrams.indexOf(diagram);
	}
	
	public int getDiagramCount() {
		return diagrams.size();
	}
	
	public void setDiagrams(ArrayList<DiagramTreeNode> diagrams) {
		this.diagrams = diagrams;
	}

	public ArrayList<DiagramTreeNode> getDiagrams() {
		return diagrams;
	}
	
	public String getName() {
		return name;
	}


	
	@Override
	public TreeNode getChildAt(int arg0) {
		return getDiagram(arg0);
		
	}

	@Override
	public int getChildCount() {
		return getDiagramCount();
	}

	@Override
	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getIndex(TreeNode arg0) {
		return getDiagramIndex((DiagramTreeNode)arg0);
	
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

	@Override
	public Enumeration<DiagramTreeNode> children() {
		return (Enumeration<DiagramTreeNode>) diagrams;

}

	public void setName(String name) {
		this.name=name;

	}
}