package Coinler;



public class Coins implements Interface_COIN {
	
	private double deger;
	
	public Coins() 
	{
		this.deger= (Double )Math.random()*10000+1000;
	}
	
	public Coins(double deger)  
	{
		if(deger > 0) this.deger = deger;
		
	}
	public double getDeger() {
		return deger;
	}
	public void setDeger(double deger)  {
		if (deger > 0) this.deger = deger;
		
	}
	@Override
	public  void Deger_Arttır() {
		setDeger(getDeger()+(double)Math.random()*5000+1600);		
	}

	@Override
	public void Değer_Azalt(){
		setDeger(getDeger()-(double)Math.random()*3000+1400);
		
	}

	@Override
	public void Anlık_Fiyat_Göster() {
		System.out.println(getDeger());
	}



}
