package Latihan002;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	
	private static ArrayList<String> todoList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean keluar = false;
		
		while (!keluar) {
			
			System.out.println("Aplikasi Todo List");
			System.out.println("1. Tampilkan Todo List");
			System.out.println("2. Tambah Todo List");
			System.out.println("3. Hapus Todo List");
			System.out.println("4. Edit Todo List");
			System.out.println("5. Keluar");
			
			System.out.println("Masukkan pilihan anda: ");
			int pilihan = scanner.nextInt();
			scanner.nextLine();
			
			switch (pilihan) {
			case 1:
				showTodoList();
				break;
			
			case 2:
				addTodoList();
				break;
				
			case 3:
				deleteTodoList();
				break;
				
			case 4:
				editTodoList();
				break;
			
			case 5:
				keluar = true;
				System.out.println("Anda sudah keluar");
				break;
				
			default:
				System.out.println("Pilihan tidak valid. Silahkan pilih ulang");
				
			}
			
		}
		
		scanner.close();
	}
	
	private static void showTodoList() {
		System.out.println("Daftar todo list anda:");
		for (int i = 0; i < todoList.size(); i++) {
			System.out.println((i + 1) + ". " + todoList.get(i));
		}
		
		System.out.println();
	}
	
	private static void addTodoList() {
		System.out.println("Masukkan todo baru: ");
		String itemBaru = scanner.nextLine();
		todoList.add(itemBaru);
		System.out.println("Item \"" + itemBaru + "\" telah ditambahkan");
	}
	
	private static void deleteTodoList() {
		System.out.println("Masukkan nomor todo list yang akan dihapus: ");
		int nomor = scanner.nextInt();
		scanner.nextLine();
		
		if(nomor >=0 && nomor < todoList.size()) {
			String hapusItem = todoList.remove(nomor - 1);
			System.out.println("Item \"" + hapusItem + "\" telah dihapus");
		}else {
			System.out.println("Nomor todo list tidak valid.");
		}
		
	}
	
	public static void editTodoList() {
		
		System.out.println("Masukkan nomor todo list yang akan diubah: ");
		int nomor = scanner.nextInt();
		scanner.nextLine();
		
		if(nomor >=0 && nomor < todoList.size()) {
			System.out.println("Masukkan perubahan todo list nomor \"" + todoList.get(nomor - 1) + "\": ");
			String editItem = scanner.nextLine();
			todoList.set(nomor - 1, editItem);
			System.out.println("Item berhasil diubah.");
		}else {
			System.out.println("Nomor todo list tidak valid.");
		}
	}

}
