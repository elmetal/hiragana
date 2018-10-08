package com.mansei.hiragana.domain.item

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemListController {

    @Autowired
    lateinit var itemService: ItemService

    @GetMapping("/item/list")
    fun getItemlist () :List<Item>{
        return itemService.listItems()
    }

}
