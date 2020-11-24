<template>
  <div class="wzl-box" id="get-all">
    <h1>GET-Request ohne Parameter</h1>
    <WzlJsonTable id="AllGreetingsTable" :tableData="greeting.greetings" />
  </div>
</template>

<script>
import { mapState } from "vuex";

export default {
  name: "GreetingGetAllBox",
  components: {},
  props: {},
  data: function() {
    return {
      greetings: []
    };
  },
  created: function() {
    this.$store.dispatch("greeting/fetchGreetings");
  },
  methods: {},
  computed: {
    ...mapState(["greeting"])
  }
};
</script>

<style scoped></style>
