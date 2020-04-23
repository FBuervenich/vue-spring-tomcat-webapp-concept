import axios from "axios";

const apiClient = axios.create({
  baseURL: ``,
  withCredentials: false, // This is the default
  headers: {
    Accept: "application/json",
    "Content-Type": "application/json"
  }
});

function wrapRequestData(data) {
  return {
    content: data
  };
}

export default {
  getGreetings() {
    return apiClient.get("greetings");
  },
  getGreeting(id) {
    return apiClient.get("greetings/" + id);
  },
  postGreeting(greeting) {
    return apiClient.post("greetings", wrapRequestData(greeting));
  },
  putGreeting(id, greeting) {
    return apiClient.put("greetings/" + id, wrapRequestData(greeting));
  },
  deleteGreeting(id) {
    return apiClient.delete("greetings/" + id);
  }
};
