package myJavaFiles;

import java.util.Scanner;
import java.util.ArrayList;

public class LibraryBookRecorder {

    // Stores the names of all recorded books
	static ArrayList<String> totalBooksStored = new ArrayList<>();

    // Adds a recorded book to the ArrayList
    // and displays all books recorded so far
    static void displayBooksRecorded(String bookName) {

	    // Store the book name in the ArrayList
	    totalBooksStored.add(bookName);
	
	    // Display all recorded book names
	    System.out.println("Recorded Book Names: ");
	
	    for (int i = 0; i < totalBooksStored.size(); i++) {
	        System.out.println((i + 1) + ". " + totalBooksStored.get(i));
	    }
    }

    // Scanner for user input
    static Scanner input = new Scanner(System.in);

    // Records and displays information about a book
    static void recordBook(String bookName, String authorName, int yearPublished) {

        System.out.println("Please Select Category to Save Book: ");

        // Predefined book categories
        ArrayList<String> category = new ArrayList<>();
        category.add("Science");
        category.add("Technology");
        category.add("History");

        // Display categories with numbering
        for (int i = 0; i < category.size(); i++) {
            System.out.println((i + 1) + ". " + category.get(i));
        }

        System.out.println("Category Not Listed?");
        System.out.print("Enter 0 to Add Category: ");

        int choice = input.nextInt();

        // Determine which category to assign
        switch (choice) {

            case 1:
                System.out.println("Book Name: " + bookName);
                System.out.println("Author Name: " + authorName);
                System.out.println("Year Published: " + yearPublished);
                System.out.println("Category: " + category.get(0));
                // Save and display all recorded books
                displayBooksRecorded(bookName);
                break;

            case 2:
                System.out.println("Book Name: " + bookName);
                System.out.println("Author Name: " + authorName);
                System.out.println("Year Published: " + yearPublished);
                System.out.println("Category: " + category.get(1));
                // Save and display all recorded books
                displayBooksRecorded(bookName);
                break;

            case 3:
                System.out.println("Book Name: " + bookName);
                System.out.println("Author Name: " + authorName);
                System.out.println("Year Published: " + yearPublished);
                System.out.println("Category: " + category.get(2));
                // Save and display all recorded books
                displayBooksRecorded(bookName);
                break;

            default:

                // Allow the user to enter a custom category
                if (choice == 0) {

                    System.out.print("Enter Category Name: ");

                    String userCategory = input.next();

                    // Remove accidental spaces before and after input
                    userCategory = userCategory.trim();

                    System.out.println("Book Name: " + bookName);
                    System.out.println("Author Name: " + authorName);
                    System.out.println("Year Published: " + yearPublished);
                    System.out.println("Category: " + userCategory);
                    // Save and display all recorded books
                    displayBooksRecorded(bookName);
                    }
                
                else {

                    // Handles invalid menu choices
                    System.out.println("Wrong Input!");

                }
        }
    }

    public static void main(String[] args) {

        // Sample books for testing the program
        recordBook("Magical Elements of the Periodic Table",
                "Idris Abdul-Aziz", 2026);

        recordBook("The Hobbit",
                "Shamsuddeen Abubakar", 2026);
    }
}