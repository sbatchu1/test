package com.java.lists;

public class ReverseSinglyLinkedList {
	private static Node head;
	
	public static void main(String[] args){
		ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		
		System.out.println("List before reverse");
		list.printList(head);
		System.out.println("After reverse");
	//	head = list.reverse(head);
		list.recursiveReverse(head);
		//list.printList(head);
	}

	private Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		head = prev;
		return head;
	}
	
	private void recursiveReverse(Node head){
		if(head.next != null)
		{
			recursiveReverse(head.next);
		}
		System.out.println(head.data);
	}
	
	   void printList(Node node) {
	        while (node != null) {
	            System.out.println(node.data + " ");
	            node = node.next;
	        }
	    }

}

class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data = d;
		this.next = null;
	}
}
