package com.ventas.application;

import java.util.List;
import java.util.Optional;

import com.ventas.domain.Product;
import com.ventas.domain.Venta;
import com.ventas.domain.VentaRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VentaServiceImpl implements VentaService {
	
	private final VentaRepository repository;

	@Override
	public List<Venta> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Venta save(Venta venta) {
		return repository.save(venta);
	}
	
	@Override
	public String getProd(String id) {
		Optional<Product> opProduct = this.repository.findByProductId(id);
		if(opProduct.isPresent()) {
			Product prod = opProduct.get();
			return prod.toString();
		}
		return null;
	}

	@Override
	public Venta update(Venta venta) {
		return repository.save(venta);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}