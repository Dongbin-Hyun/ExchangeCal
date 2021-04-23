

public class OutputClass {

	public void printUsd(double usdResult, int usd100, int usd50, int usd20, int usd10, int usd5, int usd2, int usd1) {
		System.out.println("exchnaged usd : " + (int)usdResult + "usd");//Printing the usd we get
		System.out.println("--------------------------------------");
		System.out.println("100 - " + usd100);//100usd
		System.out.println("50 - " + usd50);//50usd
		System.out.println("20 - " + usd20);//20usd
		System.out.println("10 - " + usd10);//10usd
		System.out.println("5 - " + usd5);//5usd
		System.out.println("2 - " + usd2);//2usd
		System.out.println("1 - " + usd1);//1usd
	}
	
	public void printEuro(double euroResult, int eur200, int eur100, int eur50, int eur20, int eur10, int eur5, int eur2, int eur1) {
		System.out.println("exchaged euro : " + (int)euroResult + "euro");//printing the euro we get
		System.out.println("--------------------------------------");
		System.out.println("200 - " + eur200);//200eur
		System.out.println("100 - " + eur100);//100eur
		System.out.println("50 - " + eur50);//50eur
		System.out.println("20 - " + eur20);//20eur
		System.out.println("10 - " + eur10);//10eur
		System.out.println("5 - " + eur5);//5eur
		System.out.println("2 - " + eur2);//2eur
		System.out.println("1 - " + eur1);//1eur
	}
	
	public void printYen(double yenResult, int yen10000, int yen5000, int yen2000, int yen1000, int yen500, int yen100, int yen50, int yen10, int yen5, int yen1) {
		System.out.println("exchaged yen : " + (int)yenResult + "yen");
		System.out.println("--------------------------------------");
		System.out.println("10000 - " + yen10000);//10000yen
		System.out.println("5000 - " + yen5000);//5000yen
		System.out.println("2000 - " + yen2000);//2000yen
		System.out.println("1000 - " + yen1000);//1000yen
		System.out.println("500 - " + yen500);//500yen
		System.out.println("100 - " + yen100);//100yen
		System.out.println("50 - " + yen50);//50yen
		System.out.println("10 - " + yen10);//10yen
		System.out.println("5 - " + yen5);//5yen
		System.out.println("1 - " + yen1);//1yen
	}
	
	public void printKrwChange(int krwChange) {
		System.out.println("--------------------------------------");
		System.out.println("remains : " + (int)krwChange + "won");//the remains
	}
	
	public void printKorRemain(int krw50000, int krw10000, int krw5000, int krw1000, int krw500, int krw100, int krw50, int krw10, int krw1) {
		System.out.println("--------------------------------------");
		System.out.println("50000 - " + krw50000);//50000krw
		System.out.println("10000 - " + krw10000);//10000krw
		System.out.println("5000 - " + krw5000);//5000krw
		System.out.println("1000 - " + krw1000);//1000krw
		System.out.println("500 - " + krw500);//500krw
		System.out.println("100 - " + krw100);//100krw
		System.out.println("50 - " + krw50);//50krw
		System.out.println("10 - " + krw10);//10krw
		System.out.println("1 - " + krw1);//1krw

	}
	
}
