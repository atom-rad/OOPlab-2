import java.util.Random;

public class Visitor {

	Id id;
	Baggage b;
	boolean paymentState = false;
	String type = "new";
	String orderR = "common";
	
	
	static private int ind = 0;
	
	public Visitor() {
		id = new Id();
		b = null;
		
		Random rand = new Random();
		
		
		int n = rand.nextInt(3);
		
		if (n == 0) {
			orderR = "econom";
		}
		if (n == 1) {
			orderR = "common";
		}
		if (n == 2) {
			orderR = "luxury";
		}
		
	}
	

}
