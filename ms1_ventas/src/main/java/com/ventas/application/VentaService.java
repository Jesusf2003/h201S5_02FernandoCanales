package com.ventas.application;

import java.util.List;

import com.ventas.domain.Product;
import com.ventas.domain.Venta;

public interface VentaService {

	List<Venta> findAll();
	Venta save(Venta venta);
	String getProd(String id);
	Venta update(Venta venta);
	void delete(String id);
}