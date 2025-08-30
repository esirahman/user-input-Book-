//BookProject.java.............
/*1. NetBeans চালু করো।


2. File → New Project ক্লিক করো।


3. Java → Java Application সিলেক্ট করে Next চাপো।


4. Project Name দাও: BookProject


5. Create Main Class এর টিক তুলে দাও (আমরা নিজে Main বানাবো)।


6. Finish ক্লিক করো।

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
/*Step 2: Book Class তৈরি করা

1. বাম পাশে Project Window থেকে Source Packages-এ রাইট-ক্লিক → New → Java Class।


2. Class Name: Book (প্যাকেজ খালি রাখলে সহজ হবে)


3. Finish ক্লিক করো।


4. আসা ফাইলটায় নিচের কোড পেস্ট করে Ctrl + S দাও:


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
//Step 3: Main Class (BookTest) তৈরি করা

//1. আবার Source Packages-এ রাইট-ক্লিক → New → Java Class।


//2. Class Name: BookTest → Finish।


//3. নিচের কোড পেস্ট করে Ctrl + S দাও:


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
//Step 4: প্রোগ্রাম রান করা

//1. BookTest.java-এর উপর রাইট-ক্লিক → Run File (অথবা Shift + F6)।


//2. নিচে Output Window-এ ইনপুট দাও।




//---

//🖥 Sample Input / Output (তোমার দেওয়া ডেটা অনুযায়ী)

//Input (যা টাইপ করবে):

//How many books do you want to enter? 5

//Enter details for Book 1
//Enter Title: Laugh Out Loud with Life
//Enter Author: Ayesha Akther Haspia
//Enter Publisher: Penguin Random House
//Enter Year: 2023
//Enter Price: 25.50

//Enter details for Book 2
//Enter Title: The Funny Side of Everything
//Enter Author: Jonathan Miller
//Enter Publisher: HarperCollins
//Enter Year: 2021
//Enter Price: 19.99

//Enter details for Book 3
//Enter Title: Oops! That’s Hilarious
//Enter Author: Sophia Anderson
//Enter Publisher: Bloomsbury Publishing
//Enter Year: 2022
//Enter Price: 22.75

//Enter details for Book 4
//Enter Title: Comedy Nights Forever
//Enter Author: Michael Johnson
//Enter Publisher: Macmillan Publishers
//Enter Year: 2020
//Enter Price: 18.00

//Enter details for Book 5
//Enter Title: Giggles and Grins
//Enter Author: Emily Carter
//Enter Publisher: Oxford Press
//Enter Year: 2019
//Enter Price: 20.40
