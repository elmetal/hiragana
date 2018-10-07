package com.mansei.hiragana.repository.item

import com.mansei.hiragana.domain.item.Description
import com.mansei.hiragana.domain.item.Item
import com.mansei.hiragana.domain.item.ItemRepository

class ItemRepositoryImpl : ItemRepository{
    override fun fetchAll(): List<Item> {
        val itemList = (1..10).map {
            Item(name = "minagi$it", description = Description(photo = "https://scontent-nrt1-1.xx.fbcdn.net/v/t1.0-1/c18.18.226.226/394342_138053816338399_2002068053_n.jpg"))
        }
        return itemList
    }
}