package org.cjvaldi.springboot.backend.repositories;

import org.cjvaldi.springboot.backend.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
