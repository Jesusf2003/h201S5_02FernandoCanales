package com.ventas.domain;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "compras-service", url = "http://localhost:8093")
public interface ProductClient {

	@GetMapping(value = "/compras/product/{id}")
	Product findByProductId(@PathVariable("id") String id);
}