/**
 * The TopToolBar implements the toolbar on the top of the program window,
 * allowing the user to undo changes and resize the grid, among other things.
 * 
 * @author Calvin Yan
 */

package src;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class TopToolBar extends JToolBar {
	
	private JButton undoButton = new JButton();

	public TopToolBar() {
		setPreferredSize(new Dimension(800, 50));
	}
	
}
