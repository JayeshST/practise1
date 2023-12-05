
public class BST2 {

	private Node root;
	
	static class Node{
		private int data;
		private Node left,right;
		
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	
	
	BST2(){
		root=null;
	}
	
	BST2(int data){
		root=new Node(data);
	}
	
	
	void printpreorder(Node root) {
		if(root==null)
			return;
		System.out.println(root.data);
		printpreorder(root.left);
		printpreorder(root.right);
	}
	
	void printinorder(Node root) {
		if(root==null)
			return ;
		
		printinorder(root.left);
		if(root==null)
			return ;
		System.out.println(root.data);
		printinorder(root.right);
	}
	
	
	void printpostorder(Node root)
	{  if(root==null)
		return;
		printpostorder(root.left);
		printpostorder(root.right);
		System.out.println(root.data);
	}
	
	void preorder() {
		printpreorder(root);
	}
		
		
		void inorder() {
			printinorder(root);
		}
		
		void postorder() {
			printpostorder(root);
		}
		
		
		
		public static void main(String[] args) {
			
			BST2 b1=new BST2();
			b1.root=new Node(50);
			b1.root.left=new Node(40);
			b1.root.left.left=new Node(30);
			b1.root.right=new Node(60);
			b1.root.right.right=new Node(70);
			

			
			System.out.println("Preorder");
			b1.preorder();
			System.out.println("Inorder");
			b1.inorder();
			System.out.println("Postorder");
			b1.postorder();
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	
	
	
}
