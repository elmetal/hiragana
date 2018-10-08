<template>
  <div>${item.name}</div>
  <img :src="item.photo" :alt="DisplayNpImg(item)"/>
</template>

<script>

  export default {
    name: "ItemComponent",
    props: ['item'],

    computed: {
      /**
       * @return {string}
       */
      DisplayNpImg(item) {
        return item.name + 'のIMG'
      }
    }
  }
</script>

<style scoped>

</style>
