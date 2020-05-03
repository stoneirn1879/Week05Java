package week5HW;


public class AsteriskLogger implements Logger{

	
	public void Log(String log) {
		System.out.println("***" + log + "***");
			
	}

	
	public void Error(String error) {
		System.out.println("****************\n***" + "Error: " + error + "***\n****************");
	}

}


//5.	The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String
//preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:

//****************
//***Error: Hello***
//****************