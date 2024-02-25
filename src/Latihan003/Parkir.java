package Latihan003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Parkir {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan jam masuk => (00:00) :");
		String inputMasuk = scanner.next();
		Date jamMasuk = parseTime(inputMasuk);
		
		System.out.print("Masukkan jam keluar => (00:00) :");
		String inputKeluar = scanner.next();
		Date jamKeluar = parseTime(inputKeluar);
		
		long durasiParkir = hitungDurasi(jamMasuk, jamKeluar);
		
		double hargaParkir = hitungHargaParkir(durasiParkir);
		
		System.out.println("Biaya parkir: Rp. " + hargaParkir);
		
		scanner.close();
		
	}
	
	
	// -- Konversi jam masuk -keluar menjadi date -- //
	
	private static Date parseTime(String timeStr) {
		try {
			return new SimpleDateFormat("HH:mm").parse(timeStr);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// -- end -- //
	
	// -- Hitung durasi perjam -- //
	
	private static long hitungDurasi(Date masuk, Date keluar) {
		long durasiMillis = keluar.getTime() - masuk.getTime();
		return TimeUnit.MILLISECONDS.toHours(durasiMillis);
	}
	
	// -- end -- //
	
	// -- Hitung parkir -- //
	// 3 jam pertama = 1000 (3000)
	// 5 jam = 2000 (4000)
	// 7 jam = 3000 (6000)
	// 7 jam ++ = 5000
	
	private static double hitungHargaParkir(long durasiParkir) {
		
		double harga = 0.0;
		
		double per3Jam = 1000;
		
		double per5Jam = 2000;
		
		double per7Jam = 3000;
		
		double per7JamLebih = 5000;
		
		if (durasiParkir <= 3) {
			
			harga = durasiParkir * per3Jam;	
			
		} else if (durasiParkir <=5) {
			harga = 3000 + (durasiParkir - 3) * per5Jam;
		} else if (durasiParkir <=7) {
			var harga3Jam = 3000 + (durasiParkir - 3) * per5Jam;
			harga = harga3Jam + (durasiParkir - 5) * per7Jam;
		} else {
//			var harga3Jam = 3000 + (durasiParkir - 3) * per5Jam;
//			var harga5Jam = 4000 + (durasiParkir - 5) * per7Jam;
//			var harga7Jam = 6000 + (durasiParkir - 7) * per7JamLebih;
//			var harga7JamLebih = harga3Jam + harga5Jam + harga7Jam;
//			harga = harga7JamLebih * per7JamLebih;
			
//	        harga = 3000 + (durasiParkir - 3) * per5Jam + (durasiParkir - 5) * per7Jam 
//	                + (durasiParkir - 7) * per7JamLebih;
			
			double Jam7Lebih = (durasiParkir - 7) * per7JamLebih;
			
			harga = 3000 + 4000 + 6000 + Jam7Lebih;
		}
		
		return harga;
		
	}
	
	

}
