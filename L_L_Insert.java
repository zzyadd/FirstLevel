package linkedList;
// package dataStractureProgecySemTwo;

import java.io.*;

import org.w3c.dom.Node;
public class L_L_Insert {
	// pointer for head and tail and size of list
	node head;
	node tail;
	int size = 0;
	static class node {
		   
        int data;
        node next;
   
        // Constructor
        node(int d)
        {
            data = d;
        }
    }
	// Create method to add node in list in first
	public void addFirst(int d) {
		//Create the new node
		node newNode = new node(d);
		//check if list is empty			
		if(isEmpty()) {
			//make head = tail = node
			head=tail=newNode;
			System.out.println("empty");
		}else {
			//make the next of node link to the first node of list
			 newNode.next=head;
			 //make head link to the new node
			 head=newNode;
		} //Increase size+1 
		size++;	
	}
	// method to check if the list is empty or not
	public boolean isEmpty() {
		return (head == null);
	}
	//method to insert node at last of list
	public void addLast(int d) {
		//creat the new node
		node newNode = new node(d);
		//check if list is empty			
		if(isEmpty()) {
			//make head = tail = node
			head=tail=newNode;
		}else {
			//make the next of the last node of link to the new node
			 tail.next=newNode;
			 //make tail link to the new node
			 tail=newNode;
		} //Increase size+1 
		size++;	
		}
		
	
	 // Method to insert a new node
    public void insertMid(int index, int data)
    {
        // Create a new node with given data
        node new_node = new node(data);
        //check if index in range
        if(index > size) {
        	System.out.println("the index is out of range");
        }

        // If the Linked List is empty,
        else if(isEmpty()) {
      			//make head = tail = node
      			head=tail=new_node;
      			}
        	else { 
      			//make pointer tempt = head to point to each node in list
      			node temp = head;
      			// for loop to get to the index in list
      			for(int i = 0 ; i<(index-1);i++ ) {
      				temp=temp.next;
      			}
      			// make next of new node = next of tempt
      			new_node.next=temp.next;
      			// make next of tempt node = new node
      			temp.next=new_node ; }
      	//Increase size+1 
    		size++;	
      		}
       //method to delete first node
    public void deletFirst() {
    	
		//make head = second node of list
		head = head.next;
     	
    }
 public void deletLast() {
	//make pointer tempt = head to point to each node in list
		node temp = head;
		// for loop to get to the last node of list
			for(int i = 0 ; i<size;i++ ) {
				temp=temp.next;
			}
			temp.next=null;
			tail=temp;
    }
 	//method to delete node in the mid of list
 public void deletMid(int index) {
	//check if index in range
     if(index> size) {
     	System.out.println("the index is out of range");
     }
	//make pointer tempt = head to point to each node in list
		node temp = head;
		// for loop to get to the index in list
		for(int i = 0 ; i<index;i++ ) {
			temp=temp.next;
		}		
		node dele = temp.next;
		// make next of tempt node = next of delete node
		temp.next=dele.next;
	}
	
    // Method to print the LinkedList.
    public  void printList()
    {
    
        System.out.print("LinkedList: ");
      //make pointer tempt = head to point to each node in list
			node temp = head;
        // Traverse through the LinkedList
        while (temp != null) {
            // Print the data at current node
            System.out.print(temp.data + " ");
            // Go to next node
            temp = temp.next;
        }
    }
}
