package model;


import gui.DiagramView;

import gui.MainFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.JPanel;



public class Diagram extends JPanel {
	
	private String name;
	private DiagramTreeNode diagramTreeNode;
	Toolkit toolkit = Toolkit.getDefaultToolkit();  
	URL imageURL = getClass().getResource("../images/icon.png");
	Image image = toolkit.getImage(imageURL); 
	
	public Diagram(String name) {
		super();
		
		setLayout(new BorderLayout());
		this.setName(name);
		setVisible(true);
		
		DiagramView.openFrameCount++;
	}
	
	public Diagram() {
		super();
		this.setName("Diagram " + (DiagramView.openFrameCount+1) + "");
		
		
		
		setVisible(true);
		
		
		DiagramView.openFrameCount++;
		
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	

	public void setDiagramTreeNode(DiagramTreeNode diagramTreeNode) {
		this.diagramTreeNode = diagramTreeNode;
	}

	public DiagramTreeNode getDiagramTreeNode() {
		return diagramTreeNode;
	}
}