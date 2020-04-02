<template>
  <div class="wzl-box">
    <h1>DELETE-Request</h1>
    <form id="delete" action="api/greeting" method="DELETE">
      <label for="id">id</label>
      <input id="id" name="id" type="text" />
      <input class="wzl-button" type="submit" />
    </form>
  </div>
</template>

<script>
export default {
  name: "GreetingDeleteBox",
  props: {}
};
</script>

<style scoped>
</style>
