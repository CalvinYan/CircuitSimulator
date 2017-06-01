/**
 * The Application class handles the program's GUI and is run on startup.
 * When constructed it initializes all visual components and configures the
 * application window using the initWindow() method.
 * 
 * @author Calvin Yan
 */

package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Application extends JFrame {
	
	// The screen displaying the simulated circuit
	private JPanel circuitBoard = new JPanel();
	
	// The collapsable menu containing wiring components
	private JButton bottomMenu = new JButton("Placeholder for bottom menu");
	
	/*
	 * The bar at the top containing various editing functionalities.
	 * See TopToolBar.java for more.
	 */
	private JToolBar toolbar = new JToolBar();

	public static void main(String[] args) {
		new Application().initWindow();
	}
	
	private void initWindow() {
		// The toolbar and menu start with an absolute size
		this.setPreferredSize(new Dimension(800, 800));
		toolbar.setPreferredSize(new Dimension(800, 50));
		bottomMenu.setPreferredSize(new Dimension(800, 20));
		
		circuitBoard = new JPanel();
		circuitBoard.setBackground(Color.WHITE);
		
		// Add components to the window
		getContentPane().add(toolbar, BorderLayout.PAGE_START);
		getContentPane().add(bottomMenu, BorderLayout.PAGE_END);
		getContentPane().add(circuitBoard, BorderLayout.CENTER);
		
		// Display the window
		this.pack();
		this.setVisible(true);
	}
	
	

}
