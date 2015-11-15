package com.pluralsight.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Item> items = new HashMap<String,Item>();
	
	public Registry(){
		loadItems();
	}
	
	public Item createItem(String type){
		Item item = null;
		try {
			item = (Item)(items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return item;
	}
	
	private void loadItems(){
		Movie movie = new Movie();
		movie.setPrice(22.22);
		movie.setRuntime("2 Hours");
		movie.setTitle("basic Movie");
		items.put("movie", movie);
		
		Book book = new Book();
		book.setNumberOfPages(123);
		book.setPrice(12.23);
		book.setTitle("basic book");
		items.put("book", book);
		
	}

}
