package com.lhamacorp.supermarketus.entites

import org.apache.commons.lang3.builder.ToStringBuilder
import org.springframework.data.annotation.Id

class ShoppingList {

    @Id
    String id
    String title
    List<Product> products
    Boolean isActive

    @Override
    String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("title", title)
                .append("products", products)
                .append("isActive", isActive)
                .toString()
    }
}
