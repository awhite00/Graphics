import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class pinksquare extends Canvas
	{

		public static void main(String[] args)
			{
				     pinksquare canvas = new pinksquare();
			        JFrame frame = new JFrame();
			        frame.setSize(500, 400);
			        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        frame.getContentPane().add(canvas).setBackground(Color.white);
			        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
			        frame.setResizable(false);
			        frame.setVisible(true);

			}
		public void paint(Graphics graphics) 
		{
			 while (true)
			    	{
			    for (int j = 0; j < 400; j++)
		        	{
		        		
			        graphics.setColor(Color.magenta);
			        graphics.fillRect(j, 0, 20, 20);
			      
			       
			        
			        
			        delay();
			      
			        graphics.setColor(Color.white);
			        graphics.fillRect(j, 0, 20, 20);
		        	}
			        
		}

	}
		private void delay()
			{
				 try
 					{
 					Thread.sleep(50);
 					} catch (InterruptedException e)
 					{
 					e.printStackTrace();
 					}
				
			}
	}
