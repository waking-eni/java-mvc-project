package gui;

import gui.MainFrame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JScrollPane;

public class TreeView extends JScrollPane {
	
	private static final long serialVersionUID = -2574140652007887933L;

	public TreeView () {
		super();
		setMinimumSize(new Dimension(150, (int) MainFrame.getInstance().getSize().getHeight()));
		setBackground(Color.GRAY);
		setForeground(Color.GRAY);
	}

	public TreeView(Component arg0) {
		super(arg0);
		setBackground(Color.GRAY);
		setForeground(Color.GRAY);
	}

	
}