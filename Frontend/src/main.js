import Vue from 'vue'
import App from './App.vue'
// import Keycloak from 'keycloak'
import VueLogger from 'vuejs-logger';

Vue.config.productionTip = false
Vue.use(VueLogger);

// let initOptions = {
//   url: 'https://wzlkeycloak.fbuervenich.de/auth/', realm: 'dev', clientId: 'vuewebapp', onLoad: 'login-required'
// }

// let keycloak = Keycloak(initOptions);


// keycloak.init({ onLoad: initOptions.onLoad }).success((auth) => {

//   if (!auth) {
//     window.location.reload();
//   } else {
//     Vue.$log.info("Authenticated");
//   }

// new Vue({
//   render: h => h(App),
// }).$mount('#app')


//   localStorage.setItem("vue-token", keycloak.token);
//   localStorage.setItem("vue-refresh-token", keycloak.refreshToken);

//   setTimeout(() => {
//     keycloak.updateToken(70).success((refreshed) => {
//       if (refreshed) {
//         Vue.$log.debug('Token refreshed' + refreshed);
//       } else {
//         Vue.$log.warn('Token not refreshed, valid for '
//           + Math.round(keycloak.tokenParsed.exp + keycloak.timeSkew - new Date().getTime() / 1000) + ' seconds');
//       }
//     }).error(() => {
//       Vue.$log.error('Failed to refresh token');
//     });


//   }, 60000)

// }).error(() => {
//   Vue.$log.error("Authenticated Failed");
// });


new Vue({
  render: h => h(App),
}).$mount('#app')