import java.util.*;
public class Main{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	Boolean loop = true;
	while(loop){
		System.out.println("1.Book Ticket \n2.Cancel \n3.Available Ticket \n4.Booked Ticket \n5.Exit");
		int ch = input.nextInt();
		switch(ch){
			case 1:{
				System.out.println("Enter Passenger Name : ");
				String name = input.next();
				System.out.println("Enter Passenger Age : ");
				int age = input.nextInt();
				System.out.println("Enter Gender (M, F) : ");
				String gender = input.next();
				System.out.println("Enter Berth Preferrence (L, M, U) :");
				String ber_pre = input.next();
				Passenger p = new Passenger(name, age, gender, ber_pre);
				break;
			}
			case 5:{
				loop = false;
				break;
			}
		}
	}
}
}