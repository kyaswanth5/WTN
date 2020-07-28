package com.wipro.eb.entity;

public class Domestic extends Connection {
	public Domestic(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
	public float computeBill()
	{
		int units=currentReading-previousReading;
		double billpay=0;
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
		return (float)billpay;
}
}
