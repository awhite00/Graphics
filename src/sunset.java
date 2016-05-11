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
			graphics.setColor(new Color(139,90,43));
		     graphics.fillRect(50, 100, 40, 300);
		     graphics.setColor(new Color(102,205,0));
		     graphics.fillOval(50, 50, 50, 50);
			graphics.setColor(new Color(210,180,140));
		     graphics.fillRect(0, 250, 500, 300);
		     graphics.setColor(new Color(0,151,190));
		     graphics.fillRect(0,0, 1000, 250);
		     
		     
		   
		     for (int i = 50; i < 300; i++) 
		    	 {
		    		 graphics.setColor(new Color(139,90,43));//treebranch
				     graphics.fillRect(50, 100, 40, 300);
				     graphics.setColor(new Color(102,205,0));//treeleaves
				     graphics.fillOval(50, 50, 50, 50); 
				     
		    		 graphics.setColor(Color.yellow);//sun
				        graphics.fillOval(200, i, 50, 50);
				        graphics.setColor(new Color(210,180,140));//sand
				        graphics.fillRect(0,250,500,300);
				        
				        
				        delay();
				      
				        graphics.setColor(new Color(0,151,190));//sky
					     graphics.fillRect(0,0, 1000, 250);
				        
				    
					     graphics.setColor(new Color(139,90,43));//treebranch
				     graphics.fillRect(50, 100, 40, 300);
					     graphics.setColor(new Color(102,205,0));//treeleaves
				     graphics.fillOval(50, 50, 50, 50);
			        	}
		     for (int j =300; j >50; j--) 
		    	 {
		    		 graphics.setColor(new Color(139,90,43));//treebranch
				     graphics.fillRect(50, 100, 40, 300);
				     graphics.setColor(new Color(102,205,0));//treeleaves
				     graphics.fillOval(50, 50, 50, 50);   
		    		 graphics.setColor(Color.GRAY);//moon
				        graphics.fillOval(200, j, 50, 50);
				       
				        graphics.setColor(new Color(210,180,140));//sand
				        graphics.fillRect(0,250,500,300);
				        delay();
				      
				        graphics.setColor(new Color(210,180,140));//sand
				        graphics.fillRect(0,250,500,300);
				        graphics.setColor(new Color(0,151,190));//sky
					     graphics.fillRect(0,0, 1000, 250);
				        graphics.setColor(new Color(139,90,43));//treebranch
					     graphics.fillRect(50, 100, 40, 300);
						     graphics.setColor(new Color(102,205,0));//treeleaves
					     graphics.fillOval(50, 50, 50, 50);
				        
				         
		    	 }
		}
		private void delay()
			{
					{
		    	        try
		    					{
		    					Thread.sleep(60);
		    					} catch (InterruptedException e)
		    					{
		    					e.printStackTrace();
		    					}
		    			}
				
			}

	}
