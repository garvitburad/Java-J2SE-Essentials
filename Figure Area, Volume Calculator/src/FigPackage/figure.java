package FigPackage;

import java.util.Scanner;

public abstract class figure 
{
	double a,r,v,pi=3.1428;
	 public abstract void calcArea(); 
	 public abstract void calcVolume();
	 public abstract void dispArea();
	 public abstract void dispVolume();
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();

}
