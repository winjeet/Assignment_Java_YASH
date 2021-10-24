package com.java8;

import java.util.Arrays;
import java.util.List;

public class Product {

	private int productId;
	private String productDescription;
	private String productType;

	public Product() {}
	public Product(Product.Builder builder) {
		this.productId = builder.productId;
		this.productDescription = builder.productDescription;
		this.productType = builder.productType;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	private static class Builder {
		private int productId;
		private String productDescription;
		private String productType;

		public Builder() {}
		public Builder setProductId(int productId) {
			this.productId = productId;
			return this;
		}

		public Builder setProductDescription(String productDescription) {
			this.productDescription = productDescription;
			return this;
		}
		public Builder setProductType(String productType) {
			this.productType = productType;
			return this;
		}
		public Product build() {
			return new Product(this);
		}

	}

	public static List<Product> getProductList() {
		return Arrays.asList(
				new Product.Builder().setProductId(1001).setProductDescription("Brand New with Updated Features")
						.setProductType("New").build(),
				new Product.Builder().setProductId(1002).setProductDescription("Good Condition")
						.setProductType("Refurbished").build(),
				new Product.Builder().setProductId(1003).setProductDescription("Working Slow as used for 3 years")
						.setProductType("Used").build());
	}
	@Override
	public String toString() {
		return "Product [productId = " + productId + ", productDescription = " + productDescription + ", productType = "
				+ productType + "]";
	}

	
}
