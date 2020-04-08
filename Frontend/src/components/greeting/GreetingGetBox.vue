<template>
  <div class="wzl-box">
    <h1>GET-Request mit Parameter id = </h1>
    <input v-model="id" placeholder="edit id" @change="loadGreetingById" />
    <table class="wzl-table" id="greeting">
      <thead>
        <tr>
          <th>id</th>
          <th>content</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="greeting in greetings" :key="greeting.id">
          <td>{{ greeting.id }}</td>
          <td>{{ greeting.content }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
const axios = require("axios");

export default {
  name: "GreetingGetBox",
  props: {},
  data: function() {
    return {
      id: 1,
      greetings: []
    };
  },
  methods: {
    loadGreetingById: function() {
      axios.get(`greetings/${this.id}`).then(response => {
        this.greetings.push(response.data);
      });
    }
  }
};
</script>

<style scoped>
</style>
