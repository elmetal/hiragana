import axiosBase from 'axios'

const axios = axiosBase.create({
  baseURL: 'http://localhost:3030',
  headers: {
    'Content-Type': 'application/json',
    'X-Requested-With': 'XMLHttpRequest',
    'Access-Control-Allow-Origin': 'localhost:8080'
  },
  responseType: 'json',
  timeout: 1000
})

class BaseComponent {
  bindRequest(method, url) {
    return axios.request({method: method, url: url})
  }
}

export default BaseComponent
