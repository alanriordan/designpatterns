package com.pluralsight.creational.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie)registry.createItem("movie");
		movie.setTitle("First Movie");
		
		System.out.println(movie);
		System.out.println(movie.getPrice());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		
		Movie anotherMovie = (Movie)registry.createItem("movie");
		anotherMovie.setTitle("Another Movie");
		
		System.out.println(movie);
		System.out.println(movie.getPrice());
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());

	}

}
