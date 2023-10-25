#include <stdio.h>
#include <iostream>

using namespace std;

int main(){
	int  total= 0,pay, change,addpay,quan,quansum;
	char loop = 'y', cloop = 'q', buyagain = 'y';
	printf("Miki's Cafeteria");
	char menu,snac,drink,dess;
	do{

	do{
	printf("\n\n\nwhat would you like to have?");
	printf("\n[A]Snacks? [B]Drinks? [C]Desserts? [Q]Exit.: ");
	scanf(" %c", &menu);
	switch(menu){
		case 'a':
		case 'A':
			printf("We have");
			printf("\n[A]tatoes-15  and [B]Siopai-20: ");
			scanf(" %c", &snac);
			if(snac == 'a'||snac == 'A'){
				printf("how many would you like?: ");
				scanf(" %d", &quan);
				quansum = quan * 15;
				total= total + quansum;
				printf("that would be %d", quansum);
			}
			else if(snac == 'b'||snac == 'B'){
				printf("how many would you like?: ");
				scanf(" %d", &quan);
				quansum = quan * 20;
				total= total + quansum;
				printf("that would be %d", quansum);
			}
			else{
				printf("Invalid input\n");
				
			}
		break;
		case 'b':
		case 'B':
			printf("We have");
			printf("\n[A]Cokeain-18 and [B]Water-10: ");
			scanf(" %c", &drink);
			if(drink == 'a'||drink == 'A'){
				printf("how many would you like?: ");
				scanf(" %d", &quan);
				quansum = quan * 18;
				total= total + quansum;
				printf("that would be %d", quansum);
			}
			else if(drink == 'b'||drink == 'B'){
				printf("how many would you like?: ");
				scanf(" %d", &quan);
				quansum = quan * 10;
				total= total + quansum;
				printf("that would be %d", quansum);
			}
			else{
				printf("Invalid input\n");
			}
		break;
		case 'c':
		case 'C':
			printf("We have");
			printf("\n[A]Lollipop-5 and [B]Ice Cream-15: ");
			scanf(" %c", &dess);
			if(dess == 'a'||dess == 'A'){
				printf("how many would you like?: ");
				scanf(" %d", &quan);
				quansum = quan * 5;
				total= total + quansum;
				printf("that would be %d", quansum);
			}
			else if(dess == 'b'||dess == 'B'){
				printf("how many would you like?: ");
				scanf(" %d", &quan);
				quansum = quan * 15;
				total= total + quansum;
				printf("that would be %d", quansum);
			}
			else{
				printf("Invalid input\n");
			}
		break;
		case 'q':
		case 'Q':
			goto end;
		default:
			printf("invalid input\n");
			
		break;
	}
	printf("\nanyhing else?[Y/n]");
	scanf("  %c", &loop);
}while(loop == 'y'|| loop == 'Y');
	
	printf("Your total is: %d", total);
	printf("\nEnter Payment amount: ");
	scanf("%d", &pay);
	
	if(pay < total){
		printf("insuffiecient amount\n Add more: ");
		scanf("%d", &addpay);
		pay = addpay + pay;
		if(pay < total){
			printf("sorry but it's still insufficient,\n i won't be able to give what you want.");
		}
		else{
			change = pay - total;
			printf("your total change is: %d", change);
			printf("\nthank you!");
		}
	}
	else{
		change = pay - total;
	printf("your total change is: %d", change);
	printf("\nthank you!");
	}
	
	printf("\n\nwould you like to buy again?[Y/n]");
	scanf(" %c", &buyagain);
	}while(buyagain == 'y' || buyagain == 'Y');
	end:
	printf("\nThank you for your patronage, please come again!");
	
	return 0;
}
