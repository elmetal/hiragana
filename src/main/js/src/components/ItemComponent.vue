<template>
 <div>${item.name}</div>
 <img :src="item.photo" :alt="DisplayNpImg(item)"></img>
</template>

<script>
import baseComponent.js
  export default{
  props:['item']
    computed :{
      DisplayNpImg(item) {
      return item.name + 'のIMG'
      }
    }
  }
</script>
