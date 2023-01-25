package Coinler;

public class Doge extends Coins {
	public Doge() 
	{
		setDeger((double)Math.random()*10000+4000);
	}
	
	public Doge(double deger) 
	{
		if(deger > 0) setDeger(deger);;
		
	}
}
