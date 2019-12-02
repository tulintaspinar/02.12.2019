
public class evcilHayvan {
	private String isim;
	
	 public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public evcilHayvan(String isim)
	{
		
		System.out.println(isim+" oyun oynuyor");
		this.isim=isim;
	}

	
	public String oyna()
	{
		return this.isim+" oynamaktan yoruldu";
	}

	
}
