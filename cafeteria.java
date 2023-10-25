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
	System.out.println("\n\n\nChoose a Category: ");
	System.out.println("[A] Snacks? [B] Drinks? [C] Desserts?: ");
	menu = myObj.next();
	switch(menu){
		case "a":
		case "A":
			System.out.println("You chose Snacks. Kindly choose which snack would you like to buy: ");
			System.out.println("[A] Tatoes P15  and [B] Siopai P20: ");
			snac = myObj.next();
			if(snac.equalsIgnoreCase("a")){
				System.out.println("Enter Quantity: ");
				quan = myObj.nextInt();
				quansum = quan * 15;
				total = total + quansum;
				System.out.println("Your total is: " + quansum);
			}
			else if(snac.equalsIgnoreCase("b")){
				System.out.println("Enter Quantity: ");
				quan = myObj.nextInt();
				quansum = quan * 20;
				total= total + quansum;
				System.out.println("Your total is: " + quansum);
			}
			else{
				System.out.println("Invalid input\n");
				
			}
		break;
		case "b":
		case "B":
			System.out.println("You chose Drinks. Kindly choose which drinks would you like to buy: ");
			System.out.println("[A] Coke P18 and [B] Water P10: ");
			drink = myObj.next();
			if(drink.equalsIgnoreCase("a")){
				System.out.println("Enter Quantity: ");
				quan = myObj.nextInt();
				quansum = quan * 18;
				total= total + quansum;
				System.out.println("Your total is: " + quansum);
			}
			else if(drink.equalsIgnoreCase("b")){
				System.out.println("Enter Quantity: ");
				quan = myObj.nextInt();
				quansum = quan * 10;
				total = total + quansum;
				System.out.println("Your total is: " + quansum);
			}
			else{
				System.out.println("Invalid input\n");
			}
		break;
		case "c":
		case "C":
			System.out.println("You chose Desserts. Kindly choose which desserts would you like to buy: ");
			System.out.println("[A] Lollipop P5 and [B] Ice Cream P15: ");
			dess = myObj.next();
			if(dess.equalsIgnoreCase("a")){
				System.out.println("hEnter Quantity: ");
				quan = myObj.nextInt();
				quansum = quan * 5;
				total= total + quansum;
				System.out.println("Your total is: " + quansum);
			}
			else if(dess.equalsIgnoreCase("b")){
				System.out.println("Enter Quantity: ");
				quan = myObj.nextInt();
				quansum = quan * 15;
				total= total + quansum;
				System.out.println("Your total is: " + quansum);
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
	System.out.println("\nDo you want to buy again? [Y/N]");
	loop = myObj.next();
	}while(loop.equalsIgnoreCase("y"));
	
	
	if(loop.equalsIgnoreCase("n"))

		System.out.println("Your total is: " + total);
		System.out.println("Enter Payment amount: ");
		pay = myObj.nextInt();
			while(pay < total){
				System.out.println("Insufficient amount. Add more: ");
				pay = myObj.nextInt();
			}
		change = pay - total;
		System.out.println("Your Total is: " + change);
		System.out.println("Thank You!");
		
	
	System.out.println("\n\nWould you like to buy again?[Y/N]");
	buyagain = myObj.next();
	}while(buyagain.equalsIgnoreCase("y"));
	
	System.out.println("\nThank you for your patronage, please come again!");
	}

}