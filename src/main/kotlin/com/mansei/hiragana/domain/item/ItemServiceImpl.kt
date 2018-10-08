package com.mansei.hiragana.domain.item

import org.springframework.stereotype.Service

@Service
class ItemServiceImpl(private val itemRepository: ItemRepository) : ItemService {

    override fun listItems(): List<Item> {
        return itemRepository.fetchAll()
    }
}