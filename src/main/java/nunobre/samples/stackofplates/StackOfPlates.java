package nunobre.samples.stackofplates;

import java.io.Console;

import nunobre.samples.command.Command;
import nunobre.samples.command.PopCommand;
import nunobre.samples.command.PrintCommand;
import nunobre.samples.command.PushCommand;
import nunobre.samples.command.TopCommand;
import nunobre.samples.stack.Stack;

public class StackOfPlates {

	private static StackOfPlates instance = null;

	public Stack stack;

	public StackOfPlates() {
		this.stack = new Stack();
	}

	public static StackOfPlates getInstance() {
		if (instance == null)
			instance = new StackOfPlates();

		return instance;

	}

	public static void printBanner() {
		System.out.println("===========================");
		System.out.println("===== Stack of Plates =====");
		System.out.println("===========================");
	}

	public static void printOptions() {
		System.out.println("Select an option:");
		System.out.println("1 - view stack");
		System.out.println("2 - push element");
		System.out.println("3 - pop element");
		System.out.println("4 - view first element");
		System.out.println("0 - quit");
		System.out.println("other - view option");
	}

	public static void main(String[] args) {

		printBanner();
		printOptions();

		Console console = System.console();

		String text = "0";

		do {

			text = console.readLine("input option: ");
			
			System.out.println("selected " + text + "'");

			Command command;
			
			switch (text) {

			case "0":
				System.out.println("bye");
				break;

			case "1": // 1 - view stack
				command = new PrintCommand();
				command.execute();

				break;
			case "2": // 2 - push element");
				String newElement = console.readLine("input new element name: ");
				command = new PushCommand(newElement);
				command.execute();
				
				break;
			case "3": // 3 - pop element
				command = new PopCommand();
				command.execute();

				break;
			case "4": // 4 - view first element
				command = new TopCommand();
				command.execute();
				
				break;
			default:
				printOptions();
				break;
			}

		} while (text.equals("0") == false);

	}

}
