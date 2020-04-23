<template>
  <div class="wzl-box">
    <h1>GET-Request mit Parameter id =</h1>
    <WzlInput
      placeholder="ID eingeben"
      v-model="id"
      type="number"
      @change="loadGreeting"
    />
    <WzlJsonTable :tableData="[this.greeting]" />
  </div>
</template>

<script>
import { mapState, mapActions } from "vuex";

export default {
  name: "GreetingGetBox",
  props: {},
  data: function() {
    return {
      id: "1"
    };
  },
  computed: mapState({
    greeting: state => state.greeting.greeting
  }),
  methods: {
    loadGreeting: function() {
      this.fetchGreeting(this.id);
    },
    ...mapActions("greeting", ["fetchGreeting"])
  }
};
</script>

<style scoped></style>
