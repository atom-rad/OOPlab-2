import java.util.Queue;
import java.util.LinkedList;


public class  Simulation {
	public static void run_simul() {
	
		Queue<Visitor> row = new LinkedList<>();
		
		Visitor v1 = new Visitor();
		Visitor v2 = new Visitor();
		Visitor v3 = new Visitor();
		Visitor v4 = new Visitor();
		
		row.add(v1);
		row.add(v2);
		row.add(v3);
		row.add(v4);
		
		BaggagePorterSt bg = new BaggagePorterSt("Alex");
		ReceptionStaff rs = new ReceptionStaff("Steve");
		RestStaff resSt = new RestStaff("Peter");
		
		while(!row.isEmpty()) {
			Visitor v = row.remove();
			Room r = new Room();
			Restaurant res = new Restaurant(resSt);
			
			rs.assignRoom(r, v);
			bg.moveBaggage(r, v.b);
			res.serveTheClient(v);
			
			System.out.println();
		}
		
		
		
		
	}
	
	
	
}
