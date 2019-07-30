package singleton;

public class Singleton {

	private static Singleton uniqueConnection;
	
	private static int count = 0;
	
	public int number;
	

	private Singleton() {
		
		number = ++count;
	}

	public static Singleton myConnection() {

		if (uniqueConnection == null) {
			uniqueConnection = new Singleton();

		}
		return uniqueConnection;

	}

	@Override
	public String toString() {
		return "Singleton " + number;
	}

}
