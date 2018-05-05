package com.lhamacorp.supermarketus.entites

import org.apache.commons.lang3.builder.ToStringBuilder
import org.springframework.data.annotation.Id

class Catalog {

    @Id
    String id
    String name


    @Override
    String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .toString()
    }
}
