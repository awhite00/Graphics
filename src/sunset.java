import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class sunset extends Canvas 
	{

		public static void main(String[] args)
			{
				sunset canvas = new sunset();
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
			 graphics.setColor(Color.GRAY);
		     graphics.fillRect(0, 250, 500, 300);
		     graphics.setColor(Color.cyan);
		     graphics.fillRect(0,0, 1000, 250);
		   
		     for (int i = 0; i < 300; i++) 
		    	 {
				        graphics.setColor(Color.yellow);
				        graphics.fillOval(200, i, 50, 50);
				        
				        delay();
				        
				        graphics.setColor(Color.cyan);
				        graphics.fillOval(200, i, 50, 50);
				       if ()
			        	}
		}
		private void delay()
			{
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

	}
