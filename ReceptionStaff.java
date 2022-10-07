
public class ReceptionStaff extends Staff {

	public ReceptionStaff(String name) {
		super(name);
	}
	
	public void assignRoom(Room r, Visitor v) {
		r.occupied = true;
		r.visitor = v;
		System.out.println("The room ws assigned to visitor with id "+v.id.id);
	}
}
