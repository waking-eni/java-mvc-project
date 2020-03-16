package gui;

import gui.MainFrame;

import java.awt.Dimension;

import javax.swing.DefaultDesktopManager;
import javax.swing.JDesktopPane;

public class DesktopPane extends JDesktopPane {

	public DesktopPane() {
		super();

		setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);

		
		setDesktopManager(new DefaultDesktopManager());

		setMinimumSize(new Dimension((int) MainFrame.getInstance().getSize()
				.getWidth() - 350, 1));
	}

	public void updateMinimumSize() {
		setMinimumSize(new Dimension((int) MainFrame.getInstance().getSize()
				.getWidth() - 350, 1));
	}

}