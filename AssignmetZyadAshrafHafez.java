package assignment1programming1;
import java.util.*;
public class AssignmetZyadAshrafHafez {
		    public static void main(String[] args){
		        Scanner console = new Scanner (System.in);
				//EX 1
		        System.out.print("lenth is ?:");
		        double lenth = console.nextDouble();
		        System.out.print("width is ?:");
		        double width = console.nextDouble();
		      double area1 = lenth*width ;
		     double perimeter1 = 2*(lenth+width);
		     System.out.println("area is :" + area1 );
		      System.out.println( "perimeter is: " + perimeter1 );
		        // EX 2
		       System.out.print("Enter the value of p1 is  x then y  :");
		      double x1= console.nextDouble();
		       double y1 = console.nextDouble();
		     System.out.print("Enter the value of p2 x then y  :");
		     double x2= console.nextDouble();
		      double  y2 = console.nextDouble();
		      double m = (y2-y1)/(x2-x1);
		           System.out.println("m is "+m);
		        // EX 3
		      System.out.print("Enter the value of a1 "); 
		       int a1 = console.nextInt();
		       System.out.print("Enter the value of b1 ");
		        int b1 = console.nextInt();
		       System.out.print("Enter the value of z1 ");
		      int z1 = console.nextInt();
		       System.out.print("Enter the value of a2 ");
		       int a2 = console.nextInt();
		       System.out.print("Enter the value of b2 ");
		       int b2 = console.nextInt();
		       System.out.print("Enter the value of z2 ");
		       int z2 = console.nextInt();
		      double D = Math.sqrt((Math.pow((a2-a1),2)+(Math.pow((b2-b1),2))+ Math.pow((z2-z1),2)));
		      System.out.println("D is : " + D);
		      //EX4
		         int le ;
		       System.out.println();
		       do {System.out.print("write the lenthII in postive : ");
		      le = console.nextInt() ;}
		       while (le <= 0) ;
		        //
		       System.out.println();
		      int n  ;
		      System.out.println();
		      do { System.out.print("write the n (n>2) : ");
		      n = console.nextInt() ;}
		      while (n <= 2) ;
		      System.out.println();
		      double area2 = (le*le*n)/(4* Math.tan(180/n));
		      System.out.println("area is :" + area2);
		      //EX5
		       System.out.println("Enter the value of a ?");
		       int a = console.nextInt();
		       System.out.println("Enter the value of b ?");
		        int b = console.nextInt();
		      System.out.println("Enter the value of c  ?");
		      int c = console.nextInt();
		       double s = (a + b+ c)/2;
		        double area3 = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		      System.out.println("Area is : " + area3 );
		    }
		}
