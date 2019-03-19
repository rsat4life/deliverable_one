package deliverable_one;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String result = "";
		String eventTypeResult = "";
		String partySizeResult;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter the event type: (casual, semi-formal, formal): ");
		String eventType = scnr.nextLine();
		System.out.println("Please enter the number of people attending: ");
		int partySize = scnr.nextInt();
		eventType = eventType.toLowerCase();

		if (eventType.equals("casual")) {
			eventTypeResult = "sandwiches";
		} else if (eventType.equals("semi-formal")) {
			eventTypeResult = "fried chicken";
		} else if (eventType.equals("formal")) {
			eventTypeResult = "chicken parmesan";
		}

		if (partySize == 1) {
			partySizeResult = "in the microwave";
		} else if (partySize < 13) {
			partySizeResult = "in your kitchen";
		} else {
			partySizeResult = "by a caterer";
		}

		result = result + "Since you're hosting a " + eventType + " event for " + partySize
				+ " participant(s), you should serve " + eventTypeResult + " prepared " + partySizeResult + ".";
		System.out.println(result);

	}

}
