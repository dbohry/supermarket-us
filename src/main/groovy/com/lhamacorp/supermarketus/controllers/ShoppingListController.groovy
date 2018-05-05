package com.lhamacorp.supermarketus.controllers

import com.lhamacorp.supermarketus.entites.Product
import com.lhamacorp.supermarketus.entites.ShoppingList
import com.lhamacorp.supermarketus.services.ShoppingListService
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.websocket.server.PathParam

@RestController
@RequestMapping("/shopping-lists")
class ShoppingListController {

    @Autowired
    ShoppingListService service

    @GetMapping("/")
    def getAll() {
        service.getAll()
    }

    @GetMapping("/{title}")
    def get(@PathVariable("title") String title) {
        service.get(title)
    }

    @PostMapping()
    def save(@RequestBody ShoppingList shoppingList) {
        service.save(shoppingList)
    }

}
