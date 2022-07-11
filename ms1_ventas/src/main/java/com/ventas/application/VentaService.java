package com.ventas.application;

import com.ventas.domain.Venta;
import com.ventas.domain.VentaRepository;

import org.springframework.stereotype.Service;

@Service
public class VentaService {

	private VentaRepository repository;

	public VentaService(VentaRepository repository) {
		super();
		this.repository = repository;
	}
	
	public Venta saveVenta(Venta venta) {
		return this.repository.save(venta);
	}
	
	public void updateVenta(Venta venta) {
		this.repository.update(venta);
	}
}