package com.garvit.java;

import java.awt.event.MouseEvent; 
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Point; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics; 
import javax.swing.BorderFactory;
import javax.swing.JFrame;

import javax.swing.JPanel;

	
	
	public class LineBuilder extends JPanel implements MouseListener, MouseMotionListener { 
	        Point sPoint = new Point(-1, -1); 
	        Point ePoint = new Point(-1, -1);  
	                public LineBuilder()
	                { 
	                     init();
	                }
	                public void init() 
	                {
	               
	           
	        addMouseListener(this);
	        addMouseMotionListener(this);
	        repaint();
	                 
	    }
	  public void mouseDragged(MouseEvent e) {  
	           
	         
	  }  
	 
	  public void mousePressed(MouseEvent e) {  
	    
	     sPoint.x = e.getX();  
	     sPoint.y = e.getY();  
	  }  
	 
	  public void mouseReleased(MouseEvent e) { 
	       
	     ePoint.x = e.getX();  
	     ePoint.y = e.getY();   
	     repaint();  
	          
	  }  
	 
	  public void mouseMoved(MouseEvent e) { 
		  
	  }  
	 
	  public void mouseEntered(MouseEvent e) { 
		  
	  }  
	 
	  public void mouseExited(MouseEvent e) {  
		  
	  }  
	 
	  public void mouseClicked(MouseEvent e) {  
		  
	  }  
	 
	  public void paint(Graphics g) {  
	     
		  
	     g.drawLine(sPoint.x, sPoint.y, ePoint.x, ePoint.y);  
	    
	  }
	   public static void main(String arg[])
	  {
	      LineBuilder line= new LineBuilder();
	        JFrame f= new JFrame();
	               f.setSize(new Dimension(300,300));
	                 f.getContentPane().add(line);
	               f.setVisible(true);
	       }
	}


