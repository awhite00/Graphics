import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class graphicschallenges extends Canvas
	{

		public static void main(String[] args)
			{
			
				 graphicschallenges canvas = new graphicschallenges();
			        JFrame frame = new JFrame();
			        frame.setSize(1000, 1000);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);
			}
		public void paint(Graphics graphics)
		{
			graphics.setColor(Color.black);
	        graphics.drawLine(0, 0, 1000, 1000);
	        graphics.drawLine(1000, 0, 0, 1000);
	        graphics.setColor(Color.black);
	        graphics.drawRect(0, 0,800, 100);
	        graphics.setColor(Color.yellow);
	        graphics.fillRect(0, 900, 100, 100);
	        graphics.setColor(Color.blue);
	        graphics.drawRect(0, 900, 100, 100);
	        graphics.setColor(Color.yellow);
	        graphics.fillOval(200,200, 500, 500);
	        graphics.setColor(Color.magenta);
	        graphics.fillRect(300, 350, 50, 50);
	        graphics.setColor(Color.magenta);
	        graphics.fillRect(550, 350, 50, 50);
	        graphics.setColor(Color.blue);
	        graphics.fillOval(350,500, 200, 100);
		}
		

	}
