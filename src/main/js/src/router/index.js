import Vue from 'vue'
import Router from 'vue-router'
import ItemListPage from '@/page/ItemListPage'
import HelloWorld from '@/components/HelloWorld'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/item/list',
      name: 'ItemList',
      component: ItemListPage
    },
    {
      path: '/hello',
      name: 'HelloWorld',
      component: HelloWorld
    }
  ]
})
