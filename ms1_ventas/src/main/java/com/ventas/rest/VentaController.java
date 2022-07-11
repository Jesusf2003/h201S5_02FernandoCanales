package com.ventas.rest;

import com.ventas.application.VentaService;
import com.ventas.domain.Venta;
import com.ventas.domain.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventas")
public class VentaController {

	private VentaRepository repository;
	
	@Autowired
	private VentaService service = new VentaService(repository);
	
	@PostMapping("/save")
	public Venta saveVenta(@RequestBody Venta venta) {
		return service.saveVenta(venta);
	}
}