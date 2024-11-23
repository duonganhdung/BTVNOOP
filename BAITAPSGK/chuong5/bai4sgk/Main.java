package baitap.chuong5.bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        while (true) {
            System.out.print("Moi nhap tu can tra: ");
            String word = scanner.nextLine();
            if (word.isEmpty()) {
                break;
            }
            String meaning = dictionary.lookup(word);
            System.out.println("Nghia cua tu la: " + meaning);
        }
        System.out.println("Chuong trinh ket thuc.");
    }
}