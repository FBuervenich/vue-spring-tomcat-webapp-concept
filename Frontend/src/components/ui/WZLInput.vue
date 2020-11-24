<template>
  <div>
    <input
      :id="id"
      :class="classList"
      :type="type"
      :placeholder="placeholder"
      :value="value"
      @change="$emit('change', $event.target.value)"
    />
  </div>
</template>

<script>
export default {
  name: "WzlInput",
  model: {
    prop: "value",
    event: "change",
  },
  props: {
    value: String,
    type: {
      type: String,
      default: "text",
    },
    id: String,
    placeholder: String,
    classList: String,
  },
  methods: {},
};
</script>

<style scoped></style>
