
public class test {
	public static void main(String[] args){ 
		ogrenci ogrn = new ogrenci();
		Ogretmen ogrt = new Ogretmen();
		Memur mmr =new Memur();
		ogretimgorevlisi og = new ogretimgorevlisi();
		 
		ogrn.gezer();
		ogrn.uyur();
		ogrn.kantin();
		ogrn.setTcno(571);
		ogrn.setAd("naim");
		ogrn.setmemleket("Sarıkamış");
		ogrn.setbolum("bilgisayar muh");
		ogrn.setDt("1991");
		
		
		ogrt.gezer();
		ogrt.kisibilgisi();
		ogrt.setAd("ismail");
		ogrt.setbolum("bilgisayar muh");
		ogrt.setsicilno("temiz");
		ogrt.setDt("1984");
		
		mmr.memurbilgisi();
		mmr.setDt("ali");
		mmr.setGorev("temizlik");
		mmr.setTcno(456882);
		
		og.kisibilgisi();
		og.setAd("ömer");
		og.setAd(25);
		og.setalan("web ");
		og.setsicilno("456");
		og.setbolum("bilgisayar muh");
		
		
	}

}
