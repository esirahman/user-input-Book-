//BookProject.java.............
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookproject;

/**
 *
 * @author Aysha
 */
public class BookProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

//Book.java............


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aysha
 */
public class Book {
    private static int totalBooks = 0;

    private String title;
    private String author;
    private String publisher;
    private int year;
    private double price;

    // Constructor
    public Book(String title, String author, String publisher, int year, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
        totalBooks++;
    }

    // Method to display book info
    public void displayBookDetails() {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Publisher : " + publisher);
        System.out.println("Year      : " + year);
        System.out.println("Price     : $" + price);
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
}


//BookTest.java.....................

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many books do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));

            System.out.print("Enter Title: ");
            String title = sc.nextLine();

            System.out.print("Enter Author: ");
            String author = sc.nextLine();

            System.out.print("Enter Publisher: ");
            String publisher = sc.nextLine();

            System.out.print("Enter Year: ");
            int year = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            books[i] = new Book(title, author, publisher, year, price);
        }

        System.out.println("\n===== Book Details =====");
        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            books[i].displayBookDetails();
        }

        System.out.println("\nTotal Books Entered: " + Book.getTotalBooks());

        sc.close();
    }
}
