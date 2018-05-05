package com.lhamacorp.supermarketus.entites

import org.springframework.data.mongodb.repository.MongoRepository

interface ProductRepository extends MongoRepository<Product, String> {

    Product findByName(String name)

}
