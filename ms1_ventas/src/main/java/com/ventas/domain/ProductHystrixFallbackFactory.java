package com.ventas.domain;

import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient {

	@Override
	public Product findById(String id) {
		Product product = Product.builder()
				.id(id)
				.name("")
				.stock(null)
				.price(null)
				.build();
		return product;
	}
}