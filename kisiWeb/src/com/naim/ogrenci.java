
public class ogrenci extends kisi{
		private String memleket;
		private String bolum;
		private String Sinif;
		public void ders(){
			System.out.println("ogrenci derste");
		}
		public void kantin(){
			System.out.println("ogrenci kantinde");
		}
		public String getmemleket() {
			return memleket;
		}
		public void setmemleket(String memleket) {
			this.memleket = memleket;
		}
		public String getbolum() {
			return bolum;
		}
		public void setbolum(String bolum) {
			this.bolum = bolum;
		}
		public String getSinif() {
			return Sinif;
		}
		public void setsinif(String Sinif) {
			this.Sinif = Sinif;
		}
		public void ogrencibilgisi(){
			System.out.println("memleket"+memleket+"\nbolum:"+bolum+"\nsinif"+Sinif);
		}
}