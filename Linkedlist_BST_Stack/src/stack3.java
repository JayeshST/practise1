
public class stack3  <T>{

	private T[]arr;
	private int size;
	private int top;
	
	
	public stack3(int size) {
		this.size=size;
		top=-1;
		arr=(T[])new Object[size];
	}
	
	public  boolean isempty() {
		return top==-1;
	}
	
	public boolean isfull() {
		return top==size-1;
	}
	

	
public boolean push(T data) {
	if(isfull()) {
		return false;
	}
	arr[++top]=data;
	return true;
}
	
public T pop() {
	if(isempty()) {
		return null;
	}
	return arr[top--];
}



public static void main(String[] args) {
	
	
	stack3 <Integer> s1=new stack3<Integer>(4);
	s1.push(10);
	s1.push(20);
	s1.push(30);
	s1.push(40);
	s1.push(50);
	
	System.out.println(s1.pop());
	System.out.println(s1.pop());
	System.out.println(s1.pop());
	System.out.println(s1.pop());
	System.out.println(s1.pop());

	
	
}






}
