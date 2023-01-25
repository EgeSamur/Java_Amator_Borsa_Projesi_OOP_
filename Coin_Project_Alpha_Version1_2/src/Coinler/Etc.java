package Coinler;

public class Etc extends Coins{
	public Etc() 
	{
		setDeger((double)Math.random()*20000+10000);
	}
	
	public Etc(double deger) 
	{
		if(deger > 0) setDeger(deger);;
		
	}
}
