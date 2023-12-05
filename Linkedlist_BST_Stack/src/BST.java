
public class BST {

	
	
	private Node root;
	
	static class Node{
		private int data;
		Node left,right;
		
		
		Node (int data){
			this.data=data;
			left=right=null;
		}
		
	}
	
	BST(){
		root=null;
	}
	
	BST(int data){
		root=new Node(data);
	}
	
	//preorder
	void printpreorder(Node root) {
		if(root==null)
			return ;
		System.out.println(root.data);
		printpreorder(root.left);
		printpreorder(root.right);
	}
	//inorder
	void printinorder(Node root) {
		if(root==null)
			return ;
		printinorder(root.left);
		System.out.println(root.data);
		printinorder(root.right);
	}
	
	
	//postorder
	void printpostorder(Node root) {
		if(root==null)
			return ;
		printpostorder(root.left);
		printpostorder(root.right);
		System.out.println(root.data);
	}
	
	
	//for call
	
	
	void preorder() {
		printpreorder(root);
	}
	
	
	
	void inorder() {
		printinorder(root);
	}
	
	void postorder() {
		printinorder(root);
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		BST b1=new BST();
		b1.root=new Node(50);
		b1.root.left=new Node(40);
		b1.root.left.left=new Node(30);
		b1.root.right=new Node(60);
		b1.root.right.right=new Node(70);
		
		
		
		
		
		System.out.println("preorder");
		b1.preorder();
		
		System.out.println("inorder");
		b1.inorder();

		System.out.println("postorder");
		b1.postorder();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
