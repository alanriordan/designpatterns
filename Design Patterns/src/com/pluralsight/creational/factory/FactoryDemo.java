package com.pluralsight.creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite("Blog");
		
		System.out.println(site.getPages());
		
Website shop = WebsiteFactory.getWebsite("Shop");
		
		System.out.println(shop.getPages());
		
		

	}

}
