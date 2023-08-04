package com;

class ATM
{
	double money;  //state
	ATM(double money)
	{
		this.money=money;
	}
	public void withdraw()//behavior
	{
		System.out.println("you can withdraw");
	}
}

public class SBI {

	public static void main(String[] args) {
		ATM ref=new ATM(5000);
		System.out.println("Money:" +ref.money);
		ref.withdraw();
	}

}


