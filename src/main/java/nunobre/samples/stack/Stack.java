package nunobre.samples.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.EmptyStackException;

public class Stack {
	
	List<Object> stack;
	
	public Stack() {
		stack = new ArrayList<Object>();
	}

	public void push(Object object) {
		
		stack.add(object);
	}
	
	public Object pop() throws EmptyStackException {
		
		Object topElement = top();				
		
		stack.remove(topElement);
		
		return topElement;
	}
	
	public Object top() throws EmptyStackException {
		
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		return stack.get(stack.size()-1);
	}
	
	public Boolean isEmpty() {
		
		return stack.isEmpty();
	}
	
	public void print() {
		
		System.out.println("current stack content:");
		
		if (isEmpty())
			System.out.println("(empty)");
		
		for (int i = stack.size(); i > 0; i--) {
			System.out.println(stack.get(i-1));
		}
		
		
	}
	
	
	
}
