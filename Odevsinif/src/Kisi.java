
class kisi {
	private int tcno;
	private String ad;
	private String dt ;
	public void uyur(){
		System.out.println("kisi uyuyo");
		
	}
	public void gezer(){
		System.out.println("kisi ayakta");
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getTcno() {
		return tcno;
	}
	public void setTcno(int tcno) {
		this.tcno = tcno;
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public void kisibilgisi(){
		System.out.println("ad="+ad+"tc:"+tcno+"dogum tarihi:"+dt);
	}
}