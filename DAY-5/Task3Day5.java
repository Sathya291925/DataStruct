package day1;

public class Task3Day5 {

			Node last;
			
			class Node
			{
				int data;
		        Node next;
		public Node(int num)
				{
					data=num;
			        next=null;
			        
				}}

			public Task3Day5() {
				last=null;
				
				
			}
			
			public void insert(int value)
			{
				Node newnode=new Node(value);
				if(last==null) {
					last=newnode;	
					last.next=newnode;
				}
				else
				{
					newnode.next=last.next;
					last.next=newnode;
				    last=newnode;;
				}
				
			}
			
			public void deleteAtHead() {
				
				Node head=last.next;
				if(last==head) {
					last=null;
				}
				else {
					last.next=head.next;
					
				}
				System.out.println("Deleted node: " + head.data);

				
				
			}
			public void display() {
				Node temp=last.next;
				do{
					System.out.println(temp.data + " ");
					temp=temp.next;
					
				}while(temp!=last.next);
			}
			public static void main(String []args) {
				Task3Day5 t=new Task3Day5();
				t.insert(5);
				t.insert(4);
				t.insert(3);
				t.insert(2);
				t.display();
				System.out.println("After deletion");

				t.deleteAtHead();
				t.display();
				
				
			}


	}
