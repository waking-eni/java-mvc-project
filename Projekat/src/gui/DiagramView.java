package gui;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import model.DiagramTreeNode;

public class DiagramView extends JInternalFrame {

	public static int openFrameCount = 0;

	// služe nam za odreivanje pozicije unutranjeg prozora
	static final int xOffset = 30, yOffset = 30;

	private DiagramTreeNode diagram;
	// framework nam predstavlja radnu povrsinu za dijagram
	// ne moze direktno iscrtavanje
	private JPanel framework;

	public DiagramView() {

		super("", true, // resizable
				true, // closable
				true, // maximizable
				true);// iconifiable
		++openFrameCount;
		setLocation(xOffset * openFrameCount, yOffset * openFrameCount);
		setIconifiable(true);
		setClosable(true);

		setSize(400, 400);
		setVisible(true);

	}

	public void setDiagram(DiagramTreeNode diagram) {
		this.diagram = diagram;
		this.setName(diagram.getName());

		setTitle(diagram.getName());
	}

	public DiagramTreeNode getDiagram() {
		return diagram;
	}

}
