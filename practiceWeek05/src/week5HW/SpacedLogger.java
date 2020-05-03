package week5HW;

public class SpacedLogger implements Logger{
			
	@Override
	public void Log(String log) {
		System.out.println(String.valueOf(log).replaceAll(".", "$0 "));

	}

	@Override
	public void Error(String error) {
		System.out.println("Error: " + String.valueOf(error).replaceAll(".", "$0 "));

	}
	
	

}


//		6.	The SpacedLogger should add spaces between each character of the String argument passed into its methods.
//7.	If the log method received “Hello” as an argument, it should print H e l l o
//8.	The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
//System.out.println(String.valueOf(name).replaceAll(".(?!$)", "$0  "));
//System.out.println(String.valueOf(name).replaceAll(".", "$0  "));