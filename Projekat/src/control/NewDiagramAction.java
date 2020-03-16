package control;

import gui.DiagramView;
import gui.MainFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import model.DiagramTreeNode;
import model.ProjectTreeNode;

public class NewDiagramAction extends AbstractGAction {
	
	private static final long serialVersionUID = -3005515364927967489L;

	public NewDiagramAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("../images/Files-New-File-icon.png"));
		putValue(NAME, "New Diagram");
		putValue(SHORT_DESCRIPTION, "New Diagram");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//
		Object p=MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
		if (p  instanceof ProjectTreeNode) {
			DiagramTreeNode d=new DiagramTreeNode("New diagram");
			((ProjectTreeNode)p).addDiagram(d);
			SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getWorkspaceTree());
			
			
	        DiagramView view=new DiagramView();
			view.setDiagram(d);
			MainFrame.getInstance().getDesktop().add(view);
			
			try {
				view.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		}
			if (p instanceof DiagramTreeNode) {
				DiagramTreeNode d = new DiagramTreeNode();
				((ProjectTreeNode) ((DiagramTreeNode)p).getParent()).addDiagram(d);
				SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getWorkspaceTree());
				
				DiagramView dv = new DiagramView();
				dv.setDiagram(d);
				MainFrame.getInstance().getDesktop().add(dv);
				
		
				try {
					dv.setSelected(true);
				} catch (PropertyVetoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
	}
}
	}