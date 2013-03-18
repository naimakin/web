public class Memur extends kisi{
	private String gorev;
	
	public void evrakGetir(){
			System.out.println("evraklari getiriyor");
		}
		public void evrakGotur(){
			System.out.println("evrakları al gotur");
		}
		public String getGorev() {
			return gorev;
		}
		public void setGorev(String gorev) {
			this.gorev = gorev;
		}
		public void memurbilgisi(){
			System.out.println("gorevi:"+gorev);
		}

}