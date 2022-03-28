//wap to design application for vehicle mgt system
//design class vehicle having fields like name, regno and price
//using input method ask details from user and display them
//create another method discount that check if price>10000 the return 10% of price
//else return 15%of price
//in main check if dicounted amount >10000 the print eligible for "gifthamper"
//else "try next time"
//after that call display method to display all records


package Day_6;
import java.util.Scanner;
public class Vhechal {
	String Name;
	String Regno;
	int price;
	Scanner p=new Scanner(System.in);
	 
	 void input() 
	 {
		System.out.println("Enter the Detials 1.Name: 2.Regno: 3.Price:"); 
		Name=p.nextLine();
		Regno=p.nextLine();
		price=p.nextInt();
		 
	 }
	 void Display()
	 {
		 System.out.println("Vheicale Name: " +Name);  
		 System.out.println("Vheicale Regno: " +Regno);
		 System.out.println("Vheicale Price: " +price); 
		 
	 }
	float Discount()
	 {
		 if (price>10000)return    price*1.10f;	 
		 else return price*1.15f;
		 
		 
	 }
	
	 

	public static void main(String[] args) {
		Vhechal j=new Vhechal();
		j.input();
		j.Display();
		float y=j.Discount();
		System.out.println("Dicount is:"+y);
		if(y>30000)
			System.out.println("Eligible for Gift");
		else System.out.println("Not eligible for Gift");
	}

}
