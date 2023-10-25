package com.aurionpro.model;

import java.util.List;
import java.util.Scanner;

public class MovieController {
	private MovieManager movieManager;

	public MovieController() {
		super();
		this.movieManager = new MovieManager();

	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {
		int choice = 0;
		while (choice != 5) {
			Scanner sc = new Scanner(System.in);
			System.out.println("----------------------------");
			System.out.println("Welcome to Movie App");
			System.out.println("Enter 1 to list all movies");
			System.out.println("Enter 2 to add a new movie");
			System.out.println("Enter 3 to delete all movies");
			System.out.println("Enter 4 to clear movies");
			System.out.println("Enter 5 to exit");
			System.out.println("Enter your choice");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				List<Movie> movieList = movieManager.getMovieList();
				if (!movieList.isEmpty()) {
					for (Movie movie : movieList) {
						System.out.println(movie);
					}
				} else {
					System.out.println("No movies available.");
				}
				break;
			case 2:
				Movie movie = setMovieDetails();
				movieManager.addMovie(movie);
				break;
			case 3:
				System.out.println("Enter movie ID");
				int id = sc.nextInt();
				movieManager.deleteMovieById(id);
				break;
			case 4:
				movieManager.clearMovie();
				break;
			case 5:
				System.out.println("Thanks for using Movie App!");
				break;
			default:
				System.out.println("Invalid choice");

			}
		}
	}

	private Movie setMovieDetails() {
		Movie temp = new Movie();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie id: ");
		temp.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter movie name: ");
		temp.setName(sc.nextLine());
		System.out.println("Enter movie release year: ");
		temp.setYear(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter movie genre: ");
		temp.setGenre(sc.nextLine());
		return temp;
	}
}