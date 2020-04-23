import Vue from "vue";
import App from "./App.vue";
import upperFirst from "lodash/upperFirst";
import camelCase from "lodash/camelCase";
import store from "./store/store";
// import Keycloak from 'keycloak'
import VueLogger from "vuejs-logger";

Vue.config.productionTip = false;
Vue.use(VueLogger);

// global wzl components
const requireComponent = require.context(
  "./components/ui",
  false,
  /Wzl[A-Z]\w+\.(vue|js)$/
);
requireComponent.keys().forEach(fileName => {
  const componentConfig = requireComponent(fileName);

  const componentName = upperFirst(
    camelCase(fileName.replace(/^\.\/(.*)\.\w+$/, "$1"))
  );

  Vue.component(componentName, componentConfig.default || componentConfig);
});

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

//   new Vue({
//     render: h => h(App),
//   }).$mount('#app')

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
  store,
  render: h => h(App)
}).$mount("#app");
