package Coinler;

public class Btc extends Coins{
	public class Btc_V2 extends Coins
	{
		public Btc_V2() 
		{
			setDeger((double)Math.random()*20000+10000);
		}
		public Btc_V2(double deger) 
		{
			if(deger > 0) setDeger(deger);;
			
		}
	}
	
	public Btc() 
	{
		setDeger((double)Math.random()*20000+10000);
	}
	
	public Btc(double deger) 
	{
		if(deger > 0) setDeger(deger);;
		
	}
}
