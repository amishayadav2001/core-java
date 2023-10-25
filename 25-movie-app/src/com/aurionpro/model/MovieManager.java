package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieManager {
	List<Movie> movieList;
	private static final String FILE_PATH = "D:\\Input.txt";
	
	public MovieManager() {
		super();
		this.movieList = new ArrayList<>();
		loadMovies();
	}
	
	public List<Movie> getMovieList(){
		return movieList;
	}
	
	private void loadMovies() {
		try {
			FileInputStream fis = new FileInputStream(FILE_PATH);
			int b = fis.available();
			if(b!=0) {
				ObjectInputStream in = new ObjectInputStream(fis);
				movieList = (List<Movie>) in.readObject();
				in.close();
			}
			fis.close();
		} catch(IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}
	
	public void addMovie(Movie movie) {
		movieList.add(movie);
		System.out.println(movieList);
		saveMovies();
		System.out.println("Movie Added successfully");
	}
	
	public void clearMovie() {
		movieList.clear();
		saveMovies();
	}
	
	private void saveMovies() {
		try {
			FileOutputStream file = new FileOutputStream(FILE_PATH);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(movieList);
			out.flush();
			
			out.close();
			file.close();
			
		}
		
		catch(IOException ex) {
			System.out.println("IOException is caught");
		}
		
	}
	
	public void deleteMovieById(int id) {
		boolean foundId = false;
		Movie temp = null;
		for(Movie x: movieList) {
			if(x.getId() == id) {
				foundId = true;
				temp = x;
			}
		}
		if (foundId) {
			movieList.remove(temp);
			System.out.println("Movie deleted");
		}
		else {
			System.out.println("Movie id not found");
		}
		
	}
}

