package com.company.dayone;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[])
	{
		
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a= ob.nextInt();
		System.out.println("Enter Second number: ");
		int b= ob.nextInt();
		System.out.println("Choose your Calculation:"+"\n"+"Press 1 For Addition"+"\n"+"Press 2 For Substraction"+"\n"+"Press 3 For Product"+"\n"+"Press 4 For Division"+"\n"+"Press other number.");
		int operation = ob.nextInt();
        String doCalculation;
        switch (operation) {
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
        System.out.println(doCalculation);
	}

}
