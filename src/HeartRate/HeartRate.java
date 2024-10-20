package HeartRate;

public class HeartRate {
	
	private String name;
	private int yas;
	
	HeartRate(String name, int dogumTarihi){
		this.name=name;
		yas=2024-dogumTarihi;
	}
	
	public int maxHeartRate() {
		return 220-yas;
	}

	public double targetHeartRate() {
		return maxHeartRate()*0.85;
	}
	
	public void show() {
		System.out.println("Ad Soyad: "+name);
		System.out.println("MHR: "+maxHeartRate());
		System.out.println("THR: "+targetHeartRate());
		
	}
	
	public static void main(String[] args) {
		HeartRate k1=new HeartRate("Eda",2003);
		k1.show();
		
	}


}
