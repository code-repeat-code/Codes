//reverse the linked list
// strt --> [1 -> 2  ->  3 | null] start-->3 -->2-->1 ->null
class Reverselinkedlist
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
	Node head = null,tail =null;
	void addNode(int data)
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
	void display()
	{
		Node current = head;
		Node nxt=null,pre=null;
		if(head == null)
		{
			System.out.print("Empty");
			return ;
		}
		
		else
		{
			while(current!=null)//logic to reversee the linked list through nrmal iterations
			{
				nxt = current.next;
				current.next = pre;
				pre = current;
				current = nxt;
			}
			head = pre;
			Node current1 = head;
		while(current1!=null)
		{
			System.out.print(current1.data+" ");
			current1 = current1.next;
		}
	
     	}
	}	
public static void main(String a[])
	{
		Reverselinkedlist lst = new Reverselinkedlist();
		//invoke the addNode function to add the data
		lst.addNode(10);
		lst.addNode(20);
		lst.addNode(30);
		lst.addNode(40);
		lst.addNode(50);
		//just display the list 
		lst.display();
	}
}
	