/**
 * The TopToolBar implements the toolbar on the top of the program window,
 * allowing the user to undo changes and resize the grid, among other things.
 * 
 * @author Calvin Yan
 */

package src;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JToolBar;

public class TopToolBar extends JToolBar {
	
	/*
	 * Buttons in the tool bar implementing the following functions:
	 * - Undo/Redo
	 * - Resize grid
	 * - Clear circuitboard
	 * - Help menu
	 */
	
	private JButton undoButton = new JButton(new ImageIcon("assets/undo.png")),
					redoButton = new JButton(new ImageIcon("assets/redo.png")),
					resizeButton = new JButton(new ImageIcon("assets/resize.png")),
					clearButton = new JButton(new ImageIcon("assets/clear.png")),
					helpButton = new JButton(new ImageIcon("assets/help.png"));

	// Slider for zooming in and out of the board
	
	private JSlider zoomSlider = new JSlider(0, 200, 100);
	
	public TopToolBar() {
		setPreferredSize(new Dimension(800, 50));
		
		// Configure and add buttons to toolbar
		undoButton.setToolTipText("Undo previous action    Ctrl+Z");
		undoButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Undoing");
			}
		});
		add(undoButton);
		
		redoButton.setToolTipText("Redo previous action    Ctrl+Y");
		redoButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Redoing");
			}
		});
		add(redoButton);
		
		zoomSlider.setMajorTickSpacing(50);
		zoomSlider.setPaintLabels(true);
		zoomSlider.setPaintTicks(true);
		add(zoomSlider);
		
		resizeButton.setToolTipText("Resize the circuitboard");
		resizeButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Resizing");
			}
		});
		add(resizeButton);
		
		clearButton.setToolTipText("Clear the board");
		clearButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clearing");
			}
		});
		add(clearButton);
		
		helpButton.setToolTipText("Open help menu     Ctrl+H");
		helpButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("Opening help");
			}
		});
		add(helpButton);
	}
	
}
