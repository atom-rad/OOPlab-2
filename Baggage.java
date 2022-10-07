
public class Baggage {

	int quantity = 3;
	String[] type = {"suitcase", "bag", "backpack"};
	
	static boolean mark = false;
	static boolean serviced = false;
	
	public static void markit() {
		mark = true;
	}
	
	public static void unmarkit() {
		mark = false;
	}

	public static void service() {
		serviced = true;
	}
	

}
