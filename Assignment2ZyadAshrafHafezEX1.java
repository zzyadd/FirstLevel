package assignment1programming1;
import java.util.*;
public class Assignment2ZyadAshrafHafezEX1 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  // EX:1
   int balance = 5000 ;
  int num1;
   System.out.println("Enter 1 for Withdraw \n Enter 2 for Deposit");
   System.out.println("Enter 3 for Check Balance \n Enter 4 for EXIT");
   System.out.print("Choose the operation:"  );

   num1 = sc.nextInt();
    switch (num1) {
    case 1: 
        System.out.println("WITHDRAW" );

        System.out.println("Your balance is : " + balance + " $");
        
        System.out.print("Enter money to be withdrawn: " );
        int withdraw = sc.nextInt();
        if ( withdraw <= balance) {
        	balance -= withdraw ;
            System.out.println("collect your money \n your balance now is  " + balance + " $" ); }
        else {   System.out.println(" try again!  and Enter value less than  " + balance );}
        break; 
     case 2 :  
       System.out.println("DEPOSIT");
       System.out.println("Your balance is : " + balance + " $");
       System.out.println("Enter money to be DEPOSIT ");
       int deposit = sc.nextInt();
       balance += deposit ;
       System.out.println("Thank you Your money has been deposited successfully :)");
       System.out.println(" Your balance now is : " + balance + " $");
       break; 
     case 3 : 
     System.out.println("Check the balance");
     System.out.println("Your balance is : " + balance + " $");
        break ; 
     case 4 :
         System.out.println("Thanks \n \n ");
         break;
         }  
    
    }}