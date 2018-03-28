package com.assigmment.RestJPACrud.jpa;

import javax.transaction.Transactional;

import com.assigmment.RestJPACrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


@Transactional
public interface ProductRepository extends JpaRepository<Product, String> {

}
