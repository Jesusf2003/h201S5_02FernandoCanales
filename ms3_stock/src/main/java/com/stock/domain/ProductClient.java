package com.stock.domain;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "compras-service", url = "localhost:8093/compras", fallback = ProductHystrixFallbackFactory.class)
public interface ProductClient {

	@GetMapping(value = "/product/{id}")
	Product findProductById(@PathVariable String id);
}