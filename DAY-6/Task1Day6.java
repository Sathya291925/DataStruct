package day1;

public class Task1Day6 {
	int top=-1;
	int stack[]=new int[5];

	
	public void push(int num) {

		
		if(top == 5) {
			System.out.println("Stack overflow");
		}
		else
		{
			stack[++top]=num;
			}
		}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else {
			top--;
		}
		
		
	}
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
		
		
		
	}
	public static void main(String []args) {
		Task1Day6 t=new Task1Day6();
		t.push(3);
		t.push(4);
		t.push(5);
		t.display();
		System.out.println("After pop");
		t.pop();
		t.display();
	}

}
