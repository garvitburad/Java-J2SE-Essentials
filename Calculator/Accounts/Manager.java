package com.piet.Accounts;

import java.util.Scanner;

import com.piet.Calci.*;
public class Manager {

	public static void main(String[] args) 
	{
		Calculator object1=new Calculator();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1 for add");
		System.out.println("enter2 for sub");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter choice");
		int choice = sc.nextInt();
		System.out.println("enter the two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			object1.add(a, b);
			break;
		case 2:
			object1.sub(a, b);
			break;
		case 3:
			object1.mul(a, b);
			break;
		default: exit()
		}
		

	}

}
