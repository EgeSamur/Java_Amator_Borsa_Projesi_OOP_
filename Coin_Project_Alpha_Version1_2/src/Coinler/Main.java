package Coinler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import Exceptionss.Gecersiz_Islem;
import Exceptionss.Sıfırdan_Kücük_Hatası;
import Exceptionss.Yetersiz_Bakiye_Hatası;
import Wallets.Cüzdan;

public class Main {

	public static void main(String[] args) {
		//Nesnelerin Oluşturulma Kısmı.
		Scanner scanner = new Scanner(System.in);
		Cüzdan cüzdan = new Cüzdan(); // cüzdan sınıfından nesne Türettik.
		Btc btc1 = new Btc(); // Btc sınıfından nesne Türettik.
		Btc.Btc_V2 btc_V2 = btc1.new Btc_V2(); // Btc_v2 sınıfından nesne Türettik. inner class olduğu için btc nesneli ile ulatık.
		Etc etc = new Etc();
		Doge doge = new Doge(1500); // new Doge(); olarak oluştursak random değer atar üsttekiler gibi.
		Shib shib =new Shib();
		//*************************************
		
		
		System.out.println("*****************Anlık Hesap Bilgileriniz*****************");
		cüzdan.Varlık_Göster();
		int secim =0;
		double miktar =0;
		try 
		{
			//Sistemin Başlamaşı İçin Öncelikle Cüzdana Para Eklememiz Lazım.
			System.out.println("Cüzdana Eklenecek Para Miktarını Giriniz: ");
			double cüzdana_Eklenecek_Para = scanner.nextDouble();
			if(cüzdana_Eklenecek_Para<=0)
			{
				throw new Sıfırdan_Kücük_Hatası();
			}
			cüzdan.Para_Ekle(cüzdana_Eklenecek_Para); // cüzdan.paraekle(int eklenecekpara) da kullanılabilir overload.
			//*****************************************
			while(cüzdan.getPara()>0)
			{
				// Sistemde Hangi Coin'den Kaç tane Alıcağımızı Seçiceğimiz Bölüm.
				System.out.println("******İşlem******");
				System.out.print("Hangi Coin'i Almak İstediğinizi Seçiniz\n1.Btc   "+btc1.getDeger()+"$\n2.Btc V2.0   "+btc_V2.getDeger()+
						"$\n3.Etc   "+etc.getDeger()+"$\n4.Doge   "+doge.getDeger()+"$\n5.Shib   "+shib.getDeger()+"\n(Çıkmak İçin 6): ");	
				secim= scanner.nextInt();					
				if(secim<6&&secim>0) 
				{
					System.out.print("Kaç Tane Almak İstediğinizi Giriniz: ");
					miktar=scanner.nextDouble();
						
				}
				else if(secim>6) throw new Gecersiz_Islem();
				satın_Alma(secim,miktar);
				System.out.println("*****************Anlık Hesap Bilgileriniz*****************");
				cüzdan.Varlık_Göster();
			}
			
		} 
		
		//Hataların Yakalandığı Bölüm.
		catch(Gecersiz_Islem e)
		{
			System.out.println("Geçersiz Komut Girdiniz.");
		}
		catch (Sıfırdan_Kücük_Hatası e) {
			System.out.println("Cüzdana 0'dan Büyük Miktarda Para Eklemelisiniz.!");
		}
		catch (Yetersiz_Bakiye_Hatası e)
		{
			System.out.println("Cüzdanınızda Yeterli Bakiye Bulunmamaktadır.");
		}
		
		catch (Exception e) 
		{
			
		}
		//*******************************
	}
	
