package FigPackage;

import java.util.Scanner;

public class Cone extends figure
{
	double s,h;

	 
	 
	public void calcArea()
	{
		 a=(pi*r*s)+(pi*r*r);
		
	}

	@Override
	public void calcVolume()
	{
		 v=(pi*r*v*h)/3;
		
		
	}

	@Override
	public void dispArea() {
		// TODO Auto-generated method stub
		System.out.println("area="+a);
	}

	@Override
	public void dispVolume() {
		// TODO Auto-generated method stub
		System.out.println("volume"+v);
	}

	
}
