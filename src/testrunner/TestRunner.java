package testrunner;

import testcontroller.TestController;

public class TestRunner 
{
	public static void main (String [] args)
	{
		TestController myController = new TestController();
		myController.testIfRun();
		
		myController.testNestedIfRun();
		
		myController.testSequenceIf();
		
		myController.testIfElse();
		
		myController.testNestedIfElse();
		
		myController.testIfElseIfElse();
	}
}
