<template>
  <div id="app" class="main-app">

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor03" aria-controls="navbarColor03" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarColor03">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">About</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">To-Do Lists</a>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="#">Self</a>
                <a class="dropdown-item" href="#">Kids</a>
                <a class="dropdown-item" href="#">Family</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">Separated link</a>
              </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Tips on Multi-Tasking</a>
              </li>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="text" placeholder="Username">
            <input class="form-control mr-sm-2" type="text" placeholder="Password">
            <button class="btn btn-secondary my-2 my-sm-0" type="submit">Login</button>
          </form>
        </div>
      </nav>

    <div class="jumbotron">
        <h4 class="display-3">Parent Brain</h4>
        <p class="lead">The to-do list for busy parents. Because you can't help others until you help yourself.</p>
        <hr class="my-4">
        <p>Use it to manage your task list, your kids' activities, and your family's to-dos.</p>
        <p class="lead">
          <a class="btn btn-info btn-lg" href="#" role="button">Self</a>
          <a class="btn btn-warning btn-lg" href="#" role="button">Kids</a>
          <a class="btn btn-success btn-lg" href="#" role="button">Family</a>
        </p>
    </div>

    <router-view/>

    <footer>
      <div>Parent Brain @ Copyright 2021</div>
    </footer>
  </div>
</template>

<script>


</script>

<style>



</style>