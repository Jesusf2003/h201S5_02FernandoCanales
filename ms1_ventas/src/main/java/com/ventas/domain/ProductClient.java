package com.ventas.domain;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "compras-service", url = "localhost:8093", path = "/compras")
public interface ProductClient {

	@GetMapping(value = "/product/{id}")
	Product findByProductId(@PathVariable("id") String id);
}