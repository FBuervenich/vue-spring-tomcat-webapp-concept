<template>
  <div class="wzl-box">
    <h1>DELETE-Request</h1>
    <form id="delete" action="greeting" method="DELETE" @submit.prevent>
      <label for="id">id</label>
      <input v-model="id" id="id" name="id" type="text" />
      <input v-on:click="deleteGreeting" class="wzl-button" type="submit" />
    </form>
  </div>
</template>

<script>
const axios = require("axios");

export default {
  name: "GreetingDeleteBox",
  props: {},
  data: function() {
    return {
      id: 1
    };
  },
  methods: {
    deleteGreeting: function() {
      axios.delete(`greetings/${this.id}`).then(() => {
        // TODO reload getAllBox
      });
    }
  }
};
</script>

<style scoped>
</style>
