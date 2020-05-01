package week5HW;

import java.util.Date;

public class AsteriskLogger implements Logger{

	@Override
	public void Log(String log) {
		Date date = new Date();
		System.out.println(date.toString() + ": " + log);
			
	}

	@Override
	public void Error(String error) {
		Date date = new Date();
		System.out.println("Your application might be a little shaky..." + date.toString() + ": " + error);
	}

}
