package Coinler;

public class Shib extends Coins{
	public Shib() 
	{
		setDeger((double)Math.random()*5000+1000);
	}
	
	public Shib(double deger) 
	{
		if(deger > 0) setDeger(deger);;
		
	}
}
