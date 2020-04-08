<template>
  <input v-on:click="clickEvent" :class="`wzl-button ${classList}`" :type="type" />
</template>

<script>

export default {
  name: "WZLButton",
  props: {
    clickEvent: Function,
    type: String,
    classList: String
  },
  methods: {}
};
</script>

<style scoped>
</style>
