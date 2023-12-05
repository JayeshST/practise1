

public class BST3 {

private Node root;

static class Node{
	private int data;
	private Node left,right;
	
	
public Node(int data) {
	this.data=data;
	left=right=null;
}
	
}
	

BST3(){
	root=null;
}


BST3(int data){
	root=new Node(data);
}


void printpreorder(Node root) {
	if(root==null)
		return ;
	System.out.println(root.data);
	printpreorder(root.left);
	printpreorder(root.right);
}


void printinorder(Node root) {
	if(root==null)
		return;
	printinorder(root.left);
	System.out.println(root.data);
	printinorder(root.right);
	
}


void printpostorder(Node root) {
	if(root==null)
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


Node insertdata(Node root,int key) {
	if(root==null) {
		root=new Node(key);
		return root;
	}
	if(key<=root.data) {
		root.left=insertdata(root.left, key);
	}
	else
		root.right=insertdata(root.right, key);
	return root;
	
}


void insert(int key) {
	root=insertdata(root, key);
}


public static void main(String[] args) {
	
	
	BST3  b1 = new BST3();
	 b1.insert(11);
	 b1.insert(12);
	 b1.insert(13);
	 b1.insert(14);
	 b1.insert(15);
	 b1.insert(16);
	 b1.insert(17);
	 b1.insert(18);
	 
	 System.out.println("preorder");
	 b1.preorder();
     System.out.println("inorder");
     b1.inorder();

     System.out.println("Postorder");
     b1.postorder();

}






	
}