	private static void satın_Alma(int secim, double miktar) throws Yetersiz_Bakiye_Hatası {
		Cüzdan cüzdan2 = new Cüzdan(); // cüzdan sınıfından nesne Türettik.
		Btc btc2 = new Btc(); // Btc sınıfından nesne Türettik.
		Btc.Btc_V2 btc2_V2 = btc2.new Btc_V2(); // Btc_v2 sınıfından nesne Türettik. inner class olduğu için btc nesneli ile ulatık.
		Etc etc2 = new Etc();
		Doge doge2 = new Doge(1500); // new Doge(); olarak oluştursak random değer atar üsttekiler gibi.
		Shib shib2 =new Shib();
		switch (secim) {
		case 1: //Btc İçin
		{	
			if(btc2.getDeger()*miktar>cüzdan2.getPara())
			{
				throw new Yetersiz_Bakiye_Hatası();
			}
			cüzdan2.Btc_Ekle(miktar);
			cüzdan2.setPara(cüzdan2.getPara()-(miktar*btc2.getDeger()));
			cüzdan2.setToplam_varlık(cüzdan2.getToplam_varlık()+(cüzdan2.getBtc_sayi()*btc2.getDeger()));
			//Diğer Alcağımız Fİyattan Farklı Olsun.
			btc2.Deger_Arttır();
			btc2.Değer_Azalt();
			
				
		}
		case 2: //İnner class olan btc için.
		{
			if(btc2_V2.getDeger()*miktar>cüzdan2.getPara())
			{
				throw new Yetersiz_Bakiye_Hatası();
			}
			cüzdan2.Btc_V2_Ekle(miktar);
			cüzdan2.setPara(cüzdan2.getPara()-(miktar*btc2_V2.getDeger()));
			cüzdan2.setToplam_varlık(cüzdan2.getToplam_varlık()+(cüzdan2.getBtc_V2_sayi()*btc2_V2.getDeger()));
			//Diğer Alcağımız Fİyattan Farklı Olsun.
			btc2_V2.Deger_Arttır();
			btc2_V2.Değer_Azalt();
			break;
		}
		case 3: //Etc
		{
			if(etc2.getDeger()*miktar>cüzdan2.getPara())
			{
				throw new Yetersiz_Bakiye_Hatası();
			}
			cüzdan2.Etc_Ekle(miktar);
			cüzdan2.setPara(cüzdan2.getPara()-(miktar*etc2.getDeger()));
			cüzdan2.setToplam_varlık(cüzdan2.getToplam_varlık()+(cüzdan2.getEtc_sayi()*etc2.getDeger()));
			//Diğer Alcağımız Fİyattan Farklı Olsun.
			etc2.Deger_Arttır();
			etc2.Değer_Azalt();
			break;
		}
		case 4: //Doge
		{
			if(doge2.getDeger()*miktar>cüzdan2.getPara())
			{
				throw new Yetersiz_Bakiye_Hatası();
			}
			cüzdan2.Doge_Ekle(miktar);
			cüzdan2.setPara(cüzdan2.getPara()-(miktar*doge2.getDeger()));
			cüzdan2.setToplam_varlık(cüzdan2.getToplam_varlık()+(cüzdan2.getDoge_sayi()*doge2.getDeger()));
			//Diğer Alcağımız Fİyattan Farklı Olsun.
			doge2.Deger_Arttır();
			doge2.Değer_Azalt();
			break;
		}
		case 5: 
		{
			if(shib2.getDeger()*miktar>cüzdan2.getPara())
			{
				throw new Yetersiz_Bakiye_Hatası();
			}
			cüzdan2.Doge_Ekle(miktar);
			cüzdan2.setPara(cüzdan2.getPara()-(miktar*shib2.getDeger()));
			cüzdan2.setToplam_varlık(cüzdan2.getToplam_varlık()+(cüzdan2.getShib_sayi()*shib2.getDeger()));
			//Diğer Alcağımız Fİyattan Farklı Olsun.
			shib2.Deger_Arttır();
			shib2.Değer_Azalt();
			break;
		}
			
		case 6:
		{
			System.out.println("Sistemden Çıkılıyor...");
			Loading(1000);
			System.exit(0);
			break;
		}
		}
		
	}
	
	//Görsel Güzelleştirmek için.
	
	public static void Loading(int milisecond) {
		try {
			System.out.println("...");
			Thread.sleep(milisecond);
			System.out.println("..");
			Thread.sleep(milisecond);
			System.out.println(".");
			Thread.sleep(milisecond);
			
		} 
		catch (Exception e) {
			
		}
		}
	


}
