
<template>
  <div>
    <label for="id">id</label>
    <input v-model="id" id="id" name="id" type="text" />
  </div>
</template>

<script>
export default {
  name: "WZLInput",
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
