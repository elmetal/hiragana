package com.mansei.hiragana.domain.item

import org.springframework.stereotype.Repository

@Repository
interface ItemRepository {
    fun fetchAll(): List<Item>
}

