package nunobre.samples.command;

import nunobre.samples.stackofplates.StackOfPlates;

public class PushCommand implements Command {

	private StackOfPlates stackOfPlates;
	
	private Object object;
	
	public PushCommand(Object object) {
		stackOfPlates = StackOfPlates.getInstance();
		this.object = object;
	}
	
	@Override
	public void execute() {
		
		System.out.println("Pushing '" + object + "'");
		
		stackOfPlates.stack.push(object);
		
	}

}
