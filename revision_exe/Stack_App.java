package revision_exe;

public class Stack_App {
   
	public static void main(String[] args) {
		
		Stack stack_1 = new Stack();
		
		stack_1.pushed(10);
		stack_1.pushed(20);
		stack_1.pushed(30);
		stack_1.pushed(40);
		stack_1.pushed(50);
		stack_1.pushed(60);
		
		while(!stack_1.isEmpty()) {
			System.out.println(stack_1.pop());
		}
		
//		while(!stack_1.isEmpty()) {
//			if(stack_1<4) {
//				System.out.println(stack_1.pop());
//			}
//			
//		}

	}

}
