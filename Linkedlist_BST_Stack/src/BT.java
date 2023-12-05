
public class BT {

private Node root;
static class Node{
	
	private int data;
	Node left,right;

	
	Node (int data){
		this.data=data;
		left=right=null;
	}
}
BT(){
	root=null;
}

BT(int data){
	root=new Node(data);
}


public static void main(String[] args) {
	
	BT b1=new BT();
	b1.root=new Node(10);
	b1.root.left=new Node(20);
	b1.root.right=new Node(30);
	b1.root.right.right=new Node(40);
	
	
	
}

}
