package linkedList;

public class bubbleSorting {
public static int[] sorting(int []array) {
	int temp = 0;
	for (int i=0; i<array.length; i++){
	for (int j=1; j<(array.length - i); j++){
	if(array[j-1] > array[j]){
	temp = array[j-1];
	array[j-1] = array[j];
	array[j] = temp;
	}	}	}	
	return array;}

public static void main(String[] args) {
int []array= {1,4,2,6,9,14,26,32,7,3,10};
System.out.println("old array is :");
for(int i =0 ; i < array.length; i++) {
	System.out.print(array[i]+" ");
}
int [] new_arr = sorting(array);

System.out.println("");
System.out.println("NEW array is :");
for(int i =0 ; i < new_arr.length; i++) {
	System.out.print(new_arr[i]+" ");
}


}
}
