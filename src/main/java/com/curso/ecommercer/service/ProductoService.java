package com.curso.ecommercer.service;

import java.util.Optional;

import com.curso.ecommercer.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
}
