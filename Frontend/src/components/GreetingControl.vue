<template>
  <div class="wrapper">
    <GreetingGetAllBox />
    <GreetingGetBox />
    <GreetingPostBox />
    <GreetingPutBox />
    <GreetingDeleteBox />
  </div>
</template>

<script>
import GreetingGetAllBox from "./GreetingGetAllBox.vue";
import GreetingGetBox from "./GreetingGetBox.vue";
import GreetingPostBox from "./GreetingPostBox.vue";
import GreetingPutBox from "./GreetingPutBox.vue";
import GreetingDeleteBox from "./GreetingDeleteBox.vue";

export default {
  name: "GreetingControl",
  components: {
    GreetingGetAllBox,
    GreetingGetBox,
    GreetingPostBox,
    GreetingPutBox,
    GreetingDeleteBox
  },
  props: {}
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.wrapper {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-rows: 1fr 1fr;
}

.wzl-box {
  padding: 25px;
  margin: 25px;
}

#get-all {
  grid-row-end: 3;
  grid-row-start: 1;
}

form {
  display: grid;
  grid-template-columns: 1fr 1fr;
}

form > input[type="submit"] {
  grid-column-start: 2;
  grid-column-end: 3;
}
</style>
