<template>
  <div class="wzl-box">
    <h1>POST-Request</h1>
    <form id="post" action="greetings" method="POST" @submit.prevent>
      <label for="content">content:</label>
      <WzlInput placeholder="ID eingeben" v-model="content" type="text" />
      <WzlButton type="submit" v-bind:clickEvent="postNewGreeting" />
    </form>
  </div>
</template>

<script>
const axios = require("axios");

export default {
  name: "GreetingPostBox",
  props: {},
  data: function() {
    return {
      content: "Beispielname"
    };
  },
  methods: {
    postNewGreeting: function() {
      let data = {
        content: this.content
      };
      axios.post("greetings", data).then(() => {
        this.content = "";
        // TODO reload getAllBox
        // https://vuejs.org/v2/guide/state-management.html
      });
    }
  }
};
</script>

<style scoped></style>
