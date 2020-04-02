<template>
  <div class="wzl-box">
    <h1>PUT-Request</h1>
    <form id="put" action="api/greeting" method="PUT">
      <label for="id">id</label>
      <input id="id" name="id" type="text" />
      <label for="content">content</label>
      <input id="content" name="content" type="text" />
      <input class="wzl-button" type="submit" />
    </form>
  </div>
</template>

<script>
export default {
  name: "GreetingPutBox",
  props: {}
};
</script>

<style scoped>

</style>
