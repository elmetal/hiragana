<template>
  <ul>
    <li v-bind:key="item.name" v-for="item in itemList">
      <item-component :item="item"/>
    </li>
  </ul>
</template>

<script>
  import ItemComponent from './ItemComponent'
  import BaseComponent from './baseComponent'
  import Item from '../item/item'

  export default {
    name: 'ItemListComponent',
    components: {ItemComponent},

    data() {
      return {
        itemList: []
      }
    },

    mounted() {
      let self = this;
      new BaseComponent().bindRequest('GET', '/item/list.json')
        .then((response) => {
          self.itemList = response.data.map(item => {
            // eslint-disable-next-line
            return new Item(item.name, item.description.photo)
          })
        })
        .catch(err => {
          console.error(err)
        })
    }

  }

</script>

<style scoped>

</style>
