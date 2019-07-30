package singleton;

public class Main {

	public static void main(String[] args) {

		
		for (int i = 0; i < 10; i++) {
			
			Singleton connection = Singleton.myConnection();
			System.out.println(connection);
			
		}
	}

}
