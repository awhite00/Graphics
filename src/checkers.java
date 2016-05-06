import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class checkers extends Canvas 
	{

		public static void main(String[] args)
			{
				 checkers canvas = new checkers();
			        JFrame frame = new JFrame();
			        frame.setSize(600, 600);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.GRAY);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);

			}
		public void paint(Graphics graphics) 
		{
			 graphics.setColor(Color.black);
		      graphics.fillRect(0, 0, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(0, 20, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(0, 40, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(0, 60, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(0, 80, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(0, 100, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(0, 120, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(0, 140, 20, 20);
		      
		      graphics.setColor(Color.white);
		      graphics.fillRect(20, 0, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(20, 20, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(20, 40, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(20, 60, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(20, 80, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(20, 100, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(20, 120, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(20, 140, 20, 20);
		      
		      graphics.setColor(Color.black);
		      graphics.fillRect(40, 0, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(40, 20, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(40, 40, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(40, 60, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(40, 80, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(40, 100, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(40, 120, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(40, 140, 20, 20);
		      
		      graphics.setColor(Color.white);
		      graphics.fillRect(60, 0, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(60, 20, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(60, 40, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(60, 60, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(60, 80, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(60, 100, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(60, 120, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(60, 140, 20, 20);
		      
		      graphics.setColor(Color.black);
		      graphics.fillRect(80, 0, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(80, 20, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(80, 40, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(80, 60, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(80, 80, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(80, 100, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(80, 120, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(80, 140, 20, 20);
		      
		      graphics.setColor(Color.white);
		      graphics.fillRect(100, 0, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(100, 20, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(100, 40, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(100, 60, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(100, 80, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(100, 100, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(100, 120, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(100, 140, 20, 20);
		      
		      graphics.setColor(Color.black);
		      graphics.fillRect(120, 0, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(120, 20, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(120, 40, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(120, 60, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(120, 80, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(120, 100, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(120, 120, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(120, 140, 20, 20);
		      
		      graphics.setColor(Color.white);
		      graphics.fillRect(140, 0, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(140, 20, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(140, 40, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(140, 60, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(140, 80, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(140, 100, 20, 20);
		      graphics.setColor(Color.white);
		      graphics.fillRect(140, 120, 20, 20);
		      graphics.setColor(Color.black);
		      graphics.fillRect(140, 140, 20, 20);
		      
		      
		}

	}
