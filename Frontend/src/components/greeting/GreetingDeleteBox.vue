<template>
  <div class="wzl-box">
    <h1>DELETE-Request</h1>
    <form id="delete" action="greeting" method="DELETE" @submit.prevent>
      <label for="id">id</label>
      <input v-model="id" id="id" name="id" type="text" />
      <WZLButton type="submit" v-bind:clickEvent="deleteGreeting"/>
    </form>
  </div>
</template>

<script>
import WZLButton from "@/components/ui/WZLButton";
const axios = require("axios");

export default {
  name: "GreetingDeleteBox",
  components: {
    WZLButton
  },
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
