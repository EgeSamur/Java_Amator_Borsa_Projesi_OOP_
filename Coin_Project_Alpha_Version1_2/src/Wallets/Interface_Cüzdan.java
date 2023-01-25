package Wallets;

public interface Interface_Cüzdan {
	public void Para_Ekle(double eklenecek_para);
	public void Para_Ekle(int eklenecek_para);
	public void Btc_Ekle(double miktar);
	public void Btc_Cıkar(double miktar);
	public void Etc_Ekle(double miktar);
	public void Etc_Cıkar(double miktar);
	public void Doge_Ekle(double miktar);
	public void Doge_Cıkar(double miktar);
	public void Shib_Ekle(double miktar);
	public void Shib_Cıkar(double miktar);
	public void Varlık_Göster();
}
