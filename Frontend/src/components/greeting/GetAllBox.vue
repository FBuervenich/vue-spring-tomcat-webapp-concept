<template>
  <div class="wzl-box" id="get-all">
    <h1>GET-Request ohne Parameter</h1>
    <table class="wzl-table" id="greetings">
      <thead>
        <tr>
          <th>id</th>
          <th>content</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="greeting in greetings" :key="greeting.id">
          <td>{{ greeting.id }}</td>
          <td>{{ greeting.content }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: "GreetingGetAllBox",
  props: {},
  data: function() {
    return {
      greetings: []
    };
  },
  created: function() {
    this.reloadGreetings();
  },
  methods: {
    reloadGreetings: function() {
      fetch("greetings", { method: "GET" })
        .then(response => {
          return response.json();
        })
        .then(json => {
          this.greetings = json;
        });
    }
  }
};
</script>

<style scoped>
.wzl-table {
  width: 100%;
  height:500px;
  overflow-y: scroll;
}

</style>
