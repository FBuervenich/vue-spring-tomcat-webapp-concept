<template>
  <div class="wzl-box">
    <h1>POST-Request</h1>
    <form id="post" action="api/greeting" method="POST">
      <label for="content">content</label>
      <input id="content" name="content" type="text" />
      <input class="wzl-button" type="submit" />
    </form>
  </div>
</template>

<script>
export default {
  name: "GreetingPostBox",
  props: {}
};
</script>

<style scoped>
</style>
