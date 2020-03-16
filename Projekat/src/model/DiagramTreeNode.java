package model;



import java.util.Enumeration;


import javax.swing.tree.TreeNode;





public class DiagramTreeNode implements TreeNode {


	private String name = null;
	private Diagram diagram = new Diagram();
	private ProjectTreeNode parent;
	private String title;
	private DiagramModel model=new DiagramModel();
	
	
	
	public void setParent(ProjectTreeNode parent) {
		this.parent = parent;
	}
		
	public DiagramTreeNode() {
		setName(diagram.getName());
		diagram.setDiagramTreeNode(this);
	}
	
	public DiagramTreeNode(String diagramName) {
		diagram.setName(name);
		this.name = name;
		setTitle();
	}
	
	public DiagramModel getModel() {
		return model;
	}
	
	public String toString(){
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setModel(DiagramModel model) {
		this.model = model;
	}

	public TreeNode getChildAt(int arg0) {
		return null;
	}

	public int getChildCount() {
		return 0;
	}

	public TreeNode getParent() {
		return null;
	}

	public int getIndex(TreeNode arg0) {
		return -1;
	}

	public boolean getAllowsChildren() {
		return false;
	}

	public boolean isLeaf() {
		return true;
	}

	public Enumeration<? extends TreeNode> children() {
		return null;
	}
	
	public void setDiagram(Diagram diagram) {
		this.diagram = diagram;
	}

	public Diagram getDiagram() {
		return diagram;
	}
	
	public void setTitle() {
			this.title = name;

	}
	
	public String getTitle() {
		return title;
	}
	

}