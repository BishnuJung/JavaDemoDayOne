package com.company.dayone;


import javax.swing.*;

public class CalulatorJOption {
	public static void main(String args[])
	{
		
		int a,b,c;
		
		String s1= JOptionPane.showInputDialog("Enter First Number:");
		a=Integer.parseInt(s1);
		
		String s2= JOptionPane.showInputDialog("Enter Second Number:");
		b=Integer.parseInt(s2);
		String s3= JOptionPane.showInputDialog("Choose your Calculation:"+"\n"+"Press 1 For Addition"+"\n"+"Press 2 For Substraction"+"\n"+"Press 3 For Product"+"\n"+"Press 4 For Division"+"\n"+"Press other number.");
		c=Integer.parseInt(s3);
        String doCalculation;
        switch (c) {
            case 1:  doCalculation = "Add"+"\n"+"The Sum is: "+(a+b);
                     break;
            case 2:  doCalculation = "Subtraction"+"\n"+"The difference is: "+(a-b);
                     break;
            case 3:  doCalculation = "Multiplication"+"\n"+"The product is: "+(a*b);
                     break;
            case 4:  doCalculation = "Divide"+"\n"+"The division is: "+(a/b);
                     break;
            default: doCalculation= "You entered the wrong Number.";
                     break;
        }
        JOptionPane.showMessageDialog(null,doCalculation);
 
		
		
	}
	

}