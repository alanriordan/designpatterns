package com.pluralsight.creational.singleton;
/**
 * Singleton pattern uses
 * - Only one instance for application
 * - Has a no arg private constructor
 * - can improve performance
 * - often confused with factory pattern
 * @author alan
 *
 */
public class DbSingleton {
	
	private static DbSingleton instance = null;
	
	private DbSingleton(){
		
	}
	
	public static DbSingleton getInstance(){
		if (instance == null){
			synchronized (DbSingleton.class) {
				if (instance == null){
					instance = new DbSingleton();
				}
			}			
		}
		return instance;
	}
	

}
