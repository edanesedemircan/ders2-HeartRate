package HeartRate;

import java.util.Scanner;

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
		Scanner input= new Scanner(System.in);
		
		System.out.println("isim giriniz");
		String name=input.nextLine();
		
		System.out.println("doğum tarihi giriniz");
		int dogumTarihi= input.nextInt();
		
		HeartRate k1=new HeartRate(name, dogumTarihi);
		k1.show();
		
	}


}
