<template>
  <ul>
    <li v-for="item in itemList">
      <item-component :item="item"/>
    </li>
  </ul>
</template>

<script>
  import ItemComponent from "./ItemComponent"
  import "./baseComponent"
  import "../item/item"

  export default {
    name: "ItemListComponent",
    components: [ItemComponent],

    data() {
      return {
        itemList: []
      }
    },

    mounted() {
      new BaseComponent().bindRequest("GET", "/item/list")
        .then((response) => {
          this.itemList = response.data.map(item => {
            new Item(item.name, item.photo)
          })
        })
        .catch(err => {
          console.error(err)
        })
    },
  }
</script>

<style scoped>

</style>
