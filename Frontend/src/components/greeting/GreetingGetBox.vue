<template>
  <div class="wzl-box">
    <h1>GET-Request mit Parameter id =</h1>
    <WzlInput
      placeholder="ID eingeben"
      v-model="id"
      type="number"
      @change="loadGreetingById"
    />
    <WzlJsonTable :tableData="this.greetings" />
  </div>
</template>

<script>
const axios = require("axios");

export default {
  name: "GreetingGetBox",
  props: {},
  data: function() {
    return {
      id: "1",
      greetings: [],
    };
  },
  methods: {
    loadGreetingById: function() {
      axios.get(`greetings/${this.id}`).then((response) => {
        this.greetings.push(response.data);
      });
    },
  },
};
</script>

<style scoped></style>
