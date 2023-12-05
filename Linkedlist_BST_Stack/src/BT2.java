
public class BT2 {

	private Node root;
	
	 static class Node{
		private int data;
		private Node left,right;
	
	 public Node(int data) {
		 this.data=data;
		 left=right=null;
	 }
	 
	 }
	 
	 BT2(){
		 root=null;
	 }
	
	 BT2(int data){
		 root=new Node(data);
	 }
	 
	 public static void main(String[] args) {
		
	BT2 b1=new BT2();
	b1.root=new Node(10);
	b1.root.left=new Node(5);
	b1.root.right=new Node(40);
		 
		 
	}
	 
	 
	
}
