<template>
  <div class="wzl-box" id="get-all">
    <h1>GET-Request ohne Parameter</h1>
    <WzlJsonTable id="AllGreetingsTable" :tableData="this.greetings" />
  </div>
</template>

<script>
const axios = require("axios");

export default {
  name: "GreetingGetAllBox",
  components: {},
  props: {},
  data: function() {
    return {
      greetings: [],
    };
  },
  created: function() {
    this.reloadGreetings();
  },
  methods: {
    reloadGreetings: function() {
      axios.get("greetings").then((response) => {
        this.greetings = response.data;
      });
    },
  },
};
</script>

<style scoped></style>
