package com.wipro.eb.entity;

public class Commercial  extends Connection{
	public Commercial(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
	public float computeBill()
	{
		float units=currentReading-previousReading;
		float billpay=0;
		double amount=0;
		
		if(units<50)
		{
			billpay=units*slabs[0];
		}
		else if(units<100)
		{
			billpay=(50*slabs[0]+(units-50)*slabs[1]);
		}
		else
		{
			billpay=(50*slabs[0]+50*slabs[1]+(units-100)*slabs[2]);
		}
		if(billpay>=10000)
			amount=(billpay+billpay*0.09);
		else if(billpay>=5000)
			amount=(billpay+billpay*0.06);
		else
			amount=(billpay+billpay*0.02);
		return (float)amount;
	}
}
