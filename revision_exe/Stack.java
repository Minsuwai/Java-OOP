/*
 * A stack holds and store items using a first in last out policy.
 * Items are stored in Stack using content holding structure such as arrays.
 * They are added into a stack is not full (i.e. pushed).
 * The last item pushed into the stack shall be the first item to be removed (i.e. popped).
 * The popped operation is only successful if there is at least an item in the stack (i.e. the stack is not empty) 
 * Conversely, an item can only be pushed into a stack if the stack is not full. 
 * Write a java class stack which represent the above stack operation.
 * Write a user class that insert 10 numbers and print all numbers popped from the stack. 
 */



package revision_exe;

public class Stack {

	int Arr[] = new int [5];
	int top = 0;
	
	// method
	public void pushed(int item) {		
	
		if(!isFull())
			Arr[top++] = item;
		else
			System.out.println("Stack is Full");
	}
	
	public int pop() {
		
		return Arr[--top];
			
	}
	
	public boolean isFull() { // if (top==n) ==> overflow
		
		if (Arr.length == top) { 
			return true;
		}
		else
			return false;
	}
	
	public boolean isEmpty() { // if (top==0) ==> underflow
		
		if (top == 0) {
			return true;
		}
		else
			return false;
	}
}
