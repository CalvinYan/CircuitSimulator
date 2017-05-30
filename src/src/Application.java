package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class Application extends JFrame {
	
	private JPanel circuitBoard = new JPanel();
	private JButton bottomMenu = new JButton("Placeholder for bottom menu");
	private JToolBar toolbar = new JToolBar();

	public static void main(String[] args) {
		new Application().initWindow();
	}
	
	private void initWindow() {
		this.setPreferredSize(new Dimension(800, 800));
		toolbar.setPreferredSize(new Dimension(800, 50));
		bottomMenu.setPreferredSize(new Dimension(800, 20));
		getContentPane().add(toolbar, BorderLayout.PAGE_START);
		getContentPane().add(bottomMenu, BorderLayout.PAGE_END);
		circuitBoard = new JPanel();
		circuitBoard.setBackground(Color.WHITE);
		
		getContentPane().add(circuitBoard, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	
	

}
