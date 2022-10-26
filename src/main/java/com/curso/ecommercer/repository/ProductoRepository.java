package com.curso.ecommercer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommercer.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

}
