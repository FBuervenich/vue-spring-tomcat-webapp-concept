<template>
  <div class="wzl-box" id="get-all">
    <h1>GET-Request ohne Parameter</h1>
    <table class="wzl-table" id="greetings">
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
  name: "GreetingGetAllBox",
  props: {},
  data: function() {
    return {
      greetings: []
    };
  },
  created: function() {
    this.reloadGreetings();
  },
  methods: {
    reloadGreetings: function() {
      axios.get("greetings").then(response => {
        this.greetings = response.data;
      });
    }
  }
};
</script>

<style scoped>
.wzl-table {
  width: 100%;
  height: 500px;
  overflow-y: scroll;
}
</style>
