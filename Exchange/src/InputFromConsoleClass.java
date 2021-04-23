

import java.util.Scanner;

public class InputFromConsoleClass {
	public static Scanner scanner = new Scanner(System.in);
	public void InputFromConsoleClass() {
		scanner = new Scanner(System.in);	
	}
	
	public void inputKrw(ExchangeType et) {
		System.out.print("Input KRW : ");
		et.krw = scanner.nextInt();
	}
	
	public void inputChoice(ExchangeType et) {
		System.out.print("Which do you want : 0.Exit 1.USD 2.EURO 3.YEN ");
		et.choice = scanner.nextInt();
	}
	

}
	

