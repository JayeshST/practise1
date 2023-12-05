
public class BT1 {

	
	private Node root;
	
	static class Node{
		
		private int data;
		Node left,right;
		Node (int data){
			this.data=data;
			left=right=null;
		}
	}
	
	BT1(){
		root=null;
	}
	
	BT1(int data){
		root=new Node(data);
	}
	
	public static void main(String[] args) {
		
		BT1 b1=new BT1();
		b1.root=new Node(30);
		b1.root.left=new Node(20);
		b1.root.right=new Node(40);
		b1.root.left.left=new Node(28);
		
		
	}
	
	
	
	
	
	
	
	
}
