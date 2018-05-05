package com.lhamacorp.supermarketus.entites

import org.springframework.data.mongodb.repository.MongoRepository

interface ShoppingListRepository extends MongoRepository<ShoppingList, String> {

    ShoppingList findByTitle(String title)

}