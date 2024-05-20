
public class LinkedList 
{
	Node head;
	//ceate a new class Node inside the LinkedList class
	class Node
	{
		String data;
		Node next;
		//Node class create constructor
		Node(String data)
		{
			this.data=data;
			this.next=null;    //create new that's why use null    
		}
	}
	public void addFirst(String data)
	{
		//create object new node
		Node newNode=new Node(data);
		//use if condition head empty or not
		if(head==null)
		{
			//head point new head
			head=newNode;
			return;
			
		}
		//new node object point a next head
		newNode.next=head;
	}
	public void addLst(String data)
	{
		//create object new node
		Node newNode=new Node(data);
		//use if condition head empty or not
		if(head==null)
		{
			//head point object new head
			head=newNode;
			return;
		}
		//currNode point new head
		Node currNode=head;
		while(currNode.next!=null)
		{
			currNode=currNode.next;
		}
		//currNode point newNode
		currNode.next=newNode;
		}
	//print
	public void printList()
	{
		//if condition check head empty or not
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node currNode=head;
		while(currNode!=null)
		{
			System.out.print(currNode.data+"-->");
			currNode=currNode.next;
		}
			System.out.println();
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addFirst("java");
		list.printList();
		list.addFirst("Hello");
		list.printList();
		list.addLst("open");
	//	list.printList();
		
		list.addLst("eclipce");
		list.printList();
	}

}
