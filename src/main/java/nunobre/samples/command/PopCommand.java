package nunobre.samples.command;

import nunobre.samples.stackofplates.StackOfPlates;

public class PopCommand implements Command {

	private StackOfPlates stackOfPlates;
	
	public PopCommand() {
		stackOfPlates = StackOfPlates.getInstance();
	}
	
	@Override
	public void execute() {
		
		
		try {
			Object element = stackOfPlates.stack.pop();
			System.out.println("Poped '" + element + "'");
		} catch (Exception e) {
			System.out.println("Empty. Nothing to remove.");
		}
		
		
	}

}
