const axiosBase = require('axios.js')
const axios = axiosBase.create({
  baseURL: 'http://localhost:3030',
  headers: {
    'Content-Type': 'application/json',
    'X-Requested-With': 'XMLHttpRequest'
  },
  responseType: 'json',
  timeout: 1000
});

class BaseComponent {

  constructor() {
  }

  bindRequest(method, url) {
    return axios.request({method: method, url: url})
  }
}
