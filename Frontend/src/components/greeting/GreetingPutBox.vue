<template>
  <div class="wzl-box">
    <h1>PUT-Request</h1>
    <form id="put" action="greeting" method="PUT" @submit.prevent>
      <label for="id">id</label>
      <input v-model="id" id="id" name="id" type="text" />
      <label for="content">content</label>
      <input v-model="content" id="content" name="content" type="text" />
      <input class="wzl-button" type="submit" v-on:click="putGreeting" />
    </form>
  </div>
</template>

<script>
const axios = require("axios");

export default {
  name: "GreetingPutBox",
  props: {},
  data: function() {
    return {
      id: 1,
      content: "Beispielname"
    };
  },
  methods: {
    putGreeting: function() {
      let data = {
        content: this.content
      };
      axios.put(`greetings/${this.id}`, data).then(() => {
        this.content = "";
        // TODO reload getAllBox
      });
    }
  }
};
</script>

<style scoped>
</style>
