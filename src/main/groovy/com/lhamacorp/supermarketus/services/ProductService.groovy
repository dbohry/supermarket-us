package com.lhamacorp.supermarketus.services

import com.lhamacorp.supermarketus.entites.Product
import com.lhamacorp.supermarketus.entites.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {

    @Autowired
    ProductRepository repo

    List<Product> getAll() {
        repo.findAll()
    }

    Product get(String name) {
        repo.findByName(name)
    }

    Product save(Product product) {
        repo.save(product)
    }

}
