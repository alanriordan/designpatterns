package com.pluralsight.creational.builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("wheat").dressing("mayo").meat("ham").condiments("pepper");
		
		LunchOrder order = builder.build();
		
		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDressing());
		System.out.println(order.getMeat());
		

	}

}
