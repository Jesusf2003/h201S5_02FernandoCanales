package com.ventas.rest;

import java.util.*;

import com.ventas.application.*;
import com.ventas.domain.*;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/venta")
@RequiredArgsConstructor
public class VentaController {

	private final VentaService service;
	private final ProductClient client;
	
	@PostMapping("/save")
	private Venta saveVenta(@RequestBody Venta venta) {
		Product optProduct = client.findByProductId(venta.getProduct().getId());
		System.out.println(optProduct);
		venta.setProduct(optProduct);
		return service.save(venta);
	}
	
	@GetMapping("/product/{id}")
	private Product traer(@PathVariable("id") String id) {
		
		return this.client.findByProductId(id);
	}
	
	@GetMapping("/all")
	public List<Venta> findAll() {
		return service.findAll();
	}
}