//  Program file: DrawingBoard
//
//  Class description: DrawBoard is a supplementary class that allows the tiles to be drawn.
//                     It extends JPanel and overwrites the methods paint() and clear();

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

	
	// Global variables
	
	// Dictate dimensions
	private static int x = 6;
	private static int y = 28;
	private int width;
	private int height;
	
	// Components of DrawingBoard
	private Image image;
	private Graphics2D canvas;
	private JFrame frame;
	
	
	// Constructor method
	// Sets the width, height and name of this particular panel
	public DrawingBoard(int _width, int _height, String name) {
		
		width = _width;
		height = _height;
		
		frame = new JFrame(name);
		
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		Container localContainer = frame.getContentPane();
		localContainer.setLayout(new BorderLayout());
		
		setBackground(Color.WHITE);
		localContainer.add(this);
		
		image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
		canvas = ((Graphics2D) image.getGraphics());
		canvas.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		canvas.setColor(Color.WHITE);
		canvas.fillRect(0, 0, width, height);
		frame.setSize(width + x, height + y);
		
	}
	
	
	// Returns "canvas"; allows users to upload/draw images onto the frame
	public Graphics2D getCanvas() {
		return canvas;
	}
	
	
	// Overrides the paint(Graphics g) method
	// paint(Graphics g) cannot be called since a Graphics object cannot be created
	// Is called as part of repaint()
	// Takes place of paintComponent(Graphics g), paintBorder(Graphics g) and paintChildren(Graphics g)
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, this);
	}
	

}