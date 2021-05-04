<!-- modal will be used for the alert pop-ups and in case someone needs to register an account -->

<template>
  <form class="form-signin" @submit.prevent="login">
    

    <!--this is initial alert--><div class="alert alert-danger" role="alert" v-if="invalidCredentials">Invalid username and password!</div>
    <div class="alert alert-dismissible alert-danger">
      <button type="button" class="close" data-dismiss="alert">&times;</button>
      <strong>Oh snap!</strong> <a href="#" class="alert-link">Change a few things up</a> and try submitting again.
    </div>

    <!--this is initial alert--><div class="alert alert-success" role="alert" v-if="this.$route.query.registration">Thank you for registering, please sign in.</div>
    <div class="alert alert-dismissible alert-success">
      <button type="button" class="close" data-dismiss="alert">&times;</button>
      <strong>Well done!</strong> You successfully read <a href="#" class="alert-link">this important alert message</a>.
    </div>

    <div id="username-input">
      <label for="username" class="sr-only">Username </label>
      <input type="text" id="username" class="form-control" placeholder="Username" v-model="user.username" required autofocus/>
    </div>

    <div id="password-input">
      <label for="password" class="sr-only">Password</label>
      <input type="password" id="password" class="form-control" placeholder="Password" v-model="user.password" required/>
    </div>

</template>

<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
    data() {
      return {
        user: {
          username: "",
          password: ""
        },
        invalidCredentials: false
      };
    },
  methods: {
    login() {
      authService
          .login(this.user)
          .then(response => {
            if (response.status == 200) {
              this.$store.commit("SET_AUTH_TOKEN", response.data.token);
              this.$store.commit("SET_USER", response.data.user);
              this.$router.push("/");
            }
          })
          .catch(error => {
            const response = error.response;

            if (response.status === 401) {
              this.invalidCredentials = true;
            }
          });
      }
    }
  };

</script>


<style>

</style>