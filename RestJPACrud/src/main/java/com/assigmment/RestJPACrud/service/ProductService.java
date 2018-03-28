package com.assigmment.RestJPACrud.service;

import com.assigmment.RestJPACrud.entity.Product;
import com.assigmment.RestJPACrud.jpa.ProductRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements GenericService<Product, String> {
	private final ProductRepository productRepository;
	
	public ProductService(final ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public String getId(Product entity) {
		return entity.getId();
	}

	@Override
	public CrudRepository<Product, String> getRepository() {
		return this.productRepository;
	}

}
