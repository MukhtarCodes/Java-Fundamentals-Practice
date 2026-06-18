package myJavaFiles;

import java.util.Scanner;
import java.util.ArrayList;
public class SchoolCourseRegistrationSystem {
	
	static void startProgram() {
		
        boolean running = true;
        
		while (running) {
			courseMenu();
			System.out.print("\nChoose Your Option: ");
			int choice = input.nextInt();
			input.nextLine();
			
			switch(choice) {
				case 1:
						registerCourse();
						break;
				case 2:
					viewCourses();
					break;
				case 3:
					searchCourse();
					break;
				case 4:
					removeCourse();
					break;
				case 5:
					displayTotalCourses();
					break;
				case 6:
					System.out.println("Session Ended");
					running = false;
					break;
				default:
					System.out.println("Wrong Input");
			}
		}
	}
	
	static Scanner input = new Scanner(System.in);
	
	static ArrayList <String> totalCoursesRecorded = new ArrayList <> ();
	
	static void courseMenu() {
		
		System.out.println("\n===== Course Registration System =====\n");
		String[] menu = {"Register Course", "View Courses", "Search Course", "Remove Course", "Display Total Courses", "Exit"};
	
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + ". " + menu[i]);
		}
		
	}
	static void registerCourse() {
		
		System.out.print("\nEnter Course Name: ");
		String courseName = input.nextLine().trim();
		
		if(totalCoursesRecorded.contains(courseName)) {
			System.out.println("Course Already Exist\n");
		}
		else {
			totalCoursesRecorded.add(courseName);
			System.out.println("\nCourse Registered Successfully");
		}
	}
	
	static void viewCourses() {
		if(totalCoursesRecorded.size() > 0) {
			
			System.out.println("\n===== Recorded Courses =====\n");
			
			for (int i = 0; i < totalCoursesRecorded.size(); i++) {
				System.out.println((i + 1) + ". " + totalCoursesRecorded.get(i));
			}
		}
		else {
			System.out.println("\nDirectory Empty!");
		}
	}
	
	static void searchCourse() {
		
		System.out.print("\nMake Your Search: ");
		String userInput = input.nextLine();
		
		boolean found = false;

		for (int i = 0; i < totalCoursesRecorded.size(); i++) {

		    if(totalCoursesRecorded.get(i).equalsIgnoreCase(userInput)) {

		        found = true;
		        break;
		    }
		}

		if(found) {
		    System.out.println("Course Found");
		}
		else {
		    System.out.println("Course Not Found");
		}

	}
	static void removeCourse() {
		
		System.out.println("\n===== Recorded Courses =====\n");
		
		for (int i = 0; i < totalCoursesRecorded.size(); i++) {
			System.out.println((i + 1) + ". " + totalCoursesRecorded.get(i));
		}
		
		System.out.println("\nWhich Course Do You Wish To Remove?\n");
		
		int userInput = input.nextInt();
		input.nextLine();
		
		int index = userInput - 1;
		if (index < 0 || index >= totalCoursesRecorded.size()) {
			System.out.println("Invalid Input");
		}
		else {
			totalCoursesRecorded.remove(index);
			System.out.println("\nCourse Removed Successfully");
		}
	}
	static void displayTotalCourses() {
		System.out.println("\nTotal Course Recorded: " + totalCoursesRecorded.size());
	}
	public static void main(String[] args) {
		startProgram();
	}
}
