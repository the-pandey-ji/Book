package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bookName;
        String authorName;
        String isbn;
        int n = scan.nextInt();
        Book[] book = new Book[n];
        if (n == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < n; i++) {
                bookName = scan.nextLine();
                authorName = scan.nextLine();
                isbn = scan.nextLine();
                book[i] = new Book(bookName, authorName, isbn);

            }
            for (int i = 0; i < n; i++) {
                System.out.println(book[i]);
            }
        }
        scan.close();

    }
}
