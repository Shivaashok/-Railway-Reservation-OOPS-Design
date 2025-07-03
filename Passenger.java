public class Passenger{
	static int id = 1;
	String name;
	int age;
	String ber_pre;
	String gender;
	int pass_id = id++;
	int seat_no;
	String allotted;
	public Passenger(String name, int age, String gender, String ber_pre){
		this.name = name;
		this.age = age;
		this.ber_pre = ber_pre;
		this.gender = gender;
		allotted = " ";
		seat_no = -1;
	}	
}