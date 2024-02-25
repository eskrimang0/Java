package Latihan001;

import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kalkulator java");
		System.out.println("Isi angka pertama:");	
		double angka1 = scanner.nextDouble();
		
		System.out.println("Isi angka kedua:");
		double angka2 = scanner.nextDouble();
		
		System.out.println("Pilih jenis operasi ( + , - , * , / ):");
		char operator = scanner.next().charAt(0);
		
		double hasil = 0;
		
		switch (operator) {
		case '+':
			hasil = angka1 + angka2;
			break;
			
		case '-':
			hasil = angka1 - angka2;
			break;
		
		case '*':
			hasil = angka1 * angka2;
			break;
			
		case '/':
			if (angka2 != 0) {
			hasil = angka1 / angka2;
			break;
			}
			else
			{
				System.out.println("Angka kedua tidak boleh kosong");
//			return;
			}
		default:
			System.out.println("Operator tidak valid.");
//			return;
		}
		
		System.out.println("Hasil: " + hasil);
		
		scanner.close();
	}

}
