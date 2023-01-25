package Wallets;

import Coinler.Coins;

public class Cüzdan implements Interface_Cüzdan{
	private  static double para; // coine çevrilebilir para.
	private  static double total_coin_sayi;
	private static double toplam_varlık; // para + coinler değeri.
	private static double Btc_sayi;
	private static double Btc_V2_sayi;
	private static double Etc_sayi;
	private static double Doge_sayi;
	private static double Shib_sayi;
	
	public static double getBtc_V2_sayi() {
		return Btc_V2_sayi;
	}

	public static void setBtc_V2_sayi(double btc_V2_sayi) {
		Btc_V2_sayi = btc_V2_sayi;
	}
	
	public static double getPara() {
		return para;
	}

	public static void setPara(double para) {
		Cüzdan.para = para;
	}

	public static double getTotal_coin_sayi() {
		return total_coin_sayi;
	}

	public static void setTotal_coin_sayi(double total_coin_sayi) {
		Cüzdan.total_coin_sayi = total_coin_sayi;
	}

	public static double getToplam_varlık() {
		return toplam_varlık;
	}

	public static void setToplam_varlık(double toplam_varlık) {
		Cüzdan.toplam_varlık = toplam_varlık;
	}

	public static double getBtc_sayi() {
		return Btc_sayi;
	}

	public static void setBtc_sayi(double btc_sayi) {
		Btc_sayi = btc_sayi;
	}

	public static double getEtc_sayi() {
		return Etc_sayi;
	}

	public static void setEtc_sayi(double etc_sayi) {
		Etc_sayi = etc_sayi;
	}

	public static double getDoge_sayi() {
		return Doge_sayi;
	}

	public static void setDoge_sayi(double doge_sayi) {
		Doge_sayi = doge_sayi;
	}

	public static double getShib_sayi() {
		return Shib_sayi;
	}

	public static void setShib_sayi(double shib_sayi) {
		Shib_sayi = shib_sayi;
	}

	public Cüzdan(double eklenen_para)
	{
		setPara(getPara()+eklenen_para);
	}
	public Cüzdan(int eklenen_para)
	{
		setPara(getPara()+eklenen_para);
	}
	public Cüzdan()
	{
	}
	
	
	
	
	@Override
	public void Para_Ekle(double eklenecek_para) {
		//Miktarı double olarak girerse
		setPara(getPara()+eklenecek_para);
		
	}

	@Override
	public void Para_Ekle(int eklenecek_para) {
		// Miktarı İnt Olarak Gİrerse.
		setPara(getPara()+eklenecek_para);
	}

	@Override
	public void Btc_Ekle(double miktar) {
		setBtc_sayi(getBtc_sayi()+miktar);
		//Btc Eklendiğinde total Coin Sayısı da Artmalı ondan dolayı böyle bir yola başvurduk.
		setTotal_coin_sayi(getTotal_coin_sayi()+getBtc_sayi());
		
	}
	public void Btc_V2_Ekle(double miktar) {
		setBtc_V2_sayi(getBtc_V2_sayi()+miktar);
		//Btc Eklendiğinde total Coin Sayısı da Artmalı ondan dolayı böyle bir yola başvurduk.
		setTotal_coin_sayi(getTotal_coin_sayi()+getBtc_V2_sayi());
	}

	@Override
	public void Btc_Cıkar(double miktar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Etc_Ekle(double miktar) {
		setEtc_sayi(getEtc_sayi()+miktar);
		//Etc Eklendiğinde total Coin Sayısı da Artmalı ondan dolayı böyle bir yola başvurduk.
		setTotal_coin_sayi(getTotal_coin_sayi()+getEtc_sayi());
	}

	@Override
	public void Etc_Cıkar(double miktar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Doge_Ekle(double miktar) {
		setDoge_sayi(getDoge_sayi()+miktar);
		//Doge Eklendiğinde total Coin Sayısı da Artmalı ondan dolayı böyle bir yola başvurduk.
		setTotal_coin_sayi(getTotal_coin_sayi()+getDoge_sayi());
	}

	@Override
	public void Doge_Cıkar(double miktar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Shib_Ekle(double miktar) {
		setShib_sayi(getShib_sayi()+miktar);
		//Shib Eklendiğinde total Coin Sayısı da Artmalı ondan dolayı böyle bir yola başvurduk.
		setTotal_coin_sayi(getTotal_coin_sayi()+getShib_sayi());
	}

	@Override
	public void Shib_Cıkar(double miktar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Varlık_Göster() {
		System.out.println("Hesap Bakiyesi: "+getPara()+"\nBtc Sayısı: "+getBtc_sayi()+"\nBtc V2.0 Sayısı: "+getBtc_V2_sayi()+"\nEtc Sayısı: "+getEtc_sayi()+"\nDoge Sayısı: "+getDoge_sayi()+"\nShib Sayısı: "+getShib_sayi()+"\nToplam Coin Sayısı: "+getTotal_coin_sayi()+"\nToplam Varlık: "+getToplam_varlık());

		
	}

}
