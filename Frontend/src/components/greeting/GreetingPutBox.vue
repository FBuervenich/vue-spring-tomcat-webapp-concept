<template>
  <div class="wzl-box">
    <h1>PUT-Request</h1>
    <form id="put" action="greeting" method="PUT" @submit.prevent>
      <label for="id">id</label>
      <WzlInput id="id" placeholder="ID eingeben" v-model="id" type="number" />
      <label for="content">content</label>
      <WzlInput placeholder="ID eingeben" v-model="content" type="text" />
      <WzlButton type="submit" v-bind:clickEvent="putGreeting" />
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
      id: "1",
      content: "Beispielname",
    };
  },
  methods: {
    putGreeting: function() {
      let data = {
        content: this.content,
      };
      axios.put(`greetings/${this.id}`, data).then(() => {
        this.content = "";
        // TODO reload getAllBox
      });
    },
  },
};
</script>

<style scoped></style>
