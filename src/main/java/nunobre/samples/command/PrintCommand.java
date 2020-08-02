package nunobre.samples.command;

import nunobre.samples.stackofplates.StackOfPlates;

public class PrintCommand implements Command {

	private StackOfPlates stackOfPlates;
	
	public PrintCommand() {
		stackOfPlates = StackOfPlates.getInstance();
	}
	
	@Override
	public void execute() {
		stackOfPlates.stack.print();
		
	}

}
