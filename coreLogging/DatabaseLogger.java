package kodlamaio_oop_ödev.coreLogging;

public class DatabaseLogger implements Logger {
	
	@Override
	public void log(String data) {
		System.out.println("Logged to Database : " + data);
		
	}
	
}
