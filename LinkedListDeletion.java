//Linked list deletion
import java.util.*;
class LinkedListDeletion
{
	class Node
	{
		int data;
		Node next = null;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
		//declare the attributes of the Node class like head and tail
		//initially both will point to the null
		Node head = null,tail=null;
		//create a function the add the nodes in the linked list
		public void addNode(int data)
		{
			Node newnode = new Node(data);
			if(head == null)
			{
				head = newnode;
				tail = newnode;
			}
			else
			{
				tail.next = newnode;
				tail = newnode;
			}
		}
		//display the nodes
		void display()
		{
			Node current = head;
			if(head == null)
			{
				System.out.print("Empty");
				return ;
			}
			System.out.print("The linked list is ::");
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current = current.next;
			}
		}
		//Deletion of the node from the first position
		public void deleteFirst()
		{
		  head = head.next;
		}
		//Deletion of the Node from the last position
		public void deleteLast()
		{
			Node prev = head;
			while(prev.next != tail)
			{
				prev = 	prev.next;
			}
			prev.next = null;
			tail = prev;
		}
		//Deletion of the Node from the specified position 
		public void deleteSpecified(int position)
		{
			int i = 1;
			Node prev = head;
			Node current = head;
			if(position == 1)
			{
				deleteFirst();
			}
			else
			{	
				while(i<position)
				{
					i++;
					prev = current;
					current = prev.next;
				}
				prev.next = current.next;
			}
		}
		public static void main(String args[])
		{
			LinkedListDeletion lst = new LinkedListDeletion();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of number nodes to be in a list:: ");
			int n = sc.nextInt();
			int ele;
			for(int i = 1;i<=n;i++)
			{
				System.out.println("Enter data for node "+i+" ::");
				ele = sc.nextInt();
				lst.addNode(ele);
			}
			
			int c;
			do
			{
				System.out.println("Choose any operation to perform the deletion::");
				System.out.println("1 - Delete Node from 1st Position "+"\n2 - Delete Node from last Position "+"\n3 - Delete Node from Specified Position"+"\n4 - Display the Linked List");
				int option = sc.nextInt();
				switch(option)
				{
					case 1:
					lst.deleteFirst();
					System.out.println("Node Deleted Successfully");
					break;
					case 2:
					lst.deleteLast();
					System.out.println("Node Deleted Successfully");
					break;
					case 3:
					System.out.println("Enter the postion");
					int p = sc.nextInt();
					lst.deleteSpecified(p);
					System.out.println("Node Deleted Successfully");
					break;
					case 4:
					lst.display();
					break;
					default : System.out.println("Please choose Right option");
				}
				System.out.println("\nDo you contiue if YES press 1 if NO press NO");
				c = sc.nextInt();
			}
			while(c==1);

		}
}
	