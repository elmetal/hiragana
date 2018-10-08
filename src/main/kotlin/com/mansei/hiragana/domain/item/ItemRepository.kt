package com.mansei.hiragana.domain.item

interface ItemRepository {
    fun fetchAll(): List<Item>
}

