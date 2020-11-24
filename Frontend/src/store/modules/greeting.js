import GreetingService from "@/services/GreetingService.js";

export const namespaced = true;

export const state = {
  greetings: [],
  greetingsTotal: 0,
  greeting: {}
};

export const mutations = {
  ADD_GREETING(state, greeting) {
    state.greetings.push(greeting);
  },
  SET_GREETINGS(state, greetings) {
    state.greetings = greetings;
  },
  SET_GREETINGS_TOTAL(state, greetingsTotal) {
    state.greetingsTotal = greetingsTotal;
  },
  SET_GREETING(state, greeting) {
    state.greeting = greeting;
  }
};

export const actions = {
  createGreeting({ commit }, greeting) {
    return GreetingService.postGreeting(greeting)
      .then(() => {
        commit("ADD_GREETING", event);
      })
      .catch(error => {
        alert("There was a problem creating your greeting: " + error.message);
        throw error;
      });
  },
  fetchGreetings({ commit }) {
    return GreetingService.getGreetings()
      .then(response => {
        commit("SET_GREETINGS_TOTAL", response.data.length);
        commit("SET_GREETINGS", response.data);
      })
      .catch(error => {
        alert("There was a problem fetching events: " + error.message);
      });
  },
  fetchGreeting({ commit }, id) {
    return GreetingService.getGreeting(id)
      .then(response => {
        commit("SET_GREETING", response.data);
      })
      .catch(error => {
        alert("There was a problem fetching event: " + error.message);
      });
  }
};

export const getters = {
  getGreetingById: state => id => {
    return state.greetings.find(greeting => greeting.id === id);
  }
};
