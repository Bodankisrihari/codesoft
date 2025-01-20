import java.util.Random;
import java.util.Scanner;
public class main
{
   private static int gameWins;
public static void main(String[] args)
{
System.out.println("*******Welcome to Guessing Game*******\n");
System.out.println("What is your name:\n");
Scanner scan=new Scanner(System.in);
String userName=scan.nextLine();
System.out.println("Hello"+userName);
String option;
boolean run=true;
gameWins=0;
do
{
System.out.println("\nPlease select an option below:\n\n1. Start\n2. Quit\n");
option=scan.next();
switch(option)
{
case"1":
 game(scan,run);
 System.out.println("\n\nWould you like to play again?\n\n1. Yes\n2. No\n");
 String choice=scan.next();
 while(choice.equals("1"))
{
  game(scan,run);
  System.out.println("\n\nWould you like to play again?\n\n1. Yes\n2 .No\n");
  choice=scan.next();
}
System.out.println("****Congratulation-You have Won"+gameWins+"Round*****");
run=false;
break;
case "2": 
System.out.println("****What a looser,you chickened out*****");
run=false;
break;
default:
 System.out.println("Incorrect Input.Please Enter again");
break;
}
}
while(run);
}
public static void game(Scanner scan,boolean run)
{
Random rnd=new Random();
int rndValue=rnd.nextInt(101);
System.out.println("Let the Guessing Game begin");
int chances=5;
int guess;
while(chances>0)
{
System.out.println("\nChances left:"+chances);
System.out.println("Please enter your guess:");
guess=scan.nextInt();
if(guess>rndValue)
{
System.out.println("Enter a lower value\n");
}else if(guess<rndValue)
{
System.out.println("Enter a higher value\n");
}else
{
System.out.println("****Congratulation-You Win*****");
gameWins++;
run=false;
break;
}
chances-=1;
}
if(run)
{
System.out.println("\nRandom value="+rndValue);
System.out.println("\n****Game over-You loose,looser*****");
run=false;
}
}
}
