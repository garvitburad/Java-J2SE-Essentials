package com.garvit.java;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class calculator extends Applet implements ActionListener,MouseListener
{
Label lf,ls,lr;
TextField tf,ts,tr;
Button sum,sub,multi,div;
int x,y;
	public void init()
	{
		setBackground(Color.red);
		lf=new Label("Enter A");
		ls=new Label("Enter B");
		lr=new Label("Result");
	    tf=new TextField(20);
	    ts=new TextField(20);
	    tr= new TextField(20);
	sum= new Button("Addition");
	add(lf);
	add(ls);
	add(lr);
	add(tf);
	add(ts);
	add(tr);
	add(sum);
	sum.addActionListener(this);
	sum.addMouseListener(this);
	addMouseListener(this);
	}
	
	
	public void actionPerformed(ActionEvent ae) 
	{
	int a=Integer.parseInt(tf.getText());
	int b =Integer.parseInt(ts.getText());
	int sum =a+b;
	
	tr.setText(String.valueOf(sum));
	
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(tf.getText());
		int b =Integer.parseInt(ts.getText());
		int sum =a+b;
		
		tr.setText(String.valueOf(sum));

}


	@Override
	public void mouseClicked(MouseEvent e)
	{	
		// TODO Auto-generated method stub
	
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x=e.getX();
		int y=e.getY();
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int j=e.getX();
		int k=e.getY();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		System.out.println("paint");
		g.drawString("str", 234, 387);
		g.drawLine(x, y, , arg3);
		
	}
	
	
	
}
