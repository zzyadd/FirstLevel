package assignment1programming1;
import java.util.*;
public class sec5prog {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		/* EX:3 
	//EX:4
		 Scanner console = new Scanner (System.in);
	     System.out.println("the side b is ?" );
	      int b = console.nextInt();
	        System.out.println("the side c is ?");
	      int c = console.nextInt();
	      System.out.println("the angle is ?");
	     double ang = console.nextDouble();
	      double a=Math.sqrt((b*b)+(c*c)-(2*b*c*Math.cos(ang)));
	      System.out.println("side a is :  " + a);
	      //EX:5
	      System.out.println("Enter");
	      double no = console.nextDouble();
	      double absno = Math.abs(no);
	      System.out.println("no in abs is"+ absno );
         //EX: 6
	      System.out.println("enter ur First name ");
	      String firstname = console.nextLine();
	      System.out.println("enter ur last name ");
	      String lastname = console.nextLine();
	      System.out.println("enter ur last name ");
	      System.out.println("welcome"+ lastname + firstname);
	      System.out.println("What is ur Fav language? ");
	      String thuname = console.nextLine(  );
	      System.out.println("What is ur Fav language? ");
	      System.out.println("I love " + thuname.toUpperCase()); */
System.out.print("Enter Size of array");
		int n = sc.nextInt();
	      int [] arr = new int [n];
	      for (int a=0 ; a<n ; a++) {
	    	  arr[a]= a ;
	      }
	      for (int a=0 ; a<n ; a++) {
	    	  System.out.print(arr[a]+"\t");
	      }
	      System.out.print("Enter number u want to delete");
	      int s = sc.nextInt();
	      for(int f=s;f<(n-1);f++) {
	    	  arr[f]=arr[f+1];
	      }
	      for (int a=0 ; a<(n-1) ; a++) {
	    	  System.out.print(arr[a]+"\t");
	      }
	}

}
   