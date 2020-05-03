package week5HW;

public class App {

	public static void main(String[] args) {

		Logger logger = new AsteriskLogger();
		
		logger.Log(testing);
		logger.Error(testing);
		
		Logger logger01 = new SpacedLogger();
		
		logger01.Log(testing);
		logger01.Error(testing);
		
		
	}

		
	
	static String testing = "Welcome to Object Orientated Programming!";
	
	
	
}
