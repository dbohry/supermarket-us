package com.lhamacorp.supermarketus.controllers

import com.lhamacorp.supermarketus.entites.Product
import com.lhamacorp.supermarketus.services.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.websocket.server.PathParam

@RestController
@RequestMapping("/products")
class ProductController {

    @Autowired
    ProductService service

    @GetMapping("/")
    def getAll() {
        service.getAll()
    }

    @GetMapping("/{name}")
    def get(@PathVariable("name") String name) {
        service.get(name)
    }

    @PostMapping
    def save(Product product) {
        service.save(product)
    }


}
