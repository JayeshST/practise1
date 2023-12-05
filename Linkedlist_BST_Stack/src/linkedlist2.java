
public class linkedlist2 {

	private Node head;
	
	class Node{
		private int data;
		private Node next;
		
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	
	void display() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
		
	void insert(int newdata) {
		
		Node newnode=new Node(newdata);
		newnode.next=head;
		head=newnode;
		
	}
	
		
public static void main(String[] args) {
	
	linkedlist l1=new linkedlist();
	l1.insert(10);
	l1.display();
	l1.insert(20);
	l1.display();
}
	
	
	
}
