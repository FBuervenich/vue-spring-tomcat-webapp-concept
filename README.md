# Springboot test app with Vue.js backend

This is a proof-of-concept for a Vue.js webapp with a springboot-backend embedded into our current infrastructure.

## Frontend

### Setup
```
cd Frontend
npm install
```

### Compiles and hot-reloads for development
```
cd Frontend
npm run serve
```

### Compiles and minifies for production
(Only required for deployment)
```
cd Frontend
npm run build
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).

## Backend

The backend can be used like any normal Maven-App. Simply load it into Netbeans (or similar IDE) and run it from there.


## API-Requests

API-Requests (requests from the frontend to the backend) can be performed as usual. The proxy built into the Dev-Server handles the connection.

Sample *GET-Request* to fetch all *greeting*-entities:

```javascript
fetch("greetings");
```