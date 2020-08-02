package nunobre.samples.command;

import nunobre.samples.stackofplates.StackOfPlates;

public class TopCommand implements Command {

	private StackOfPlates stackOfPlates;
	
	public TopCommand() {
		stackOfPlates = StackOfPlates.getInstance();
	}
	
	@Override
	public void execute() {
		
		try {
			Object element = stackOfPlates.stack.top();
			System.out.println("Top element '" + element + "'");
		} catch (Exception e) {
			System.out.println("Empty. Nothing in stack.");
		}
		
		
	}

}
