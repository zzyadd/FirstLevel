package safwa;

import java.util.*;



public class array {
	public static double avv () {
			double aver=0;
		  Scanner sc = new Scanner(System.in);
		  System.out.print("how many days'");
		  int n = sc.nextInt();
			 double[] x = new double[n];

		for(int i=0 ; i<n ;i++) {
			System.out.println("enter temp of day "+ (i+1));
			x[i]=sc.nextDouble();
			aver = aver + x[i];
		}
		aver = aver/n ;
		  System.out.println("average temp = "+aver);
int count =0 ;
		for(int i=0 ; i<n ;i++) {
			if (x[i] >aver) {
				count ++ ;
			}
		}
		return count ;
	}
	public static void isEven () {
		int[] y = {1,7,5,6,4,14,11};
		for (int i=0 ; i<7 ;i++) {
			if (y[i] % 2 ==0 ) {
				System.out.println (y[i]+" is even");
			}
			}
		} 
	public static boolean isPrime (int x) {
		 
	
		int count =0 ;	
		for	(int n =2; n<= x/2 ; n++) {
			if (x % n ==0 ) {
				count ++ ;}
		}
		if(count ==0) {
			return true ;
		}
		else 
		return false ;
		}
	public static void isPrimee () {
		 int[] z = { 12,49,-2,26,5,17,-6};
	
		int count =0 ;	
		 for(int i=0 ; i<z.length;i++) {
	if(isPrime(z[i])) {
		
			System.out.println(z[i]+" is primre") ;
		}
		}}
	
	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		int[] numbers = new int[10] ;
		for(int i =0 ; i<10 ; i++ ) {
			numbers[i] = (int)((Math.random()*50)+1);
System.out.println(numbers[i]);
} */
// System.out.println(numbers); 
		// System.out.println(avv());
		isPrimee ();
	}

}
