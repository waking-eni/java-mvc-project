package control;

import gui.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class TileHorizontallyAction extends AbstractGAction {

	public TileHorizontallyAction() {
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_H, ActionEvent.ALT_MASK));
		putValue(SMALL_ICON, loadIcon("../images/tile_horz.png"));
		putValue(NAME, "Tile Horizontally");
		putValue(SHORT_DESCRIPTION, "Tile Horizontally");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
int k = 0;
		
		if (MainFrame.getInstance().getDesktop().getAllFrames().length == 0)
			return;
		
		int rows = (int) Math.sqrt(MainFrame.getInstance().getDesktop().getAllFrames().length);
		int columns = (int) Math.ceil(MainFrame.getInstance().getDesktop().getAllFrames().length / Math.floor(Math.sqrt(MainFrame.getInstance().getDesktop().getAllFrames().length)));
		
		int x = (int) MainFrame.getInstance().getDesktop().getSize().getWidth() / rows;
		int y = (int) MainFrame.getInstance().getDesktop().getSize().getHeight() / columns;
		
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++) {
				if (k < MainFrame.getInstance().getDesktop().getAllFrames().length) {
					MainFrame.getInstance().getDesktop().getAllFrames()[k].setLocation(x * i, y * j);
					MainFrame.getInstance().getDesktop().getAllFrames()[k].setSize(x, y);
					k++;
				}
			}
		
	}
}
