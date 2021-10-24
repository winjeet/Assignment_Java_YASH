package com.java8;

import java.util.List;

public class ProductBuilder {

	public static void main(String[] args) {
		List<Product> product = Product.getProductList();
		product.forEach(System.out::println);
	}

}
