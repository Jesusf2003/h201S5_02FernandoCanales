package com.ventas.domain;

import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient {

	@Override
	public Product findByProductId(String id) {
		Product product = new Product();
		return Product.builder()
				.id(id)
				.name(product.getName())
				.amount(product.getAmount())
				.price(product.getPrice())
				.build();
	}
}