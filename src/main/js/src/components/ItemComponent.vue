<template>
  <div>
    <div>{{item.name}}</div>
    <img :src="item.photo" :alt="displayNoImage"/>
  </div>
</template>

<script>

  export default {
    name: 'ItemComponent',
    props: ['item'],

    computed: {
      /**
       * @return {string}
       */
      displayNoImage() {
        return this.item.name + 'のIMG'
      }
    }
  }
</script>

<style scoped>

</style>
