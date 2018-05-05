package com.lhamacorp.supermarketus.entites

import org.apache.commons.lang3.builder.ToStringBuilder

class Product {

    String name
    Integer quantity

    @Override
    String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("quantity", quantity)
                .toString()
    }
}
