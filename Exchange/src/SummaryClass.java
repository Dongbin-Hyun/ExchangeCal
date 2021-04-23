import java.io.IOException;

public class SummaryClass {

	public void  summary() throws IOException {
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();

		FileWriteClass fwc = new FileWriteClass();

		ExchangeType et;		

		fwc.headerWrite();

		while (true){
			et = new ExchangeType();

			inputConsole.inputKrw(et);
			inputConsole.inputChoice(et);

			if (et.choice == ConstValueClass.exitGo) {
				System.out.println("Exit");
				break;

			} else if (et.choice == ConstValueClass.usdExchange) {
				
				fwc.dataWrite("usd", et.krw, pc.changeUsd(et) , pc.exchangeUsd(et));

			} else if (et.choice == ConstValueClass.euroExchange) {
				fwc.dataWrite("euro", et.krw, pc.changeEuro(et) , pc.exchangeEuro(et));

			} else if (et.choice == ConstValueClass.yenExchange) {
				fwc.dataWrite("yen", et.krw, pc.changeYen(et) , pc.exchangeYen(et));

			} else {
				System.out.println("ERROR : input the number from 0 to 3");
			}
		} 
		fwc.fileClose();
	}
}


