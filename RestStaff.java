import java.util.Random;


public class RestStaff extends Staff {
	
	public RestStaff(String name) {
		super(name);
	}

	public void servFood(Visitor v) {
		
		String[] food = {"Steak", "Ice cream", "Cocktail", "Soup"};
		
		Random r = new Random();
		int f = r.nextInt(food.length);
		
		System.out.println(v.type+" visitor was served by "+name+" with " + food[f]);
	}
		
	public void proceedBill(Visitor v) {
		v.paymentState = true;
		System.out.println("The visitor paid for the meal");
	}
	
	
	
	
}
