import java.util.*;
public class TicketBook{
	static alb = 2;		//available lower berth
	static aml = 1;
	static aub = 1;	
	static arac = 1;
	static awl = 1;

	static List<Integer> lbP = new ArrayList<Integer>(Arrays.asList(1, 2));		//lower berth position
	static List<Integer> mbp = new ArrayList<Integer>(Arrays.asList(1));
	static List<Integer> ubp = new ArrayList<Integer>(Arrays.asList(1));
	static List<Integer> racp = new ArrayList<Integer>(Arrays.asList(1));
	static List<Integer> wlp = new ArrayList<Integer>(Arrays.asList(1));

	static Queue<Integer> wlList = new ArrayList<Integer>();		//queue for booked passengers 
	static Queue<Integer> raclist = new ArrayList<Integer>();
	static List<Integer> bookedticketList = new ArrayList<Integer>();
	static Map<Integer, Passenger> passenger_stored = new HashMap<Integer, Passenger>;

	public void bookTicket(Passenger P, int seat_no, String allotted_ber){
		p.seat_no = seat_no;
		p.allotted = allotted_ber;
		passenger_stored.put(p.passId, p);
		bookedticketList.add(p.passId);
		System.out.println("Passenger ID : " + p.passId);
		System.out.println("Passenger Name : " + p.name);
		System.out.println("Passenger Age : " + p.age);
		System.out.println("Passenger Gender : " + p.gender);
		System.out.println("Passenger Berth : " + p.alallotted_ber);
		System.out.println("-----------------------------" + "Successfully Booked Ticket" + "-----------------------------");
	}

}