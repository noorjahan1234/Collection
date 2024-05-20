package com.LinkedList;

public class LinkedList {

	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public void addFirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			//check head and node equals
			head=newNode;
			return;
		}
		newNode.next=head;
	}
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			//check head and node equals
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null)
		{
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
	public void printList()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		Node currNode=head;
		while(currNode!=null)
		{
			System.out.print(currNode.data +"-->");
			currNode=currNode.next;
		}
		System.out.println(" Null");
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.addFirst(9);
		list.addFirst(6);
		//list.printList();
		list.addLast(7);
		list.printList();
		list.addLast(5);
		list.printList();
	}

}
