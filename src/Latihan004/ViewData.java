package Latihan004;

import java.util.Scanner;

public class ViewData {
	public void displayData(String data) {
		System.out.println("Data: " + data);
	}
	
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan data string apa saja:");
		return scanner.nextLine();
	}

}
