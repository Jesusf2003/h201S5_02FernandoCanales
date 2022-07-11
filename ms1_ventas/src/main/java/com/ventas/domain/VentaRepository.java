package com.ventas.domain;

import java.util.List;

public interface VentaRepository {
	
	Venta save(Venta venta);
	void update(Venta venta);
	List<Venta> getAllVenta();
}