package com.lhamacorp.supermarketus.services

import com.lhamacorp.supermarketus.entites.ShoppingList
import com.lhamacorp.supermarketus.entites.ShoppingListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ShoppingListService {

    @Autowired
    ShoppingListRepository repo

    List<ShoppingList> getAll() {
        repo.findAll()
    }

    ShoppingList get(String title) {
        repo.findByTitle(title)
    }

    ShoppingList save(ShoppingList shoppingList) {
        repo.save(shoppingList)
    }

}
