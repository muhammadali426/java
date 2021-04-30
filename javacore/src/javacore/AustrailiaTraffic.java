package javacore;

import interfaceDemo.CentralTraffic;
import interfaceDemo.ContinentalTraffic;

public class AustrailiaTraffic implements CentralTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CentralTraffic a =new AustrailiaTraffic();


a.greenGo();
	
a.redStop();
a.flashYellow();
	
AustrailiaTraffic at =new AustrailiaTraffic();

at.walkOnSymbol();

ContinentalTraffic ct =new AustrailiaTraffic();

ct.Trainsymbol();
	}
	
	public void walkOnSymbol()
	{
		System.out.println("Walking");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green GO Implemetation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop Implemetation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Flash Implemetation");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol Implementation");
		
		
	}

}
