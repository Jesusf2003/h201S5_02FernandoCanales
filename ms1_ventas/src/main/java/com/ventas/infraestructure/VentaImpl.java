package com.ventas.infraestructure;

import java.util.List;

import com.ventas.domain.Product;
import com.ventas.domain.ProductClient;
import com.ventas.domain.Venta;
import com.ventas.domain.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository
public class VentaImpl implements VentaRepository {

	private MongoOperations operations;
	
	@Qualifier("com.ventas.domain.ProductClient")
	@Autowired
	ProductClient client;
	
	public VentaImpl(MongoOperations operations) {
		super();
		this.operations = operations;
	}

	@Override
	public Venta save(Venta venta) {
		Product prod = client.findById(venta.getProduct().getId());
		if (prod != null) {
			venta.setProduct(prod);
			return this.operations.save(venta);
		}
		return null;
	}

	@Override
	public void update(Venta venta) {
		this.operations.save(venta);
	}

	@Override
	public List<Venta> getAllVenta() {
		return this.operations.findAll(Venta.class, toString());
	}
}