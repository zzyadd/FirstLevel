package linkedList;
import java.io.*;

public class L_LMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L_L_Insert l1 = new L_L_Insert();
		l1.addFirst(1);
		l1.insertMid(1, 2);
		l1.insertMid(2, 3);
		l1.insertMid(3, 4);
		l1.insertMid(4, 5);
		l1.insertMid(5, 6);
		l1.insertMid(6, 7);
		l1.insertMid(7, 8);
		l1.addLast(9);
		l1.printList();
		l1.deletFirst();
		l1.deletMid(4);
		l1.deletLast();
		l1.printList();



	}

}
