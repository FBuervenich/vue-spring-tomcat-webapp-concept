<template>
  <table v-if="tableData.length > 0" class="wzl-table" :id="id">
    <thead>
      <tr>
        <th v-for="key in Object.keys(tableData[0])" :key="key">{{ key }}</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="object in tableData" :key="object[Object.keys(object)[0]]">
        <td
          v-for="key in Object.keys(object)"
          :key="key + object[Object.keys(object)[0]]"
        >
          {{ object[key] }}
        </td>
      </tr>
    </tbody>
  </table>
</template>

<script>
/**
 * A standard WZL-Table that automatically builds by using an array of JSON-objects.
 * In order to function properly, the JSON-Objects should all have the same structure.
 */
export default {
  name: "WzlJsonTable",
  props: {
    id: String,
    tableData: Array,
  },
  methods: {},
};
</script>

<style scoped>
.wzl-table {
  width: 100%;
  overflow-y: scroll;
}
</style>
