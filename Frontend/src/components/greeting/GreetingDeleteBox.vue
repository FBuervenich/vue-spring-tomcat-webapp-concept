<template>
  <div class="wzl-box">
    <h1>DELETE-Request</h1>
    <form id="delete" action="greeting" method="DELETE" @submit.prevent>
      <label for="id">id</label>
      <input v-model="id" id="id" name="id" type="text" />
      <WzlButton type="submit" v-bind:clickEvent="deleteGreeting" />
    </form>
  </div>
</template>

<script>
import GreetingService from "@/services/GreetingService";

export default {
  name: "GreetingDeleteBox",
  components: {},
  props: {},
  data: function() {
    return {
      id: 1
    };
  },
  methods: {
    deleteGreeting: function() {
      GreetingService.deleteGreeting(this.id).then(() => {
        GreetingService.getGreetings();
      });
    }
  }
};
</script>

<style scoped></style>
