package com.company.dayone;
import java.util.*;
import javax.swing.*;
public class LargestAmongThree {
	public static void main (String args[])
	{
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter the three number:");
		int a, b, c;
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		/*
		if((a>b) &&(b>c))
		{
			System.out.println("A is the greatest number: "+a);
		}
		else if((b>c) && (a<c))
		{
			System.out.println("B is the greatest number: "+b);
			
		}
		else
		{
			System.out.println("C is the greatest number: "+c);
		}*/
		// var name =(expression) ? value if true: value if false
		int temp=(a>b)? a:b;
		int result=(c>temp)? c:temp;
		System.out.println(result);
		//JOptionPane.showMessageDialog(null,"Largest: "+result);
	
					}

}
