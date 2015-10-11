package testcontroller;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestController 
{
	private Scanner testScanner;
	private int userAnswer;
	private int userDivide;
	private int userAge;
	private int userMultiply;
	private String userStar;
	private int userSquare;
	
	
	
	public void testIfRun()
	{
		JOptionPane.showInputDialog("What is 2+2?");
		testScanner = new Scanner (System.in);
		int userAnswer = testScanner.nextInt();
		
		if (userAnswer == 4)
		{
			JOptionPane.showMessageDialog(null, "That's correct!");
		}
	}
	
	public void testNestedIfRun()
	{
		JOptionPane.showInputDialog("What is 8/4?");
		int userDivide = testScanner.nextInt();
		
		if (userDivide > 0)
		{
			if (userDivide < 4)
			{
				JOptionPane.showMessageDialog(null, "That's close, but not right");
			}
		}
	}
	
	public void testSequenceIf()
	{
		JOptionPane.showInputDialog("Type your age");
		int userAge = testScanner.nextInt();
		
		if (userAge < 100)
		{
			JOptionPane.showMessageDialog(null, "You are less than 100 years old");	
		}
		
		if (userAge < 50)
		{
			JOptionPane.showMessageDialog(null, "You are less than 50 years old");	
		}
		
		if(userAge < 10)
		{
			JOptionPane.showMessageDialog(null, "You are less than 10 years old");	
		}
		
	}
	
	public void testIfElse()
	{
		JOptionPane.showInputDialog("What is 2x2?");
		int userMultiply = testScanner.nextInt();
		
		if (userMultiply == 4)
		{
			JOptionPane.showMessageDialog(null, "That is correct");
		}	
		
		else
		{
			JOptionPane.showMessageDialog(null, "That is incorrect");
		}
	}
	
	public void testNestedIfElse()
	{
		JOptionPane.showInputDialog("Are you a Star Wars fan?");
		String userStar = testScanner.next();
		String answerOne = "Yes";
		String answerTwo = "No";
		
		
		if (userStar.equalsIgnoreCase(answerOne))
		{
			JOptionPane.showMessageDialog(null, "Go to starwars.com");
		}
		else
		{
			if (userStar.equalsIgnoreCase(answerTwo))
			{
				JOptionPane.showMessageDialog(null, "You may exit this application");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Error: Please type Yes or No");
			}
		}
	}
	
	public void testIfElseIfElse()
	{
		JOptionPane.showMessageDialog(null, "What is the square root of 64?");
		JOptionPane.showInputDialog("Type your first answer below");
		JOptionPane.showInputDialog("Type your second answer below");
		int userSquare = testScanner.nextInt();
		int userRoot = testScanner.nextInt();
		
		if (userSquare == 8)
		{
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Wrong, try again");
		}
	
		if (userRoot == -8)
		{
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong, try again");
		}

	}	
	
	//New tests
	
	public void testWhileLoop()
	{
		int x = 2;
		
		while(x < 10)
		{
			System.out.println("Number is less than 10");			
		}
	}

	public void testWhileLoopTwo()
	{
		int x = 25;
		
		while(x < 50)
			
			System.out.println("x is : " + x);
			x++;
			System.out.println("\n");
			
	}
	
	public void testForLoop()
	{	
		for(int y = 10; y < 10;)
		{
			System.out.println("Number is less than 10");
		}
	}

	public static void testForLoopTwo()
	{
		for(int y = 100; y < 200;)
		{
			System.out.println("y is : " + y);
			y++;
			System.out.println("\n");
		}
	}
	
	public static void testForEach()
	{
		int testArray[] = {2, 4, 6, 8, 10};
		
		for(int var: testArray)
		{
			System.out.println(var);
		}
	}
	
	public static void testForEachTwo()
	{
		int [] numbers = {1, 2, 3, 4, 5};
		
		for(int u: numbers)
		{
			System.out.println(u);
			System.out.println(",");
		}
		
		System.out.println("\n");
		String [] names = {"Matt", "Jared", "Adam", "Jason"};
		
		for(String name: names)
		{
			System.out.println(names);
			System.out.println(",");
		}
	}
	
	public static void testNestedLoop()
	{
		for(int e = 8; e > 0; e--)
		{
			for(int t = e; t < 8; t++)
			{
				System.out.println("_");
			}
			
			for(int t = e; t > 0; t--)
			{
				System.out.println(e);
			}
			
			System.out.println();
		}
	}
	
	

}