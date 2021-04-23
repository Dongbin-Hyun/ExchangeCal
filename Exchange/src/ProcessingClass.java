public class ProcessingClass {
	
	OutputClass outClass = null;
	
	ProcessingClass(){
		outClass = new OutputClass();
	}
	

	int krw50000, krw10000, krw5000, krw1000, krw500, krw100, krw50 ,krw10, krw1;//kind of krw
	
	public int changeUsd (ExchangeType et) {
		int changeUsd = (int)(et.krw / ConstValueClass.usdRate);
		System.out.println(changeUsd);
		return changeUsd;//환전금액
	}
	
	public int changeEuro(ExchangeType et) {
		int changeEuro = (int)(et.krw / ConstValueClass.euroRate);
		return changeEuro;//환전금액
	}
	
	public int changeYen(ExchangeType et) {
		int changeYen = (int)(et.krw / ConstValueClass.yenRate);
		return changeYen;//환전금액
	}
	
	public double exchangeUsd(ExchangeType et) {//A method about exchanging krw to USD

		double usdResult;//Returning USD
		int USD100, USD50, USD20, USD10, USD5, USD2, USD1;//Kind of USD
		//System.out.print("Current currecy rate :");
		usdResult = et.krw / ConstValueClass.usdRate;//USD we get
		et.krwChange = (int)(et.krw - (int)usdResult * ConstValueClass.usdRate);//the remains we get
		USD100 = (int)(usdResult / 100);//The number of USD 100
		USD50 = (int)(usdResult%100 / 50);//The number of USD 50
		USD20 = (int)(usdResult%100%50 / 20);//The number of USD 20
		USD10 = (int)(usdResult%100%50%20 /10);//The number of USD 10
		USD5 = (int)(usdResult%100%50%20%10 / 5);//The number of USD 5
		USD2 = (int)(usdResult%100%50%20%20%10%5 /2);//The number of USD 2
		USD1 = (int)(usdResult%100%50%20%10%5%2 /1);//The number of USD 1
		
		outClass.printUsd(usdResult, USD100, USD50, USD20, USD10, USD5, USD2, USD1);//The number of each USD
		outClass.printKrwChange((int)et.krwChange);//Amount of krwChange
		
		korRemain(et);
		return et.krwChange;

	}

	public double exchangeEuro(ExchangeType et) {
		double eurResult;//euro we get
		int eur200, eur100, eur50, eur20, eur10, eur5, eur2, eur1;//Kind of euro
		//System.out.print("Current currency rate :");
		eurResult = (int)(et.krw / ConstValueClass.euroRate);//euro we get
		et.krwChange = (int)(et.krw - (int)eurResult * ConstValueClass.euroRate);//the remains we get
		eur200 = (int)(eurResult / 200);//The number of 200 euro
		eur100 = (int)(eurResult%200 / 100);//The number of 100 euro
		eur50 = (int)(eurResult%200%100 / 50);//The number of 50 euro
		eur20 = (int)(eurResult%200%100%50 / 20);//The number of 20 euro
		eur10 = (int)(eurResult%200%100%50%20 /10);//The number of 10 euro
		eur5 = (int)(eurResult%200%100%50%20%10 / 5);//The number of 5 euro
		eur2 = (int)(eurResult%200%100%50%20%20%10%5 /2);//The number of 2 euro
		eur1 = (int)(eurResult%200%100%50%20%10%5%2 /1);//The number of 1 euro
		
		outClass.printEuro(eurResult, eur200, eur100, eur50, eur20, eur10, eur5, eur2, eur1);
		outClass.printKrwChange((int)et.krwChange);
		
		korRemain(et);
		return et.krwChange;
	}

	public double exchangeYen(ExchangeType et) {
		double yenResult;
		int yen10000, yen5000, yen2000, yen1000, yen500, yen100, yen50, yen10, yen5, yen1;//Kind of yen
		//System.out.print("Current curreny rate :");
		yenResult = et.krw  / ConstValueClass.yenRate;//yen we get
		et.krwChange = (int)(et.krw - (int)yenResult * ConstValueClass.yenRate);//krw we get
		yen10000 = (int)(yenResult / 10000);//The number of 10000yen
		yen5000 = (int)(yenResult%10000 / 5000);//The number of 5000yen
		yen2000 = (int)(yenResult%1000%5000 / 2000);//The number of 2000yen
		yen1000 = (int)(yenResult%10000%5000%2000 / 1000);//The number of 1000yen
		yen500 = (int)(yenResult%10000%5000%2000%1000 / 500);//The number of 500yen
		yen100 = (int)(yenResult%10000%5000%2000%1000%500 / 100);//The number of 100yen
		yen50 = (int)(yenResult%10000%5000%2000%1000%500%100/ 50);//The number of 50yen
		yen10 = (int)(yenResult%10000%5000%2000%1000%500%100%50 / 10);//The number of 10yen
		yen5 = (int)(yenResult%10000%5000%2000%1000%500%100%50%10 / 5);//The number of 5yen
		yen1 = (int)(yenResult%10000%5000%2000%1000%500%100%50%10%5 / 1);//The number of 1yen

		outClass.printYen(yenResult, yen10000, yen5000, yen2000, yen1000, yen500, yen100, yen50, yen10, yen5, yen1);
		outClass.printKrwChange((int)et.krwChange);
		
		korRemain(et);
		return et.krwChange;

	}

	public void korRemain(ExchangeType et) {
		et.krwChangeResult = (int)et.krwChange;
		krw50000 = et.krwChangeResult / 50000;
		krw10000 = et.krwChangeResult%50000 / 10000;
		krw5000 = et.krwChangeResult%50000%10000 / 5000;
		krw1000 = et.krwChangeResult&50000%10000%5000 / 1000;
		krw500 = et.krwChangeResult%50000%10000%5000%1000 / 500;
		krw100 = et.krwChangeResult%50000%10000%5000%1000%500 /100;
		krw50 = et.krwChangeResult%50000%10000%5000%1000%500%100 / 50;
		krw10 = et.krwChangeResult%50000%10000%5000%1000%500%100%50 / 10;
		krw1 = et.krwChangeResult%50000%10000%5000%1000%500%100%50%10 / 1;

		outClass.printKorRemain(krw50000, krw10000, krw5000, krw1000, krw500, krw100, krw50, krw10, krw1);
		
	}


}
