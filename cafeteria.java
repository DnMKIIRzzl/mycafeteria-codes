import java.util.Scanner;
public class cafeteria{
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);
	int  total= 0;
	int change,quansum,quan,pay,addpay;
	String loop = "y";
	String buyagain = "y";
	String menu, snac, drink, dess;
	System.out.println("Miki's Cafeteria");
	do{

	do{
	System.out.println("\n\n\nwhat would you like to have?");
	System.out.println("\n[A]Snacks? [B]Drinks? [C]Desserts?: ");
	menu = myObj.next();
	switch(menu){
		case "a":
		case "A":
			System.out.println("We have");
			System.out.println("\n[A]tatoes-15  and [B]Siopai-20: ");
			snac = myObj.next();
			if(snac.equalsIgnoreCase("a")){
				System.out.println("how many would you like?: ");
				quan = myObj.nextInt();
				quansum = quan * 15;
				total = total + quansum;
				System.out.println("that would be " + quansum);
			}
			else if(snac.equalsIgnoreCase("b")){
				System.out.println("how many would you like?: ");
				quan = myObj.nextInt();
				quansum = quan * 20;
				total= total + quansum;
				System.out.println("that would be " + quansum);
			}
			else{
				System.out.println("Invalid input\n");
				
			}
		break;
		case "b":
		case "B":
			System.out.println("We have");
			System.out.println("\n[A]Cokeain-18 and [B]Water-10: ");
			drink = myObj.next();
			if(drink.equalsIgnoreCase("a")){
				System.out.println("how many would you like?: ");
				quan = myObj.nextInt();
				quansum = quan * 18;
				total= total + quansum;
				System.out.println("that would be %d" + quansum);
			}
			else if(drink.equalsIgnoreCase("b")){
				System.out.println("how many would you like?: ");
				quan = myObj.nextInt();
				quansum = quan * 10;
				total = total + quansum;
				System.out.println("that would be %d" + quansum);
			}
			else{
				System.out.println("Invalid input\n");
			}
		break;
		case "c":
		case "C":
			System.out.println("We have");
			System.out.println("\n[A]Lollipop-5 and [B]Ice Cream-15: ");
			dess = myObj.next();
			if(dess.equalsIgnoreCase("a")){
				System.out.println("how many would you like?: ");
				quan = myObj.nextInt();
				quansum = quan * 5;
				total= total + quansum;
				System.out.println("that would be %d" + quansum);
			}
			else if(dess.equalsIgnoreCase("b")){
				System.out.println("how many would you like?: ");
				quan = myObj.nextInt();
				quansum = quan * 15;
				total= total + quansum;
				System.out.println("that would be " + quansum);
			}
			else{
				System.out.println("Invalid input\n");
				break;
			}
		default:
			System.out.println("invalid input\n");
			loop = "y";
		break;
	}
	System.out.println("\nanyhing else?[Y/n]");
	loop = myObj.next();
	}while(loop.equalsIgnoreCase("y"));
	
	System.out.println("Your total is: " + total);
	System.out.println("\nEnter Payment amount: ");
	pay = myObj.nextInt();
	
	if(pay < total){
		System.out.println("insuffiecient amount\n Add more: ");
		addpay = myObj.nextInt();
		pay = addpay + pay;
		if(pay < total){
			System.out.println("sorry but it's still insufficient,\n i won't be able to give what you want.");
		}
		else{
			change = pay - total;
			System.out.println("your total change is: " + change);
			System.out.println("\nthank you!");
		}
	}
	else{
		change = pay - total;
	System.out.println("your total change is: " + change);
	System.out.println("\nthank you!");
	}
	
	System.out.println("\n\nwould you like to buy again?[Y/n]");
	buyagain = myObj.next();
	}while(buyagain.equalsIgnoreCase("y"));
	
	System.out.println("\nThank you for your patronage, please come again!");
	}

}