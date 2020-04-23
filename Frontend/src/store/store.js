import Vue from "vue";
import Vuex from "vuex";
import * as greeting from "@/store/modules/greeting.js";

Vue.use(Vuex);

export default new Vuex.Store({
  modules: {
    greeting
  },
  state: {}
});
