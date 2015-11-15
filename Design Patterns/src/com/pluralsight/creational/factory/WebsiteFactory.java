package com.pluralsight.creational.factory;

public class WebsiteFactory {
	
	public static Website getWebsite(String type){
		switch(type){
		case "Blog" : {
			return new Blog();
		}
		case "Shop" : {
			return new Shop();
		}
		default :{
			return null;
		}
		}
	}

}
